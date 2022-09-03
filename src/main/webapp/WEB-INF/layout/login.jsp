<%-- 
    Document   : login
    Created on : Aug 27, 2022, 10:47:57 PM
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center">Đăng nhập</h1>

<c:if test="${param.error != null}">
    <div class="alert alert-danger">Da co loi xay ra</div>
</c:if>
<c:url value="/user/login" var="action"/>
<form:form method="post" action="${action}">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" class="btn btn-primary" value="LOGIN"/>
    </div>
</form:form>