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
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 1;
            margin-bottom:20px;
        }
        .card-outer{
            display: flex;
            justify-content: space-between;
            align-items: center;
            text-align: center;
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
            font-size: 20px;
            font-weight: 500;
        }
        .inner2{
            color: grey;
            font-size: 16px;
        }
        .inner1 div {
            font-size: 16px;
            color: green;
            margin-top: 2px;
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
            align-items: center;
            margin-bottom: 20px;
        }

        .filters .left-section {
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .filters .back-button {
            padding: 10px 40px;
            margin: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            text-decoration: none;
        }

        .filters .back-button:hover {
            background-color: #0056b3;
        }

        .filters .search {
            display: flex;
            gap: 10px;
        }

        .filters .search input,
        .filters .search select {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .status-completed {
            color: #28a745;
            font-weight: bold;
        }

        .status-uncompleted {
            color: #dc3545;
            font-weight: bold;
        }

        .action button {
            padding: 8px 15px; 
            border: none;
            border-radius: 10px;
            cursor: pointer; 
            width: 90px; 
            text-align: center;
        }

        .action .reopen {
            background: #007bff;
            color: #fff;
        }

        .action .close {
            background: #dc3545;
            color: #fff;
        }
        .search {
            border-radius: 10px;
        }
        .stats {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
            gap: 20px;
        }

        .stats .stat {
            background: white;
            padding: 15px 20px;
            text-align: center;
            border-radius: 10px;
            flex: 1;
        }

        .stats .stat h2 {
            color: #333;
            font-size: 18px;
            margin-bottom: 5px;
        }

        .stats .stat p {
            color: #555;
            font-size: 14px;
        }
        .stat{
            border-radius: 20px;
        }
        


</style>
</head>
<body>
    <c:set var="page" value="student" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    
    <div class="dashboard-container">
        <div class="filters">
            <div class="left-section">
                <a href="studentTask.jsp" class="back-button" style="background-color: #5D8BFF;">Back</a>
            </div>
            <div class="search">
                <select>
                    <option value="">Select BLI</option>
                    <option value="BLI 01">BLI 01</option>
                    <option value="BLI 02">BLI 02</option>
                    <!-- Add more courses as needed -->
                </select>
                <input type="text" placeholder="Search name...">
            </div>
        </div>
            <!------------- ---------------->
            <div class="stats">
            <div class="stat" style="border-radius: 20px;">
                <img src="<c:url value='/assets/images/icon1.png'/>">
                <h2>Total Students</h2>
                <p>123</p>
            </div>
            <div class="stat" style="border-radius: 20px;">
                <img src="<c:url value='/assets/images/completed.png'/>">
                <h2>Completed</h2>
                <p>80</p>
            </div>
            <div class="stat" style="border-radius: 20px;">
                <img src="<c:url value='/assets/images/uncompleted.png'/>">
                <h2>Uncompleted</h2>
                <p>43</p>
            </div>
        </div>
        
        
                  
            <div class="card" style="border-radius: 20px;" >
            <div class="card-outer">
                <div class="inner2">All Students</div>

            <!-- Center Section -->
                <div class="inner1" style="margin-left: 68px;">
                    PHASE 1
                    <div>BLI 01</div>
                </div>
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
                      <th scope="col">Student Name</th>
                      <th scope="col">Company</th>
                      <th scope="col">Phone number</th>
                      <th scope="col">Email</th>
                      <th scope="col">Action</th>
                      <th scope="col">Status</th>
                    </tr>
                  </thead>
                  <tbody>
                      <tr>
                      <td>Student Name</td>
                      <td>Yahoo</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                      <td class="action"><button class="reopen" style="background-color: #5D8BFF;">View</button></td>
                      <td class="status-completed" style="color: #28a745; font-weight: bold;">Completed</td>
                    </tr>
                      <tr>
                      <td>Student Name</td>
                      <td>Yahoo</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                      <td class="action"><button class="close" style="background-color: #5D8BFF;">View</button></td>
                      <td class="status-uncompleted" style="color: #dc3545; font-weight: bold;">Uncompleted</td>
                    </tr>
                      <tr>
                      <td>Student Name</td>
                      <td>Yahoo</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                      <td class="action"><button class="reopen" style="background-color: #5D8BFF;">View</button></td>
                      <td class="status-uncompleted" style="color: #dc3545; font-weight: bold;">Uncompleted</td>
                    </tr>
                      <tr>
                      <td>Student Name</td>
                      <td>Yahoo</td>
                      <td>012 345 6789</td>
                      <td>name@gmail.com</td>
                      <td class="action"><button class="reopen" style="background-color: #5D8BFF;">View</button></td>
                      <td class="status-uncompleted" style="color: #dc3545; font-weight: bold;">Uncompleted</td>
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
