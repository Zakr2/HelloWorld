<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <title>Hi</title>
    </head>
<body>
<header>
    <spring:message code="authorProject"/> - <spring:message code="authorName"/> <select><form>
    <option disabled="disabled" selected="selected"><spring:message code="chooseLanguage"/></option>
    <option><spring:message code="english"/></option>
    <option><spring:message code="russian"/></option>
</form></select>
</header>
<h1><spring:message code="helloWorld"/></h1>
<form name="test" method="get" action="/Submit">
    <p><b><spring:message code="inputDateOfBirth"/></b><br>
        <input type="text" size="40" name="date">
    </p>
    <p><input type="submit" value=<spring:message code="submit"/>></p>
</form>
<p>${birthdayAndAge}</p>
<footer><spring:message code="versionOfMaven"/> - ${myVersion}</footer>
</body>
</html>