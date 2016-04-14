<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>The University Enrolement System</title>
</head>

<body>

<div id="Welcome">
<br>
<h3>Welcome to The University Enrolement and Library System</h3>
<p>Welcome to the University Enrolement and Library Booking System, from this you will be able to add courses and students and enroll them onto a course. You will also be able to add any new Libraries and librarians and books that are associated with that library. You can also give out a book to a student and record the details of when it was borrowed and when it is to be returned. </p>
<img src="${resource(dir: 'images', file: 'Homepage.jpg')}" alt="Student Enrolement System" />
</div>
<br/>

<div class="homeCell">
<h3>Student Details</h3>
<p>Here you can choose whether to view Student Details in XML or JSON format</p>
<span class="buttons">
<a href="http://localhost:8080/student/liststudentxml">XML</a>
<a href="http://localhost:8080/student/liststudentjson">JSON</a>
</span>
</span>
</div>
<br/>

<div class="Library">
<h3>Books Borrowed</h3>
<p>Here you can choose to view what books have been borrowed in XML format</p>
<span class="buttons">
<a href="http://localhost:8080/library/listBooks">XML</a>
</span>
</div>

</body>
</html>
