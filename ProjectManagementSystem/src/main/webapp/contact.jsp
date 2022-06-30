<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <link rel="stylesheet" href="Style/bootstrap.min.css">
    <link rel="stylesheet" href="Style/css.css" type="text/css">
    
</head>
<body class="bg-light"> 
  <nav class="navbar navbar-expand-lg navbar-light bg-light" >
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
            <a class="nav-link btn btn-outline-success " href="index.jsp">Home</a>
          </li>
          <li class="nav-item" style="padding-left: 10px;">
            <a class="nav-link  btn btn-outline-success" href="about.jsp">About</a>
          </li> 
          <li class="nav-item" style="padding-left: 10px;">
            <a class="nav-link  btn btn-outline-success text-white active"  aria-current="page" href="contact.jsp">Contact</a>
          </li>  
        </ul>
        <form class="d-flex mb-2" style="padding-left: 10px;">
          <input class="form-control me-2 " type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      
      </div>
    </div>
    </div>
  </nav> 

    <div class="container" style=" background-color:#f0eeee;margin-top:10px ;">
        <div class="row">
            <div class="col-md-9" >
                <div class="row" style="margin-top:10px;border-bottom: 1px solid black;">
                    <h3>Contact Us Form </h3>
                </div>
                <div class="row">
                    <form action="#" style="margin-bottom:20px ;">
                        <div class="mb-3 mt-3">
                            <label for="name">Name:</label>
                            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
                          </div>
                        <div class="mb-3 mt-3">
                          <label for="email">Email:</label>
                          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                        </div>
                        <div class="mb-3">
                          <label for="phone">Phone:</label>
                          <input type="number" class="form-control" id="phone" placeholder="Enter Phone Number" name="phone">
                        </div>
                        <div class="mb-3 mt-3">
                            <label for="Subject">Subject:</label>
                            <input type="text" class="form-control" id="Subject" placeholder="Enter Subject" name="Subject">
                          </div>
                          <div class="mb-3 mt-3">
                            <label for="Message">Subject:</label>
                            <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
                          </div>
                        <button type="submit" class="btn btn-primary" style="width:150px ;">Submit</button>
                        <button type="reset" class="btn btn-primary" style="margin-left:20px; width:150px ;">Reset</button>
                      </form>
                </div>
            </div>
            <div class="col-md-3">
                <div class=" mb-3  mt-3" style="max-width: 540px;height: 260px;">
                        <div class="pt-3">
                          <img src="images/project-management3.jpg" class="img-thumbnail" alt="..."style="height: 220px;">
                        </div>
                      </div>
                      <div class=" mb-3  mt-3" style="max-width: 540px;height: 260px;">
                        <div class="pt-3">
                          <img src="images/Management-Company.jpg" class="img-thumbnail" alt="..."style="height: 220px;">
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
    <script src="script/bootstrap.bundle.min.js"></script>
        <script src="Script/bootstrap.min.js"></script>
        <script src="Script/jquery.min.js"></script>
</body>
</html>