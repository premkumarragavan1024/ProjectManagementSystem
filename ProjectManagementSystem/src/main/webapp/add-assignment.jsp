<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Basic Page Info -->
	<meta charset="utf-8">
	<title>PMS Admin Dashboard</title>

	<!-- Site favicon -->
	<link rel="apple-touch-icon" sizes="180x180" href="vendors/images/pmslogo.png">
	<link rel="icon" type="image/png" sizes="32x32" href="vendors/images/pmslogo.png">
	<link rel="icon" type="image/png" sizes="16x16" href="vendors/images/pmslogo.png">

	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="vendors/styles/core.css">
	<link rel="stylesheet" type="text/css" href="vendors/styles/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="src/plugins/jvectormap/jquery-jvectormap-2.0.3.css">
	<link rel="stylesheet" type="text/css" href="vendors/styles/style.css">

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-119386393-1"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag(){dataLayer.push(arguments);}
		gtag('js', new Date());

		gtag('config', 'UA-119386393-1');
	</script>
</head>
<body>
	<div class="pre-loader">
		<div class="pre-loader-box">
			<div class="loader-logo"><img src="vendors/images/pmslogo.png" style="height:100px; width:100px ;" alt=""></div>
			<div class='loader-progress' id="progress_div">
				<div class='bar' id='bar1'></div>
			</div>
			<div class='percent' id='percent1'>0%</div>
			<div class="loading-text">
				Loading...
			</div>
		</div>
	</div>

	<div class="header">
		<div class="header-left">
			<div class="menu-icon dw dw-menu"></div>
			<div class="search-toggle-icon dw dw-search2" data-toggle="header_search"></div>
			<div class="header-search">
				<form>
					<div class="form-group mb-0">
						<i class="dw dw-search2 search-icon"></i>
						<input type="text" class="form-control search-input" placeholder="Search Here">
						<div class="dropdown">
							<a class="dropdown-toggle no-arrow" href="#" role="button" data-toggle="dropdown">
								<i class="ion-arrow-down-c"></i>
							</a>
							<div class="dropdown-menu dropdown-menu-right">
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">From</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">To</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="form-group row">
									<label class="col-sm-12 col-md-2 col-form-label">Subject</label>
									<div class="col-sm-12 col-md-10">
										<input class="form-control form-control-sm form-control-line" type="text">
									</div>
								</div>
								<div class="text-right">
									<button class="btn btn-primary">Search</button>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="header-right">
			<div class="dashboard-setting user-notification">
				<div class="dropdown">
					<a class="dropdown-toggle no-arrow" href="javascript:;" data-toggle="right-sidebar">
						<i class="dw dw-settings2"></i>
					</a>
				</div>
			</div>
			<div class="user-notification">
				<div class="dropdown">
					<a class="dropdown-toggle no-arrow" href="#" role="button" data-toggle="dropdown">
						<i class="icon-copy dw dw-notification"></i>
						<span class="badge notification-active"></span>
					</a>
					<div class="dropdown-menu dropdown-menu-right">
						<div class="notification-list mx-h-350 customscroll">
							<ul>
								<li>
									<a href="#">
										<img src="vendors/images/img.jpg" alt="">
										<h3>John Doe</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
								<li>
									<a href="#">
										<img src="vendors/images/photo1.jpg" alt="">
										<h3>Lea R. Frith</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
								<li>
									<a href="#">
										<img src="vendors/images/photo2.jpg" alt="">
										<h3>Erik L. Richards</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
								<li>
									<a href="#">
										<img src="vendors/images/photo3.jpg" alt="">
										<h3>John Doe</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
								<li>
									<a href="#">
										<img src="vendors/images/photo4.jpg" alt="">
										<h3>Renee I. Hansen</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
								<li>
									<a href="#">
										<img src="vendors/images/img.jpg" alt="">
										<h3>Vicki M. Coleman</h3>
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed...</p>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="user-info-dropdown">
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button" data-toggle="dropdown">
						<span class="user-icon">
							<img src="vendors/images/photo1.jpg" alt="">
						</span>
						<span class="user-name">Ross C. Lopez</span>
					</a>
					<div class="dropdown-menu dropdown-menu-right dropdown-menu-icon-list">
						<a class="dropdown-item" href="profile.html"><i class="dw dw-user1"></i> Profile</a>
						<a class="dropdown-item" href="profile.html"><i class="dw dw-settings2"></i> Setting</a>
						<a class="dropdown-item" href="faq.html"><i class="dw dw-help"></i> Help</a>
						<a class="dropdown-item" href="login.html"><i class="dw dw-logout"></i> Log Out</a>
					</div>
				</div>
			</div>
			<div class="github-link">
				<a href="#" target="_blank"><img src="" alt=""></a>
			</div>
		</div>
	</div>

	<div class="left-side-bar">
		<div class="brand-logo bg-light">
			<a href="dashboard.html">
				<img src="vendors/images/pmslogo.png" style="height:50px; width:50px ;" alt="" class="dark-logo">
				<img src="vendors/images/pmslogo.png" style="height:50px; width:50px ;" alt="" class="light-logo">
				<h3 style="padding-left:20px ; color: rgb(66, 245, 66);">PMS</h3>
			</a>
			<div class="close-sidebar" data-toggle="left-sidebar-close">
				<i class="ion-close-round"></i>
			</div>
		</div>
		<div class="menu-block customscroll">
			<div class="sidebar-menu">
				<ul id="accordion-menu">
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-house-1"></span><span class="mtext">Home</span>
						</a>
						<ul class="submenu">
							<li><a href="dashboard.jsp">Dashboard</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-edit2"></span><span class="mtext">Manage Employee</span>
						</a>
						<ul class="submenu">
							<li><a href="add-employee.jsp"> Add New Employee</a></li>
							<li><a href="">List Of All Employee</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-library"></span><span class="mtext">Manage Project</span>
						</a>
						<ul class="submenu">
							<li><a href="add-project.jsp">Add Project</a></li>
							<li><a href="">List Of All Project</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-ticket-2"></span><span class="mtext">Assignments</span>
						</a>
						<ul class="submenu">
							<li><a class="active" href="add-assignment.jsp">Add Project Assignments</a></li>
							<li><a href="">Assignments List</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-ticket"></span><span class="mtext">Tickets & Bugs</span>
						</a>
						<ul class="submenu">
							<li><a href="add-ticket.jsp">Add Tickets</a></li>
							<li><a href="">List Of All Tickets</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-time-management"></span><span class="mtext">Manage TimeSheet</span>
						</a>
						<ul class="submenu">
							<li><a href="add-timesheed.jsp">Add TimeSheet</a></li>
							<li><a href="">List Of All TimeSheet</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="javascript:;" class="dropdown-toggle">
							<span class="micon dw dw-lifesaver"></span><span class="mtext">Manage Leave</span>
						</a>
						<ul class="submenu">
							<li><a href="add-leave.jsp">Add Employee Leave</a></li>
							<li><a href="">List Employee Leave</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="mobile-menu-overlay"></div>

	<div class="main-container">
		<div class="">
			<div class="page-header">
				<div class="row col-md-12">
					
					<div class="col-md-6 col-sm-12">
						 
							<div class="form-group" style="border-bottom: 3px solid black ;">
								<label><h3>Project Assignments</h3></label><br/>
								<small><span class="text-danger">
									<b>* denotes the field is mandatory.</b></span></small>
							</div>
						</div>
						<br/> 
						<div class=" col-md-4 justify-content-end align-content-end" style="float: right;"  >
							
							<div class="row" > 
							<nav aria-label="breadcrumb" role="navigation"  >
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="dashboard.html">Home</a></li>
								<li class="breadcrumb-item ">Assignment</li>
								<li class="breadcrumb-item active" aria-current="page">Add Assignment</li>
							</ol>
						</nav>
					</div>
					<div class="row  text-right" > 
						<div class="btn-group" role="group" aria-label="Basic example">
							<button type="button" class="btn btn-success" onclick="saveAssignment();"><i class="fa fa-save"></i>&nbsp;Save</button>
							<button type="button" class="btn btn-secondary"><i class="fa fa-edit"></i>&nbsp;Edit</button> 
							<button type="button" class="btn btn-danger"><i class="fa fa-trash"></i>&nbsp;Reset</button> 
						  </div>
					</div> 

					</div>
				</div>
			</div>
			</div>
		          
