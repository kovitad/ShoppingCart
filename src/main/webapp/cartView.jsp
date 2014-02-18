<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="com.kovitad.model.Cart"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your shopping Cart</title>
<link type="text/css" rel="stylesheet" href="css/default.css" />
<s:head />
</head>
<body>
<div id="cart_view">Shopping Cart: <%
	//An to kalathi einai adeio tote tipose "Your Cart is empty"
	if (((Cart) session.getAttribute("cart")).getItems().size() == 0) {
%> Your Cart is empty <br />
<s:a action="viewProducts">Back to Products</s:a> <%
 	return;
 	}
 %>
<table>
	<thead>
		<tr>
			<th>Description</th>
			<th>Price</th>
			<th>Amount <s:fielderror /></th>
			<th></th>
		</tr>
	</thead>
	<tbody>

		
		<s:iterator var="item" value="#session['cart'].items">
			<tr>
				<td><s:property value="description" /></td>
				<td><s:property value="price" /> &euro;</td>
				<td><s:form action="changeAmount">
					<s:textfield name="amount" size="1"></s:textfield>
					<s:hidden name="id"></s:hidden>
					<s:submit value="Change Amount"></s:submit>
				</s:form></td>
				<td></td>
				<td><s:a action="removeFromCart">
		Remove
		<s:param name="id" value="#item.id"  />
				</s:a></td>
			</tr>
		</s:iterator>

	</tbody>
	<tfoot>
		<tr>
			<th>Total</th>
			<th><s:property value="#session['cart'].total_price" /> &euro; </th>
		</tr>
	</tfoot>
</table>
<s:form action="checkout">
<s:submit label="checkout" align="center" value="checkout"></s:submit>
</s:form>
 <s:a
	action="viewProducts">Back to Products</s:a></div>
</body>
</html>