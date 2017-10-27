<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>search</title>
        <meta content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0" name="viewport">
        <meta content="yes" name="apple-mobile-web-app-capable">
        <link rel="stylesheet" type="text/css" href="${basePath}/resources/css/style.css">
        <script type="text/javascript" src="${basePath}/resources/js/jquery-1.11.1.js"></script>
        <script type="text/javascript" src="${basePath}/resources/js/search-control.js"></script>
    </head>
    <body>
        <div class="container">
            <header class="clearfix navbar">
                <div class="back">
                    <button class="back" onclick="window.history.go(-1)"></button>
                </div>
                <h2 id="video_title">${movie.title}</h2>
            </header>
            <div class="video_play" id="content">
                <!--视频播放区域-->            
                <iframe src="${movie.url}"></iframe>
            </div>
        </div>
    </body>
</html>