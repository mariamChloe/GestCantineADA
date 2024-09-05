/* Basic styling for sidebar and content */
body {
display: flex;
margin: 0;
font-family: Arial, sans-serif;
}
.sidebar {
width: 200px;
background-color: #f4f4f4;
padding: 15px;
box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
}
.content {
flex: 1;
padding: 20px;
}
.content table {
width: 100%;
border-collapse: collapse;
}
.content th, .content td {
padding: 10px;
text-align: left;
}
.content th {
background-color: #f2f2f2;
}
.content td a {
text-decoration: none;
color: #007bff;
}
.content td a:hover {
text-decoration: underline;
}