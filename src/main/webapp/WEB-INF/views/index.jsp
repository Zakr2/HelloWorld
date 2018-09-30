<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <title>Hi</title>
    </head>
<body>
<header>
    Author of project - Evgeniy Zakrevskiy <select><form>
    <option disabled="disabled" selected="selected">Choose language</option>
    <option>English</option>
    <option>Russian</option>
</form></select>
</header>
<h1>Hello World!</h1>
<form name="test" method="get" action="/Submit">
    <p><b>Input your date of birth:</b><br>
        <input type="text" size="40" name="date">
    </p>
    <p><input type="submit" value="Submit"></p>
</form>
<p>${birthdayAndAge}</p>
<footer>Version - ${myVersion}</footer>
</body>
</html>