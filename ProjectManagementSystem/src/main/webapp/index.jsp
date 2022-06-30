<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
      <head>
          <title>PMS</title>
          <link rel="apple-touch-icon" sizes="180x180" href="vendors/images/pmslogo.png">
		  <link rel="icon" type="image/png" sizes="32x32" href="vendors/images/pmslogo.png">
		  <link rel="icon" type="image/png" sizes="16x16" href="vendors/images/pmslogo.png">
          <meta charset="utf-8">
          <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="stylesheet" href="Style/bootstrap.min.css" type="text/css">
          <link rel="stylesheet" href="Style/css.css" type="text/css">
          <link rel="stylesheet" href="Style/font-awesome.css" type="text/css">
          <script async src="https://www.googletagmanager.com/gtag/js?id=UA-119386393-1"></script>
  
      </head>
      <body class="bg-light"> 
            <nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
              <div class="container">
                <a class="navbar-brand" href="#"> 
                  <div class="row">
                   <div class="col-md-3 text-center">
                  <img src="images/pmslogo.png" alt="" width="80" height="80" class="d-inline-block align-text-top"> 
                  </div>
                  <div class="col-md-4  text-center"><h4 class="h5 txt-green pt-2"><b>PROJECT MANAGEMENT SYSTEM</b></h4>
                    <small class="h6 txt-orange">Project,Tasks,Bugs and Tickets online application</small></p></div>
                </div>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                  
                  <ul class="navbar-nav me-auto mb-2  " style="padding-left: 50px;">
                    <li class="nav-item">
                      <a class="nav-link active btn btn-outline-success text-white" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item" style="padding-left: 10px;">
                      <a class="nav-link  btn btn-outline-success" href="about.jsp">About</a>
                    </li> 
                    <li class="nav-item" style="padding-left: 10px;">
                      <a class="nav-link  btn btn-outline-success" href="contact.jsp">Contact</a>
                    </li>  
                  </ul>
                  <form class="d-flex mt-2" style="padding-left: 10px;">
                    <input class="form-control me-2 " type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                  </form>
                
                </div>
              </div>
              </div>
            </nav> 
               

      <div class="container"  style="background-color: #f0eeee;">
          <div class="row">
              <!--3 row-->
              <div  class="" >
                <div id="demo" class="carousel slide" data-bs-ride="carousel">
        
                    <!-- Indicators/dots -->
                    <div class="carousel-indicators">
                      <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
                      <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
                      <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
                    </div>
                    
                    <!-- The slideshow/carousel -->
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img src="images/bg3.jpg" alt="Los Angeles" class="d-block" style="width:100%;height:600px">
                        <div class="carousel-caption">
                          <h3>Los Angeles</h3>
                          <p>We had such a great time in LA!</p>
                        </div>
                      </div>
                      <div class="carousel-item">
                        <img src="images/bg2.jpg" alt="Chicago" class="d-block" style="width:100%;height:600px">
                        <div class="carousel-caption">
                          <h3>Chicago</h3>
                          <p>Thank you, Chicago!</p>
                        </div> 
                      </div>
                      <div class="carousel-item">
                        <img src="images/bg1.jpg" alt="New York" class="d-block" style="width:100%;height:600px">
                        <div class="carousel-caption">
                          <h3>New York</h3>
                          <p>We love the Big Apple!</p>
                        </div>  
                      </div>
                    </div>
                    
                    <!-- Left and right controls/icons -->
                    <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
                      <span class="carousel-control-prev-icon"></span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
                      <span class="carousel-control-next-icon"></span>
                    </button>
                  </div> 
                </div>
          </div>
      </div>
      <div class="container" style="background-color: #f0eeee;">
          <div class="row">
             <div class="col-md-3" style=" margin-bottom: 15px;">
              <div class="mt-3">  
                <div class="card">
                  <div class="card-body">
                    <h6 class="card-title">EMPLOYEE MANAGEMENT</h6>
                  </div>
                  <img class="card-img-bottom" src="images/employee-management.jpg" alt="Card image" style="height: 150px;">
                </div>
                <div class="card  mt-3" >
                  <div class="card-body">
                    <h6 class="card-title">TICKET MANAGEMENT</h6>
                  </div>
                  <img class="card-img-bottom" src="images/Ticket-Management.jpeg" alt="Card image" style="height: 150px;">
                </div>
                <div class="card  mt-3" >
                  <div class="card-body">
                    <h6 class="card-title">PROJECT MANAGEMENT</h6>
                  </div>
                  <img class="card-img-bottom" src="images/project-management.jpg" alt="Card image" style="height: 150px;">
                </div>
                <div class="card  mt-3">
                  <div class="card-body">
                    <h6 class="card-title">TIME MANAGEMENT</h6>
                  </div>
                  <img class="card-img-bottom" src="images/Time_Management.png" alt="Card image" style="height: 150px;">
                </div>
              </div>
             </div>
             <div class="col-md-6">
              <div class="card mb-3  mt-3">
                <div class="row g-0">
                  <div class="col-md-5 pt-3">
                    <img src="images/project-management2.jpg" class="img-thumbnail" alt="..."style="height: 220px;">
                  </div>
                  <div class="col-md-7">
                    <div class="card-body">
                      <h5 class="card-title">PROJECT MANAGEMENT</h5>
                      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card mb-3  mt-3" >
                <div class="row g-0">
                  <div class="col-md-5 pt-3">
                    <img src="images/emp-time-management.jpg" class="img-thumbnail" alt="..."style="height: 220;">
                  </div>
                  <div class="col-md-7">
                    <div class="card-body">
                      <h5 class="card-title">TIME MANAGEMENT</h5>
                      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="card mb-3  mt-3" >
                <div class="row g-0">
                  <div class="col-md-5 pt-3">
                    <img src="images/Ticket-Assignment-Management.jpg" class="img-thumbnail" alt="..."style="height: 220;">
                  </div>
                  <div class="col-md-7">
                    <div class="card-body">
                      <h5 class="card-title">TICKET MANAGEMENT</h5>
                      <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                  </div>
                </div>
              </div>
             </div>
             <div class="col-md-3">
              <div class="card mb-3  mt-3" style="max-width: 540px;height: 260px;">
                  <div class="pt-3">
                    <img src="images/project-management3.jpg" class="img-thumbnail" alt="..."style="height: 220px;">
                  </div>
                </div>
                <div class="card mb-3  mt-3" style="max-width: 540px;height: 260px;">
                  <div class="pt-3">
                    <img src="images/Management-Company.jpg" class="img-thumbnail" alt="..."style="height: 220px;">
                  </div>
                </div>
                <div class="card mb-3" style="max-width: 540px;">
                  <div class="row g-0">
                    <div class="col-md-4 pt-3">
                      <img src="images/Admin-Lon.jpg" class="img-thumbnail" alt="...">
                    </div>
                    <div class="col-md-8">
                      <div class="card-body">
                        <a href="dashboard.jsp" class="btn text-dark pt-3" data-bs-toggle="modal" data-bs-target="#logModal"> <h5 class="card-title">PMS<br> Admin Login</h5></a>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="card mb-3" style="max-width: 540px;">
                  <div class="row g-0">
                    <div class="col-md-4 pt-3">
                      <img src="images/Emp-login.jpg" class="img-thumbnail" alt="...">
                    </div>
                    <div class="col-md-8">
                      <div class="card-body">
                        <button class="btn text-dark" data-bs-toggle="modal" data-bs-target="#logModal"><h5 class="card-title">PMS Employee Login</h5>
                        </button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
             </div>
          </div>

              <div class="container" style="background: #222222;">
                <div class="row">
                  <div class="col-md-4"  style="color: #ffffff; margin-top: 15px;">
                    <h2>About</h2>
                  </div>
                  <div class="col-md-4 " style="color: #ffffff; margin-top: 15px;" >
                    <div class="footer-widget">
                      <h2>Works</h2>
                      <ul class="tag-list">
                        <li><a class=" btn  text-light" href="#">Hording</a></li>
                        <li><a class=" btn  text-light" href="#">Letter cutout</a></li>
                        <li><a class=" btn  text-light" href="#">Sign bottle cutout</a></li>
                        <li><a class=" btn  text-light" href="#">Glow sign board</a></li>
                        <li><a class=" btn  text-light" href="#">Exhibition stall</a></li>
                      </ul>
                    </div>
                  </div>
                  
                  <div class="col-md-4"  style="color: #ffffff; margin-top: 15px;">
                    <div class="footer-widget info-widget">
                      <h2>Working Hours</h2>
                      <p class="first-par">You can contact or visit us during working time.</p>
                      <p><span>Tel: </span> +91-9999999999 / +91-9999999999</p>
                      <p><span>Email: </span> abc123@gmail.com / abc123@hotmail.com</p>
                      <p><span>Working Hours: </span> 10:00 a.m - 10:00 p.m</p>
                    </div>
                  </div>
                </div>
              </div>
            <div class="container" style="background: #111111;">
            <p class="copyright">
              &copy; Copyright 2022. "PROJECT MANAGEMENT SYSTEM" All rights reserved.
            </p>
            </div>


