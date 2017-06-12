<%-- 
    Document   : Item_list
    Created on : 2017-6-11, 21:59:24
    Author     : huanlu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item lis</title>
    </head>
    <body>
        <a href="<c:url value="/item_add"/>">Item Add</a>
        <table>
            <tr>
                <th>ItemName</th>
                <th>Code</th>
                <th>Date_bought</th>
                <th>Num_total</th>
                <th>Status</th>
                <th>Category</th>
            </tr>
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.code}</td>
                    <td>${item.datebought}</td>
                    <td>${item.numTotal}</td>
                    <td>${item.status}</td>
                    <td>${item.category.name}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
