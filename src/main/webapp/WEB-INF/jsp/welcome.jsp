 
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
 <html>
 
 <head>
 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<body>welcome page</body>
</html>