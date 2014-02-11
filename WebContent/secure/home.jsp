<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta charset="UTF-8">
<title>Super Store</title>
<head>
<title>Shopping</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<link rel="shortcut icon"
	href="<c:url value="/css/images/favicon.ico"/>" />
<link rel="stylesheet" href="<c:url value="/css/style.css"/>"
	type="text../css" media="all" />
<!--[if IE 6]>
	<link rel="stylesheet" href="./css/ie6.css" type="text../css" media="all" />	
	<![endif]-->
<link rel="stylesheet" href="css/jquery.jscrollpane.css"
	type="text../css" media="all" />
<script src="<c:url value="/js/jquery-1.7.min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/DD_belatedPNG-min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jscrollpane.min.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/jquery.jcarousel.js"/>"
	type="text/javascript"></script>
<script src="<c:url value="/js/functions.js"/>" type="text/javascript"></script>
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">
		<div id="wrapper-bottom">
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<!-- Logo -->
					<h1 id="logo">
						<a title="Home" href="#">accessories store</a>
					</h1>
					<p class="shopping-cart">
						<a class="cart" href="#" title="Your Shopping Cart">Your
							Shopping Cart</a><span>Articles:</span>&nbsp;4<span>Cost:</span>&nbsp;$59.99
					</p>
					<!-- Search -->
					<div class="search-expand"></div>
					<div id="search">
						<div class="retract-button">
							<p>retract</p>
						</div>
						<form action="" method="post">
							<input type="text" class="field" value="Search" title="Search" />
							<input type="submit" value="" class="submit-button" />
						</form>
					</div>
					<!-- END Search -->
					<div class="cl"></div>
					<!-- Navigation -->
					<div id="navigation">
						<ul>
							<li><a title="Home" href="#">Home</a></li>
							<li><a title="Sales" href="#">Sales</a></li>
							<li><a title="Catalog" href="#">Catalog</a></li>
							<li><a title="Blog" href="#">Blog</a></li>
							<li><a title="About Us" href="#">About Us</a></li>
						</ul>
					</div>
					<div class="cl"></div>
					<!-- END Navigation -->
					<!-- Dropdown Navigation -->
					<div id="sort-nav">
						<span class="label-left"></span>
						<div class="label-bg">
							<ul>
								<li><a title="Collections" href="#">Collections</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
										</ul>
									</div></li>
								<li><a title="Brand" href="#">Brands</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
										</ul>
									</div></li>
								<li class="last"><a title="By Price" class="By Price"
									href="#">By Price</a>
									<div class="dd">
										<ul>
											<li><a title="Product" href="#">Product</a></li>
											<li><a title="Product" href="#">Product</a></li>
										</ul>
									</div></li>
							</ul>
						</div>
						<span class="label-right"></span>
					</div>
					<!-- END Dropdown Navigation -->
					<div class="cl"></div>
				</div>
				<!-- END Header -->
				<!-- Main -->
				<div id="main">
					<!-- Slider -->
					<div class="slider-holder">
						<div class="promo">
							<img src="../css/images/promo.jpg"
								alt="Big Sale This Week -30% OFF!" />
						</div>
						<div id="slider">
							<ul>
								<li><img src="../css/images/slide1.jpg"
									alt="colour pencils" title="" />
									<div class="caption">
										<h2>Some Tittle Goes Here</h2>
										<div class="text">
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Ut tempus malesuada lobortis. Sed id lobortis est.</p>
										</div>
										<div class="buy-now">
											<p>BUY NOW</p>
											<p class="price">
												$<span>0.99</span>
											</p>
										</div>
										<div class="cl"></div>
										<p>
											<strike>$1.29</strike>
										</p>
									</div></li>
								<li><img src="../css/images/slide2.jpg" alt="pencils"
									title="" />
									<div class="caption">
										<h2>Some Goes Here</h2>
										<div class="text">
											<p>Lorem dolor sit amet, consectetur adipiscing elit. Ut
												tempus malesuada lobortis. Sed id lobortis est.</p>
										</div>
										<div class="buy-now">
											<p>BUY NOW</p>
											<p class="price">
												$<span>0.99</span>
											</p>
										</div>
										<div class="cl"></div>
										<p>
											<strike>$1.29</strike>
										</p>
									</div></li>
								<li><img src="../css/images/slide1.jpg" alt="pencils" />
									<div class="caption">
										<h2>Some Tittle Goes Here</h2>
										<div class="text">
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Ut tempus malesuada lobortis. Sed id lobortis est.</p>
										</div>
										<div class="buy-now">
											<p>BUY NOW</p>
											<p class="price">
												$<span>0.99</span>
											</p>
										</div>
										<div class="cl"></div>
										<p>
											<strike>$1.29</strike>
										</p>
									</div></li>
								<li><img src="../css/images/slide2.jpg" alt="pencils" />
									<div class="caption">
										<h2>Some Goes Here</h2>
										<div class="text">
											<p>Lorem ipsum dolo adipiscing elit. Ut tempus malesuada
												lobortis. Sed id lobortis est.</p>
										</div>
										<div class="buy-now">
											<p>BUY NOW</p>
											<p class="price">
												$<span>0.99</span>
											</p>
										</div>
										<div class="cl"></div>
										<p>
											<strike>$1.29</strike>
										</p>
									</div></li>
								<li><img src="../css/images/slide1.jpg" alt="pencils" />
									<div class="caption">
										<h2>Some Tittle Goes Here</h2>
										<div class="text">
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Ut tempus malesuada lobortis. Sed id lobortis est.</p>
										</div>
										<div class="buy-now">
											<p>BUY NOW</p>
											<p class="price">
												$<span>0.99</span>
											</p>
										</div>
										<div class="cl"></div>
										<p>
											<strike>$1.29</strike>
										</p>
									</div></li>
							</ul>
						</div>
						<div class="cl"></div>
						<div class="jcarousel-control">
							<a title="Slide 1" href="#">1</a> <a title="Slide 2" href="#">2</a>
							<a title="Slide 3" href="#">3</a> <a title="Slide 4" href="#">4</a>
							<a title="Slide 5" href="#">5</a>
						</div>
					</div>
					<!-- END Slider -->
					<!-- Content -->
					<div id="content">
						<!-- Featured Products -->
						<div class="products-holder">
							<div class="top"></div>
							<div class="middle">
								<div class="label">
									<h3>Feature Products</h3>
								</div>
								<div class="cl"></div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/paperclip.jpg" alt="paperclip" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>XR-34</span>
										</p>
										<p>
											Peaces in Box: <span>12</span>
										</p>
										<p>
											Product code: <span>1215</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 01<sup>.69</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/pen.jpg" alt="pen" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>PgK</span>
										</p>
										<p>
											Peaces in Box: <span>100</span>
										</p>
										<p>
											Product code: <span>3275</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 00<sup>.99</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/markers.jpg" alt="markers" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>XZ-8</span>
										</p>
										<p>
											Peaces in Box: <span>48</span>
										</p>
										<p>
											Product code: <span>1456</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 01<sup>.69</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/eraser.jpg" alt="eraser" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>small</span>
										</p>
										<p>
											Peaces in Box: <span>20</span>
										</p>
										<p>
											Product code: <span>3256</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 00<sup>.29</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/marker.jpg" alt="marker" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>BX</span>
										</p>
										<p>
											Peaces in Box: <span>12</span>
										</p>
										<p>
											Product code: <span>1003</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 01<sup>.25</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/sharpener.jpg" alt="sharpener" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>XZ-4</span>
										</p>
										<p>
											Peaces in Box: <span>48</span>
										</p>
										<p>
											Product code: <span>1457</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 04<sup>.99</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/pens.jpg" alt="pens" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>gJ</span>
										</p>
										<p>
											Peaces in Box: <span>100</span>
										</p>
										<p>
											Product code: <span>3269</span>
										</p>
									</div>
									<div title="Details" class="price-box">
										<p>
											$<span class="price"> 01<sup>.25</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="product">
									<a title="Details" href="#"><img
										src="../css/images/perforator.jpg" alt="perforator" /></a>
									<div class="desc">
										<p class="name">Product Name</p>
										<p>
											Model: <span>XR-34</span>
										</p>
										<p>
											Peaces in Box: <span>12</span>
										</p>
										<p>
											Product code: <span>1215</span>
										</p>
									</div>
									<div class="price-box">
										<p>
											$<span class="price"> 00<sup>.59</sup></span>
										</p>
										<p class="per-peace">Per Peace</p>
									</div>
									<div class="cl"></div>
								</div>
								<div class="cl"></div>
							</div>
							<div class="bottom"></div>
						</div>
						<!-- END Featured Products -->
						<!-- Best Sellers -->
						<div class="products-holder">
							<div class="top"></div>
							<div class="best-sellers middle">
								<div class="label">
									<h3>Best Sellers</h3>
								</div>
								<div class="cl"></div>
								<!-- Scroll Pane -->
								<div class="left-border"></div>
								<div class="scroll-pane horizontal-only">
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/paperclip.jpg" alt="paperclip" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>XR-34</span>
											</p>
											<p>
												Peaces in Box: <span>12</span>
											</p>
											<p>
												Product code: <span>1215</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 01<sup>.69</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/pen.jpg" alt="pen" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>PgK</span>
											</p>
											<p>
												Peaces in Box: <span>100</span>
											</p>
											<p>
												Product code: <span>3275</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 00<sup>.99</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/markers.jpg" alt="markers" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>XZ-8</span>
											</p>
											<p>
												Peaces in Box: <span>48</span>
											</p>
											<p>
												Product code: <span>1456</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 01<sup>.69</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/eraser.jpg" alt="eraser" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>small</span>
											</p>
											<p>
												Peaces in Box: <span>20</span>
											</p>
											<p>
												Product code: <span>3256</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 00<sup>.29</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/pen.jpg" alt="pen" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>PgK</span>
											</p>
											<p>
												Peaces in Box: <span>100</span>
											</p>
											<p>
												Product code: <span>3275</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 00<sup>.99</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/markers.jpg" alt="markers" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>XZ-8</span>
											</p>
											<p>
												Peaces in Box: <span>48</span>
											</p>
											<p>
												Product code: <span>1456</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 01<sup>.69</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/eraser.jpg" alt="eraser" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>mall</span>
											</p>
											<p>
												Peaces in Box: <span>20</span>
											</p>
											<p>
												Product code: <span>3256</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 00<sup>.29</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/markers.jpg" alt="markers" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>XZ-8</span>
											</p>
											<p>
												Peaces in Box: <span>48</span>
											</p>
											<p>
												Product code: <span>1456</span>
											</p>
										</div>
										<div title="Details" class="price-box">
											<p>
												$<span class="price"> 01<sup>.69</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
									<div class="product">
										<a title="Details" href="#"><img
											src="../css/images/eraser.jpg" alt="eraser" /></a>
										<div class="desc">
											<p class="name">Product Name</p>
											<p>
												Model: <span>mall</span>
											</p>
											<p>
												Peaces in Box: <span>20</span>
											</p>
											<p>
												Product code: <span>3256</span>
											</p>
										</div>
										<div class="price-box">
											<p>
												$<span class="price"> 00<sup>.29</sup></span>
											</p>
											<p class="per-peace">Per Peace</p>
										</div>
									</div>
								</div>
								<!-- END Scroll Pane -->
								<div class="right-border"></div>
								<div class="cl"></div>
							</div>
							<div class="bottom"></div>
						</div>
						<!-- END Best Sellers -->
						<!-- Bottom Strip -->
						<div class="bottom-strip">
							<div class="box-holder left">
								<div class="box">
									<div class="top"></div>
									<div class="label">
										<h3>About Us</h3>
									</div>
									<div class="middle">
										<div class="text-widget">
											<p>
												<strong>Mauris euismod lorem </strong>at mauris gravida
												tincidunt. Maecenas purus arcu, luctus at suscipit tempor,
												pharetra et urna. Quisque molestie purus sit amet ligula
												varius a adipiscing ligula molestie. Morbi fermentum
												lobortis turpis mattis bibendum. In hac habitasse platea
											</p>
										</div>
										<a class="read-more" title="Read More" href="#">Read More</a>
									</div>
									<div class="bottom"></div>
								</div>
							</div>
							<div class="box-holder middle">
								<div class="box">
									<div class="top"></div>
									<div class="label">
										<h3>Newsletter</h3>
									</div>
									<div class="middle" id="newsletter">
										<div class="post">
											<p>
												<span>Subscribe to our newsletter</span>
											</p>
											<p>Praesent et ultrices turpis. Donec at est vel neque
												dictum aliquet.</p>
										</div>
										<div class="cl"></div>
										<form action="" method="post">
											<div class="field-holder">
												<input type="text" class="field" value="Your Email"
													title="Your Email" />
											</div>
											<div class="field-holder">
												<input type="text" class="field" value="Your Name"
													title="Your Name" />
											</div>
											<div class="submit-button">
												<input type="submit" value="Subscribe" />
											</div>
										</form>
										<div class="cl">&nbsp;</div>
									</div>
									<div class="bottom"></div>
								</div>
							</div>
							<div class="box-holder right">
								<div class="box">
									<div class="top"></div>
									<div class="label">
										<h3>Latest Posts</h3>
									</div>
									<div class="middle post-short">
										<div class="post">
											<p>
												<span>Aenean placerat</span>
											</p>
											<p>Vestibulum ante ipsum primis in faucibus orci luctus
												et ultrices posuere cubilia Curae tellus t turpisporttitor
												pulvinar ...</p>
											<a class="comments" href="#" title="comments">comments</a>
										</div>
										<div class="date-box">
											<p class="date">05.26</p>
											<p>2011</p>
										</div>
										<div class="cl"></div>
									</div>
									<div class="bottom"></div>
								</div>
							</div>
							<div class="cl"></div>
						</div>
						<!-- END Bottom Strip -->
					</div>
					<!-- END Content -->
				</div>
				<!-- END Main -->
			</div>
		</div>
		<div id="footer-push"></div>
	</div>
	<!-- END Wrapper -->
	<!-- Footer -->
	<div id="footer">
		<div class="shell">
			<a class="footer-logo" href="http:/../css-free-templates.com/"
				title="Home"><img src="../css/images/logo-footer.png" alt="Logo" /></a>
			<p id="bottom-nav">
				<a title="Home" href="#">Home</a><a title="Sales" href="#">Sales</a><a
					title="Catalog" href="#">Catalog</a><a title="Blog" href="#">Blog</a><a
					title="About Us" href="#">About Us</a><a
					title="Design by: CSS Free Templates"
					href="http:/../css-free-templates.com/">Design by: CSS Free
					Templates</a>
			</p>
			<div class="cl"></div>
		</div>
	</div>
	<!-- END Footer -->
</body>
</html>