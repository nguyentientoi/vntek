<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%
	request.setAttribute("contextPath", request.getContextPath());
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		
		<!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
	    <link href="${contextPath}/css/bootstrap.css" rel="stylesheet">
	
	    <!-- Custom CSS -->
	    <link href="${contextPath}/css/freelancer.css" rel="stylesheet">
	
	    <!-- Custom Fonts -->
	    <link href="${contextPath}/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
		
		
		<!-- jQuery -->
	    <script src="${contextPath}/js/jquery-1.11.3.min.js"></script>
	    <script src="${contextPath}/js/jquery-ui.min.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="${contextPath}/js/bootstrap.min.js"></script>
	
	    <!-- Plugin JavaScript -->
	    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	    <script src="${contextPath}/js/classie.js"></script>
	    <script src="${contextPath}/js/cbpAnimatedHeader.js"></script>
	
	    <!-- Contact Form JavaScript -->
	    <script src="${contextPath}/js/jqBootstrapValidation.js"></script>
	    <script src="${contextPath}/js/contact_me.js"></script>
	
	    <!-- Custom Theme JavaScript -->
	    <script src="${contextPath}/js/freelancer.js"></script>
		
	</head>
	<body id="page-top" class="index">
		
		<tiles:insertAttribute name="nav" />
		
		<tiles:insertAttribute name="body"/>
		
		<tiles:insertAttribute name="footer" />
	</body>
</html>