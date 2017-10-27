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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${basePath}/resources/css/style.css">
        <script type="text/javascript" src="${basePath}/resources/js/jquery-1.11.1.js"></script>
        <script type="text/javascript" src="${basePath}/resources/js/search-control.js"></script>
    </head>
    <body>
        <!-- <div class="front" style="display: none;">
            <div class="clearfix navbar">
                <div class="search">
                    <input type="text" name="search_movie" placeholder="search">
                    <button id="page_change"></button>
                </div>
            </div>
        </div> -->
        <div class="container" style="display: block;">
            <header class="clearfix navbar">
                <div class="search">
                    <button class="btn"></button>
                    <input type="text" id="search" name="search_movie" placeholder="search">
                </div>
            </header>
            <ul id="search_content"></ul>
            <div class="content" id="content">
                <!--视频列表区域-->
                <div class="video_list">
                    <!--单击事件后台跳转视频播放页-->
                    <div class="video_box" onclick="window.location.href = 'video.html'">
                        <div class="video_right">
                            <ul>
                                <li class="video_title">PR实现单人枪战短片</li>
                                <li>作者:<span>Author</span></li>
                                <li>浏览:<span>50</span></li>
                            </ul>
                        </div>
                        <div class="pic">
                            <img src="${basePath}/resources/images/2017-9-26132240-947.jpg">
                        </div>
                    </div>
                    <div class="video_box" onclick="window.location.href = 'video.html'">
                        <div class="video_right">
                            <ul>
                                <li class="video_title">PR实现单人枪战短片</li>
                                <li>作者:&nbsp;<span>Author</span></li>
                                <li>浏览:&nbsp;<span>50</span></li>
                            </ul>
                        </div>
                        <div class="pic">
                            <img src="${basePath}/resources/images/2017-9-26132240-947.jpg">
                        </div>
                    </div>
                </div>
            </div>
            <script type="text/javascript">
                $("#search").bind('focus', function (event) {
                    var search_name = $(this).context.value;
                    setTimeout(function () {
                        if (search_name == "") {
                            cleardata();
                        }
                        else {
                            $.post('${basePath}/movie/getmovie', {title: search_name}, function (data) {
                                $.each(data, function () {
                                    var tr = $("<tr/>");
                                    var td = $("<td/>");
                                    td.html(this).appendTo(tr);
                                    td.html(this).appendTo(tr);
                                    td.hover(function () {
                                        $(this).css({background: '#cdcdcd'});
                                    });
                                    td.mouseleave(function (event) {
                                        $(this).css({background: '#ffffff'});
                                    });
                                    td.click(function (event) {
                                        $('#search').val($(this).text());
                                        cleardata();
                                    });
                                    $('#search_content').append(tr);
                                });
                            }, 'json');
                        }
                    }, 500);
                });

                $('.btn').bind('click',function(event){
                    console.log(1);
                })  

                function cleardata() {
                    $('#search_content').empty();
                }   
            </script>
    </body>
</html>
