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
        <title>VideoAdd Page</title>
    </head>
    <body>
        <form:form action="addmovie" method="post" commandName="movie" role="form">
            <div class="form-group">
                <label for="Title">Title:</label>
                <input type="text" class="form-control" id="title" name="title" placeholder="Movie Title:"/>
            </div>
            <div class="form-group">
                <label for="actor">Actor:</label>
                <input type="text" class="form-control" id="actor" name="majorActor" placeholder="Major Actor:"/>
            </div>
            <div class="form-group">
                <label for="content">Content:</label>
                <input type="text" class="form-control" id="content" name="content" placeholder="Movie Content:"/>
            </div>
            <div class="form-group">
                <label for="url">Url:</label>
                <input type="text" class="form-control" id="url" name="movieUrl" placeholder="Movie Url:"/>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-sm btn-success">Submit</button>
            </div>
        </form:form>
    </body>
</html>
