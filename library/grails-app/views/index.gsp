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
</div>
<br/>


<div class="homeCell">
<h3>Course</h3>
<p>Here you can add or view Courses</P>
<span class="buttons">
<g:link controller="course" action="create">Add Course</g:link> 
<g:link controller="course" action="index">View Courses</g:link>
</span>
</div>
<br/>


<div class="homeCell">
<h3>Student</h3>
<p>Here you can add or view Students</P>
<span class="buttons">
<g:link controller="student" action="create">Add Student</g:link>
<g:link controller="student" action="index">View Students</g:link>
</span>
</div>
<br/>


<div class="homeCell">
<h3>Book</h3>
<p>Here you can add or view Books</P>
<span class="buttons">
<g:link controller="book" action="create">Add Book</g:link>
<g:link controller="book" action="index">View Books</g:link>
</span>
</div>
<br/>


<div class="homeCell">
<h3>Librarian</h3>
<p>Here you can add or view Librarians</P>
<span class="buttons">
<g:link controller="librarian" action="create">Add Librarian</g:link>
<g:link controller="librarian" action="index">View Librarians</g:link>
</span>
</div>
<br/>


<div class="homeCell">
<h3>Library</h3>
<p>Here you can add or view Libraries</P>
<span class="buttons">
<g:link controller="library" action="create">Add Library</g:link>
<g:link controller="library" action="index">View Libraries</g:link>
</span>
</div>
<br/>


</body>
</html>
