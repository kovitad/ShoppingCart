<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta charset="UTF-8">
<title>Promotion</title>
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
			<li>Main navigation</li>
		</ul>
	</nav>
	<div id="content">
		<article>
			<hgroup>
				<h1>Article heading</h1>
				<h2>Article subheading</h2>
			</hgroup>
			<p>Some text</p>
			<section>
				<h2>Section heading</h2>
				<p>
					
				</p>
				<ol type="I">
					<li value="7">seventh item</li>
					<li>eighth item</li>
					<li>ninth item</li>
				</ol>
			</section>
			<section>
				<h2>Another section heading</h2>
				<p>A little more text</p>
			</section>
		</article>
		<blockquote>
			<p>
				<strong>Dogs are the best!</strong> They are <em>obviously</em> much
				cooler than monkeys, even if
				<mark>the first animal in space was a monkey</mark>
				.
			</p>
		</blockquote>
	</div>
	<footer id="footer">
		
	</footer>
</body>
</html>