-- User table (parent class)
CREATE TABLE user (
    userID INT PRIMARY KEY,
    userName VARCHAR(100),
    password VARCHAR(255),
    email VARCHAR(100),
    phoneNumber VARCHAR(20),
    userType ENUM('admin_university', 'student', 'internship_supervisor', 'university_supervisor')
);

-- Admin_University table (subclass of user)
CREATE TABLE admin_university (
    userID INT PRIMARY KEY,
    adminName VARCHAR(100),
    FOREIGN KEY (userID) REFERENCES user(userID)
);

-- Student table (subclass of user)
CREATE TABLE student (
    userID INT PRIMARY KEY,
    studentName VARCHAR(100),
    studentAddress TEXT,
    studentIC VARCHAR(20),
    studentMatric VARCHAR(20),
    studentCGPA DECIMAL(4,2),
    studentFaculty VARCHAR(100),
    studentCourse VARCHAR(100),
    studentEmail VARCHAR(100),
    studentPhone VARCHAR(20),
    studentHomeAddress TEXT,
    guardianName VARCHAR(100),
    FOREIGN KEY (userID) REFERENCES user(userID)
);

-- Internship_Supervisor table (subclass of user)
CREATE TABLE internship_supervisor (
    userID INT PRIMARY KEY,
    icName VARCHAR(100),
    icDepartment VARCHAR(100),
    FOREIGN KEY (userID) REFERENCES user(userID)
);

-- University_Supervisor table (subclass of user)
CREATE TABLE university_supervisor (
    userID INT PRIMARY KEY,
    ucName VARCHAR(100),
    FOREIGN KEY (userID) REFERENCES user(userID)
);
