<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>Data List</title>

  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
<div class="container">
  <h1>Data管理</h1>
  <hr/>

  <h3>所有用户 <a href="addUser" type="button" class="btn btn-default btn-sm">添加</a></h3>

  <!-- 如果用户列表为空 -->
  <c:if test="${empty dataList}">
    <p class="bg-warning">
      <br/>
      Data表为空，请<a href="addUser" type="button" class="btn btn-default btn-sm">添加</a>
      <br/>
      <br/>
    </p>
  </c:if>

  <!-- 如果用户列表非空 -->
  <c:if test="${!empty dataList}">
    <table class="table table-bordered table-striped">
      <tr>
        <th>Company</th>
        <th></th>
        <th>密码</th>
        <th>操作</th>
      </tr>

      <c:forEach items="${dataList}" var="data">
        <tr>
          <td>${data.Company}</td>
          <td>${data.League}</td>
          <td>${data.Year}</td>
          <td>${data.Match}</td>
          <td>
            <a href="showUser/${data.id}" type="button" class="btn btn-sm btn-success">详情</a>
            <a href="updateUser/${data.id}" type="button" class="btn btn-sm btn-warning">修改</a>
            <a href="deleteUser/${data.id}" type="button" class="btn btn-sm btn-danger">删除</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </c:if>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
