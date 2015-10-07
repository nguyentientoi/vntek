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
	    <link href="${contextPath}/html/share/css/bootstrap.css" rel="stylesheet">
	
	    <!-- Custom CSS -->
	    <link href="${contextPath}/html/share/css/freelancer.css" rel="stylesheet">
	
	    <!-- Custom Fonts -->
	    <link href="${contextPath}/html/share/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	     <link href="${contextPath}/html/share/css/custom-font.css" rel="stylesheet" type="text/css">
		
		<!-- jQuery -->
	    <script src="${contextPath}/html/share/js/jquery-1.11.3.min.js"></script>
	    <script src="${contextPath}/html/share/js/jquery-ui.min.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="${contextPath}/html/share/js/bootstrap.min.js"></script>
	
	    <!-- Plugin JavaScript -->
	    <script src="${contextPath}/html/share/js/jquery.easing.min.js"></script>
	    <script src="${contextPath}/html/share/js/classie.js"></script>
	    <script src="${contextPath}/html/share/js/cbpAnimatedHeader.js"></script>
	
	    <!-- Contact Form JavaScript -->
	    <script src="${contextPath}/html/share/js/jqBootstrapValidation.js"></script>
	    <script src="${contextPath}/html/share/js/contact_me.js"></script>
	
	    <!-- Custom Theme JavaScript -->
	    <script src="${contextPath}/html/share/js/freelancer.js"></script>
		
	</head>
	<body id="page-top" class="index">
		
		<tiles:insertAttribute name="nav" />
		
		<tiles:insertAttribute name="body"/>
		
		<tiles:insertAttribute name="footer" />
	</body>
</html>