<form class="page-header" name="Assignment_form" id="Assignment_form" method="post">
    <div class="col-md-12 col-sm-12">
		<div class="row">
			<div class="col-md-4 col-sm-12 mt-3">
				<div class="form-group">
					<label><h6>Select Employee Code<span class="text-danger">*</span></h6></label>
					<div class="dropdown bootstrap-select form-control">
						<select name="Project_Manager" id="Project_Manager" class="selectpicker form-control" data-style="btn-outline-secondary" data-size="5" tabindex="-98">
						<optgroup>
							<option value="">Select Project Manager</option>
							<option value="001">001</option>
							<option value="002">002</option>
							<option value="003">003</option>
							<option value="004">004</option>
							<option value="005">005</option>
							<option value="006">006</option>
						</optgroup>
					</select>
				</div>
				</div>
			</div>
		</div>
		
    </div>
	<div class="row">
		<div class="col-md-4 col-sm-12 mt-3">
			<div class="form-group">
				<label><h6>Select Project Code<span class="text-danger">*</span></h6></label>
				<div class="dropdown bootstrap-select form-control">
					<select name="Project_cod" id="Project_cod" class="selectpicker form-control" data-style="btn-outline-secondary" data-size="5" tabindex="-98">
					<optgroup>
						<option value="">Select Project</option>
						<option value="001">001</option>
						<option value="002">002</option>
						<option value="003">003</option>
						<option value="004">004</option>
						<option value="005">005</option>
						<option value="006">006</option>
					</optgroup>
				</select>
			</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4 col-sm-12 mt-3">
			<div class="form-group">
				<div class="dropdown bootstrap-select form-control">
					<div class=" col-sm-12">
						<div class="form-group">
							<label><h6>Assignment Date<span class="text-danger">*</span></h6></label>
							<input name="Assignment_Date" id="Assignment_Date" type="text" class="form-control date-picker">
						</div>
					</div>
			</div>
			</div>
		</div>
	</div>
</form>
</div>
							



			<div class="footer-wrap pd-20 mb-20 card-box">
				Copyright 2022. "PROJECT MANAGEMENT SYSTEM" All rights reserved.
				
			</div>
		</div>
	</div>
	<!-- js -->
	<script src="vendors/scripts/core.js"></script>
	<script src="vendors/scripts/script.min.js"></script>
	<script src="vendors/scripts/process.js"></script>
	<script src="vendors/scripts/layout-settings.js"></script>
	<script src="src/plugins/jQuery-Knob-master/jquery.knob.min.js"></script>
	<script src="src/plugins/highcharts-6.0.7/code/highcharts.js"></script>
	<script src="src/plugins/highcharts-6.0.7/code/highcharts-more.js"></script>
	<script src="src/plugins/jvectormap/jquery-jvectormap-2.0.3.min.js"></script>
	<script src="src/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script src="vendors/scripts/dashboard2.js"></script>
	<script src="vendors/scripts/common.js"></script>
</body>
</html>