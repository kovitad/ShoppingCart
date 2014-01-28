<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>E-shop</title>

<link type="text/css" rel="stylesheet" href="css/default.css" />
<link rel="stylesheet" type="text/css"
	href="css/jquery.lightbox-0.5.css" media="screen" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.lightbox-0.5.js"></script>
</head>
<body>

<div id="navigation">

<div id="products">

<table>
	<thead>
		<tr>
			<th>Image</th>
			<th>Description</th>
			<th>Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="product" items="${product_list}">
			<tr>
				<td><a href="${product.img}" class="lightbox"> <img
					width="60" height="60" src="${product.img}"></img></a></td>
				<td>${product.description}</td>
				<td>${product.price} &euro;</td>
				<td>
					<s:action name="addToCart"></s:action>
					<s:param name="id">${product.id}</s:param>
					<s:param name="description">${product.description}</s:param>
					<s:param name="price">${product.price} </s:param>
					<s:param name="img">${product.img}</s:param>
			   </td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</div>
<script type="text/javascript">
	$('a.lightbox').lightBox();
</script>
</body>
</html>