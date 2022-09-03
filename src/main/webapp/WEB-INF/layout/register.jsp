<%-- 
    Document   : resigter
    Created on : Aug 28, 2022, 6:59:14 PM
    Author     : USER
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center">Đăng ký</h1>

<c:if test="${errMsg != null}">
    <div class="alert alert-danger">Da co loi xay ra</div>
</c:if>

<c:url value="/user/register" var="action"/>
<form:form method="post" action="${action}" modelAttribute="user">
    <div class="form-group">
        <label for="firstName">FirstName</label>
        <form:input type="text" id="firstName" path="firstName" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="lastName">LastName</label>
        <form:input type="text" id="lastName" path="lastName" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <form:input type="text" id="email" path="email" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" id="username" path="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="phone">Phone</label>
        <form:input type="number" id="phone" path="phone" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" id="password" path="password" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="confirm-password">Confirm-Password</label>
        <form:input type="password" id="confirm-password" path="confirmPassword" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" class="btn btn-primary" value="DANG KY"/>
    </div>
</form:form>
