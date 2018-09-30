package controllers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateCalculateTest {

    @Test
    public void isDateValidate1() {
        Assert.assertEquals(true,new DateCalculate().isDateValidate("26/06/2000"));
    }
    @Test
    public void isDateValidate2() {
        Assert.assertEquals(true,new DateCalculate().isDateValidate("26-06-2000"));
    }
    @Test
    public void isDateValidate3() {
        Assert.assertEquals(false,new DateCalculate().isDateValidate("s,gjjlsg"));
    }
    @Test
    public void isDateValidate4() {
        Assert.assertEquals(false,new DateCalculate().isDateValidate("26/06-2000"));
    }
    @Test
    public void isDateValidate5() {
        Assert.assertEquals(true,new DateCalculate().isDateValidate("29/02/1980"));
    }
    @Test
    public void isDateValidate6() {
        Assert.assertEquals(false,new DateCalculate().isDateValidate("30/02/1980"));
    }


    @Test
    public void ageAndBirthdayCalculate1() {
        Assert.assertEquals("Age - 18, Days to birthday - 268",new DateCalculate().ageAndBirthdayCalculate("26/06/2000"));
    }
    @Test
    public void ageAndBirthdayCalculate2() {
        Assert.assertEquals("Age - 18, Days to birthday - 268",new DateCalculate().ageAndBirthdayCalculate("26-06-2000"));
    }
    @Test
    public void ageAndBirthdayCalculate3() {
        Assert.assertEquals("Age - 18, Days to birthday - 218",new DateCalculate().ageAndBirthdayCalculate("7-5-2000"));
    }
    @Test
    public void ageAndBirthdayCalculate4() {
        Assert.assertEquals("Age - 38, Days to birthday - 151",new DateCalculate().ageAndBirthdayCalculate("29/02/80"));
    }
    @Test
    public void ageAndBirthdayCalculate5() {
        Assert.assertEquals("Age - 5, Days to birthday - 72",new DateCalculate().ageAndBirthdayCalculate("12/12/12"));
    }
    @Test
    public void ageAndBirthdayCalculate6() {
        Assert.assertEquals("Age - 2, Days to birthday - 364",new DateCalculate().ageAndBirthdayCalculate("30/09/16"));
    }

}