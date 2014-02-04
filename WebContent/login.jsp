<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
p {
	margin: 1.5em 0;
}

div {
	border: 5px solid rgba(0, 0, 0, 0.3);
	background: rgba(255, 255, 255, 0.2);
	padding: 0 20px;
	border-radius: 20px;
	box-shadow: 3px 3px 3px 2px rgba(0, 0, 0, 0.4) inset, 15px 15px 10px 5px
		rgba(0, 0, 0.1, 0.4);
}
</style>
</head>
<body>
	<header id="branding">
		<!-- page header (not in section etc) -->
		<h1>Shopping Store</h1>
	</header>
	<nav>
		<ul>
			<li>Login Page</li>
		</ul>
	</nav>
	<div id="content">
		<form name='f' action="<c:url value='j_spring_security_check' />"
			method='POST'>
			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='j_username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='j_password' /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit"
						value="submit" /> <input name="reset" type="reset" /></td>
				</tr>
			</table>
		</form>
	
	</div>
	<footer id="footer"> </footer>
</body>
</html>