package controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class HomeController {
    @Value("${application.version}")
    private String buildVersion;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String view(ModelMap model){
        generalAttributes(model);
        model.addAttribute("birthdayAndAge","");
        return "index";
    }

    @RequestMapping(value = "/Submit",method = RequestMethod.GET)
    public String birthCalculating(ModelMap model, @RequestParam(value="date") String date){
        generalAttributes(model);
        if(new DateCalculate().isDateValidate(date))
            model.addAttribute("birthdayAndAge",new DateCalculate().ageAndBirthdayCalculate(date));
        else
            model.addAttribute("birthdayAndAge","Invalid Date");
        return "index";
    }
    private void generalAttributes(ModelMap model){
        Date currentTime=new Date();
        SimpleDateFormat myFormat=new SimpleDateFormat("HH:mm:ss");
        model.addAttribute("time",myFormat.format(currentTime));
        model.addAttribute("myVersion",buildVersion);
    }

}
