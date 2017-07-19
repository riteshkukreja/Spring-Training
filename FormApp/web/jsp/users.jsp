<%-- 
    Document   : users
    Created on : Jun 9, 2017, 1:41:07 PM
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="package4.JavaBean"%>
<%@page import="package4.JavaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <h1>Users</h1>
        
        <table border="5" style="width: 200px">
            <% List<JavaBean> ll = (ArrayList<JavaBean>) request.getAttribute("users"); %>
            
            <tr style="padding: 10px">
                <th>Name</th>
                <th>Age</th>
            </tr>
            
            <% for (int i = 0; i < ll.size(); i++) { %>
            <tr style="padding: 10px">
                <td><%= ll.get(i).name %></td>
                <td><%= ll.get(i).age %></td>
            </tr>            
            <% } %>
        </table>
    </body>
</html>