<!--

MODAL POPUP

-->



<div class="modal fade" id="logModal" tabindex="-1" aria-labelledby="logModalLabel" aria-hidden="true">
<div class="modal-dialog">
<div class="modal-content">

  <form method="post" action="dashboard.jsp" >
  <div class="modal-header">
    <h5 class="modal-title" id="logModalLabel"><i class="fa fa-sign-in"></i>&nbsp;Login </h5>
    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
  </div>
  <div class="modal-body">
    <div class="container bg-warning"  >
      <div class="row"> 
          <div class="col-md-6" style="margin-top:30px ;"> 
              <div class="row">
                  
                      <div class="mb-3 mt-3">
                          <label for="name">User Name:</label>
                          <input type="text" class="form-control" id="username" placeholder="User Name" name="username" required>
                        </div>
                      <div class="mb-3 mt-3">
                        <label for="email">Password:</label>
                        <input type="password" class="form-control" id="Password" placeholder="Enter Password" name="Password"required>
                      </div>
                      <a class=" btn btn-col text-dark" href="ForgotPassword.html" style="margin-top:15px ;">Forgot Password</a>
                  
              </div>
          </div>
          <div class="col-md-3">
          </div>
      </div>
  </div>
  </div>
  <div class="modal-footer">
    <input type="reset" class="btn btn-secondary" data-bs-dismiss="modal" value="Close">
    <input type="submit" class="btn btn-primary" value="Login">
  </div>
</form>
  
</div>
</div> 
</div>
  
          <script src="Script/bootstrap.bundle.min.js"></script>
          <script src="Script/bootstrap.min.js"></script>
          <script src="Script/jquery.min.js"></script>
      </body>
  </html>