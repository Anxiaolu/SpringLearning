<%-- 
    Document   : index
    Created on : 2017-6-9, 21:31:39
    Author     : huanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>314 Labmanagement</title>
    </head>
    <body>
        <form:form commandName="Stuff" action="usr_log" method="post">
            <fieldset>
                <h3>Log In</h3>
                <p>
                    <label for="username">UserName:</label>
                    <form:input id="username" path="username"/>
                </p>
                <p>
                    <label for="password">Password:</label>
                    <form:input id="password" path="password"/>
                </p>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4">
                    <input id="submit" type="submit" tabindex="5" value="Log In">
                </p>
            </fieldset>
        </form:form>
    </body>
</html>
