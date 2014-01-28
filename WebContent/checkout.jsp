<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter your details</title>
</head>
<body>
<div id="user_details">
<s:form  action="complete" validate="true" cssStyle="margin-left:auto;margin-right:auto;" >
	
	<s:textfield label="Name"  name="name"></s:textfield>
	<s:textfield label="Surname" name="surname" ></s:textfield>
	<s:textfield label="Email"  name="email"></s:textfield>
	<s:textfield name="address" label="Address"></s:textfield>
	<s:textfield name="telephone" label="Telephone"></s:textfield>
	<s:submit value="Complete Order"></s:submit>
</s:form>
</div>

</body>
</html>