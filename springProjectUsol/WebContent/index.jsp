<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
* {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
}

.content {
	height: 435px;
	padding: 10px 0px;
	overflow: auto;
}

.nwsTit>a {
	font-size: 17px;
}

.content-c {
	border-bottom: 1px solid blue;
	padding: 20px 0px;
}

header {
	background-color: red;
	padding: 1px 0px;
}

.container-fluid {
	padding-right: 100px;
	padding-left: 100px;
	margin-right: auto;
	margin-left: auto;
}

.navbar {
	padding: 0 200px;
	margin-bottom: 0;
	border-radius: 0;
}
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}
/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	height: 100%;
	padding-bottom: 20px;
}
/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}
/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>

<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a class="active" href="#"><i
							class="fa fa-fw fa-home"></i> Home</a></li>
					<li><a class="active" href="#"><i class="fa fa-fw fa-home"></i>Category</a></li>
					<li><a class="active" href="#"><i class="fa fa-fw fa-home"></i>News</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="loginForm.htm"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid text-center">
		<div class="col-sm-8 sidenav">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<div class="item active">
					<%-- <img src="<c:url value="${img.imgUrl}" />" alt="Avatar"
				class="avatar"> --%>
						<img src="<c:url value="/resources/image/1.jpg" />" alt="Los Angeles" style="width: 100%;">
					</div>

					<div class="item">
						<img src="<c:url value="/resources/image/2.jpg" />" alt="Chicago" style="width: 100%;">
					</div>

					<div class="item">
						<img src="<c:url value="/resources/image/9.jpg" />" alt="New york" style="width: 100%;">
					</div>
				</div>
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="col-sm-4 sidenav">
			<header>
				<h3 class="title">NHIỀU NGƯỜI ĐỌC</h3>
			</header>
			<div class="content">
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/can-canh-ho-thuy-dien-hoa-binh-sat-muc-nuoc-chet-sau-30-nam-c46a1108863.html"
						title="Cận cảnh hồ thủy điện Hòa Bình sát mực nước chết sau 30 năm">Cận
							cảnh hồ thủy điện Hòa Bình sát mực nước chết sau 30 năm</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ly-ky-chuyen-tim-duoc-nguoi-than-mat-tich-5-nam-sau-vu-be-rua-khung-o-ho-guom-len-bo-c46a1109166.html"
						title="Ly kỳ chuyện tìm được người thân mất tích 5 năm sau vụ bế rùa “khủng” ở Hồ Gươm lên bờ">Ly
							kỳ chuyện tìm được người thân mất tích 5 năm sau vụ bế...</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/doi-tuyen-bong-da-nu-quoc-gia-duoc-thuong-22-ti-dong-c46a1109021.html"
						title="Đội tuyển bóng đá nữ Quốc gia được thưởng 22 tỉ đồng">Đội
							tuyển bóng đá nữ Quốc gia được thưởng 22 tỉ đồng</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ha-noi-thi-cong-vo-trach-nhiem-dung-may-thoi-bui-bay-len-troi-c46a1109023.html"
						title="Hà Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên trời">Hà
							Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên...</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ha-noi-thi-cong-vo-trach-nhiem-dung-may-thoi-bui-bay-len-troi-c46a1109023.html"
						title="Hà Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên trời">Hà
							Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên...</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ha-noi-thi-cong-vo-trach-nhiem-dung-may-thoi-bui-bay-len-troi-c46a1109023.html"
						title="Hà Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên trời">Hà
							Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên...</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ha-noi-thi-cong-vo-trach-nhiem-dung-may-thoi-bui-bay-len-troi-c46a1109023.html"
						title="Hà Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên trời">Hà
							Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên...</a>
					</span>
				</div>
				<div class="content-c">
					<span class="nwsTit"> <a
						href="https://www.24h.com.vn/tin-tuc-trong-ngay/ha-noi-thi-cong-vo-trach-nhiem-dung-may-thoi-bui-bay-len-troi-c46a1109023.html"
						title="Hà Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên trời">Hà
							Nội: Thi công vô trách nhiệm, dùng máy thổi bụi bay lên...</a>
					</span>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid">
		<div class="w3-container w3-content w3-padding-64" id="contact">
			<h2 class="w3-wide w3-center">CONTACT</h2>
			<p class="w3-opacity w3-center">
				<i>Fan? Drop a note!</i>
			</p>
			<div class="w3-row w3-padding-32">
				<div class="w3-col m6 w3-large w3-margin-bottom">
					<i class="fa fa-map-marker" style="width: 30px"></i> Chicago, US <br>
					<i class="fa fa-phone" style="width: 30px"></i> Phone: +00 151515 <br>
					<i class="fa fa-envelope" style="width: 30px"> </i> Email:
					mail@mail.com <br>
				</div>
				<div class="w3-col m6">
					<form action="/action_page.php" target="_blank">
						<div class="w3-row-padding" style="margin: 0 -16px 8px -16px">
							<div class="w3-half">
								<input class="w3-input w3-border" type="text" placeholder="Name"
									required name="Name">
							</div>
							<div class="w3-half">
								<input class="w3-input w3-border" type="text"
									placeholder="Email" required name="Email">
							</div>
						</div>
						<input class="w3-input w3-border" type="text"
							placeholder="Message" required name="Message">
						<button class="w3-button w3-black w3-section w3-right"
							type="submit">SEND</button>
					</form>
				</div>
			</div>
		</div>
		<!-- End Page Content -->
		</div>
	</footer>
</body>

</html>
