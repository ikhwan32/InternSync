<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Academic Supervisor Dashboard - Internship Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('<c:url value="/assets/images/background.png"/>'); 
            background-size: cover;     
            background-repeat: no-repeat; 
            background-attachment: fixed; 
            background-position: center;  
            min-height: 100vh;
            margin: 0;
            padding: 0;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
            display: flex;
            flex-direction: column;
            
        }

        .dashboard-container {
            flex: 1; 
            margin-left: 100px;
            margin-right: 100px;
        }
        .card {
            background: white;
            border-radius: 10px;
            padding: 25px;
            margin: 20px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 1;
        }
        .card-outer{
            background: none;
            padding: 0px;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            position: relative;
        }
        .card-inner{
            background: white;
            border-radius: 20px;
            padding: 25px;
            margin: 30px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            flex: 1;
            min-width: 200px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 200px;
        }
        .cardforlogo{
            background: none;
            padding: 0px;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            gap: 10px;
            align-items: center;
            justify-content: center;
        }
        .cardforlogo img{
            max-width: 100px;
            height: auto;
        }
        .inner1{
            padding: 0px;
            margin: 0px;
            border: none;
            flex: 1;
            min-width: 0px;
            display: flex;
            text-align: left;
        }
        .inner2{
            padding: 0px;
            margin: 0px;
            border: none;
            flex: 1;
            min-width: 0px;
            display: flex;
        }
         
        .display-totalStudent{
            text-align: center;
            font-size: 20px;
            font-weight: 500;
            margin-bottom: 15px;
            color: #333;
        }
        .announcement-section {
            background-color: #F8F9FA;
            padding: 20px;
            border-radius: 8px;
            height: 100%;
        }
        .announcement-title {
            text-align: center;
            font-size: 20px;
            font-weight: 500;
            margin-bottom: 15px;
            color: #333;
        }
        .announcement-text {
            font-size: 14px;
            color: #666;
        }
        .dropdown{
            position: absolute;
            right: 0;
        }
        .btn-secondary.dropdown-toggle {
            background-color: #ffffff; 
            color: #333; 
            border-color: #5D8BFF; 
        }
        .btn-secondary.dropdown-toggle:hover {
            background-color: #5D8BFF; 
            color: white; 
            border-color: #5D8BFF; 
        }
        .dropdown-item:hover {
            background-color: #5D8BFF; 
            color: white;
        }
          .filters {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            margin-bottom: 20px;
        }

        .filters .left-section {
            margin: 30px;
            display: flex;
            flex-direction: column;
            gap: 25px;
        }

        .filters .back-button,
        .filters .search input,
        .filters .search select {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 40px;
            width: 200px;
        }

        .filters .back-button {
            background-color: #007bff;
            color: #fff;
            border: none;
            font-weight: bold;
            cursor: pointer;
            text-decoration: none;
            text-align: center;
        }

        .filters .back-button:hover {
            background-color: #0056b3;
        }
      

</style>
</head>
<body>
    <c:set var="page" value="admin" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    
    <div class="dashboard-container">
        <div class="filters" style="margin-bottom: 0px;">
            <div class="left-section" style="max-width: 500px; margin-right: 0px;">
                <a href="student.jsp" class="btn btn-primary" style='background-color: #5D8BFF; border: none; flex-grow: 1; height: 50px; border-radius: 15px; align-content: center;'>Back</a>
                    <div class="dropdown" style=''>
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false" style="width: 100%; border-radius: 15px; height: 50px;">
                            ${param.selectedCourse != null ? param.selectedCourse : 'Select Course'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectCourse('CS110')">CS110</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectCourse('CS230')">CS230</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectCourse('CS270')">CS270</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedCourse" id="selectedCourseInput">
                    <script>
                        function selectCourse(name) {
                            document.getElementById('dropdownMenuButton').textContent = name;
                            document.getElementById('selectedCourseInput').value = name;
                        }
                    </script>
                    <form action="submitDropdownSelection.jsp" method="POST">
                        <div class="card-outer" style='margin: 0px; height: 50px;'>

                            <input type="text" name="text" class="search" placeholder="Search here... " style="border-radius: 15px; border: none;">
                            <a href="#" type="submit" class="btn btn-primary" style='width: 100px; background-color: #5D8BFF; border: none; border-radius: 15px; align-content: center;'>Search</a>
                        </div>
                    </form>
            </div>
            <!------------- ---------------->
            <div class="card-inner">
                <div class="cardforlogo">
                    <img src="<c:url value='/assets/images/icon1.png'/>">
                     <h3 class="display-totalStudent">
                         <div class="inner2" style="padding-top: 20px; color: grey;">Total Students</div>
                         <span>4</span>
                     </h3>
                </div>
            </div>
        </div>
        
        <!------------- internship list Section ---------------->            
        <div class="card" style="border-radius: 20px; margin-top: 0px;">
            <div class="card-outer">
                <div class="inner2" style="padding-top: 20px; color: grey;">All Interns</div>
                <div class="inner1" style="font-size: 20px; font-weight: 500;">Internship List</div>
                <div class="dropdown" style="padding-top: 20px;">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false" style="width: 150px; border-radius: 10px;">
                      Sort by :
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                      <li><a class="dropdown-item" href="#">Newest</a></li>
                      <li><a class="dropdown-item" href="#">Oldest</a></li>
                    </ul>
                </div>
            </div>
            
            <div class="table-responsive">
                <table class="table table-hover">
                  <thead>
                    <tr>
                      <th scope="col" style="text-align: center;">Number</th>
                      <th scope="col">Student Name</th>
                      <th scope="col">Student ID</th>
                      <th scope="col">Phone Number</th>
                      <th scope="col">Email</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th scope="row" style="text-align: center;">1</th>
                      <td>Student Name</td>
                      <td>2024567890</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                    </tr>
                    <tr>
                      <th scope="row" style="text-align: center;">2</th>
                      <td>Student Name</td>
                      <td>2024567890</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                    </tr>
                    <tr>
                      <th scope="row" style="text-align: center;">3</th>
                      <td>Student Name</td>
                      <td>2024567890</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                    </tr>
                    <tr>
                      <th scope="row" style="text-align: center;">4</th>
                      <td>Student Name</td>
                      <td>2024567890</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                    </tr>
                  </tbody>
                </table>
            </div>
<span style="color: grey;">Showing data 1 to 4 of 4 entries</span>

        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>

</html>