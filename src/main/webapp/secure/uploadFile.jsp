<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Product Update</h2>
<s:form action="productUpdate" method="post" enctype="multipart/form-data">
    <s:file name="userImage" label="Product Image" />
    <s:submit value="Upload" align="center" />
</s:form>
</body>
</body>
</html>