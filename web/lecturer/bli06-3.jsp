<!-- Page 3 -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Industrial Supervisor Dashboard - Internship Management System</title>
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
        .card-outer {
            background: none;
            padding: 0;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            position: relative;
            align-items: center; /* Align items vertically centered */
        }
        .card-outer .btn {
            background-color: #5D8BFF;
            flex-grow: 1; 
            text-align: center; 
        }
        .inner {
            padding: 20px;
            margin: 0;
            border: none;
            flex: 1;
            min-width: 0;
            display: flex;
            flex-direction: column;
        }
        .form-control::placeholder {
            color: #D3D3D3 !important;
        }
        
        /* Style for toggle switch */
        .switch {
            position: relative;
            display: inline-block;
            width: 60px;
            height: 34px;
        }

        .switch input {
            opacity: 0;
            width: 0;
            height: 0;
        }

        .slider {
            position: absolute;
            cursor: pointer;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: #ccc;
            transition: .4s;
            border-radius: 34px;
        }

        .slider:before {
            position: absolute;
            content: "";
            height: 26px;
            width: 26px;
            left: 4px;
            bottom: 4px;
            background-color: white;
            transition: .4s;
            border-radius: 50%;
        }

        input:checked + .slider {
            background-color: #2196F3;
        }

        input:checked + .slider:before {
            transform: translateX(26px);
        }

        /* Checkbox section styling */
        .checkbox-container {
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <c:set var="page" value="dashboard" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    
    <div class="dashboard-container">
        
        <!-------------  Form Section ---------------->            
        <div class="card" style="border-radius: 20px;">
            <div class="inner" style="padding-top: 20px;">
                <div style="font-weight: 500; font-size: 25px;">BLI 06</div>
                <div>Academic Supervisor Evaluation Form</div>
                <div style='font-weight: 500;'><br>Section B : Student Evaluation</div>
            </div>
                    <!------------- 16 dropdown Section ---------------->   
            <form action="submitDropdownSelection.jsp" method="POST">
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>1.Suitability the assignment given</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b1" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb1('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb1('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb1('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb1('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb1('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb1" id="b1selected">
                </div>
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>2.Guidance from organization supervisor </div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b2" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb2('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb2('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb2('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb2('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb2('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb2" id="b2selected">
                </div>
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>3.Cooperation from organization staff</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b3" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb3('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb3('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb3('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb3('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb3('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb3" id="b3selected">
                </div>                        
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>4.Comfort of the working space</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b4" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb4('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb4('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb4('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb4('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb4('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb4" id="b4selected">
                </div>                         
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>5.Provide computer hardware and software</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b5" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb5('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb5('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb5('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb5('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb5('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb5" id="b5selected">
                </div>                           
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>6.Organization location environment (public facility, safety and others)</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b6" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb6('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb6('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb6('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb6('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb6('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb6" id="b6selected">
                </div>    
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>7.Industrial training suitability</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b7" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb7('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb7('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb7('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb7('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb7('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb7" id="b7selected">
                </div>                            
                <div class="card-outer" style="display: flex; justify-content: space-between; align-items: center;">
                    <div>8.Responsibility level given by the organization</div>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="b8" data-bs-toggle="dropdown" aria-expanded="false" style="width: 180px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Marks'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectb8('1')">1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb8('2')">2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb8('3')">3</a></li>                            
                            <li><a class="dropdown-item" href="#" onclick="selectb8('4')">4</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectb8('5')">5</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedb8" id="b8selected">
                </div>                           
                <div class="mb-3">
                    <label class="form-label">Comment</label>
                    <input type="text" class="form-control" name="comment" placeholder="Comment" required>
                </div>                                
                                                        
            <br><br><br>
                <!-------------  button Section ----------------> 
            <div class="card-outer" style="margin-bottom: 0px;">
                <a href="bli06-2.jsp" class="btn btn-primary" style='background-color: #5D8BFF; border: none; flex-grow: 1;'>Back</a>
                <a href="#" type="submit" class="btn btn-primary" style='background-color: #00D072; border: none; flex-grow: 1;'>Submit</a>
            </div>
            </form>
                        
            <!-------------  script for dropdown Section ---------------->   
            <script>
                function selectb1(name) {
                    document.getElementById('b1').textContent = name;
                    document.getElementById('b1selected').value = name;
                }
                function selectb2(name) {
                    document.getElementById('b2').textContent = name;
                    document.getElementById('b2selected').value = name;
                } 
                function selectb3(name) {
                    document.getElementById('b3').textContent = name;
                    document.getElementById('b3selected').value = name;
                }
                function selectb4(name) {
                    document.getElementById('b4').textContent = name;
                    document.getElementById('b4selected').value = name;
                }
                function selectb5(name) {
                    document.getElementById('b5').textContent = name;
                    document.getElementById('b5selected').value = name;
                }
                function selectb6(name) {
                    document.getElementById('b6').textContent = name;
                    document.getElementById('b6selected').value = name;
                } 
                function selectb7(name) {
                    document.getElementById('b7').textContent = name;
                    document.getElementById('b7selected').value = name;
                }
                function selectb8(name) {
                    document.getElementById('b8').textContent = name;
                    document.getElementById('b8selected').value = name;
                }
            </script>

            <div class="container my-5">
                <nav>
                    <ul class="pagination d-flex justify-content-center">
                        <li class="page-item">
                        </li>
                        <li class="page-item"><a class="page-link" href="BLI06-1.jsp" style="border: none;">1</a></li>
                        <li class="page-item"><a class="page-link" href="bli06-2.jsp" style="border: none;">2</a></li>
                        <li class="page-item"><a class="page-link" href="bli06-3.jsp" style="background-color: #5D8BFF; color: white; border: none; border-radius: 10px;">3</a></li>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>

    <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>
</html>

</body>
</html>
