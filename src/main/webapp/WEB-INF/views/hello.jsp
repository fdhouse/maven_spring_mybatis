<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    ${now}
    <c:forEach items="${goods}" var="row" varStatus="key">
        <li>${row.title}</li>
    </c:forEach>
</ul>