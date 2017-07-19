<%-- 
    Document   : display
    Created on : Jun 13, 2017, 4:50:11 PM
    Author     : admin
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            List<Object> list = (List<Object>) request.getAttribute("list");
            Set<Object> set = (Set<Object>) request.getAttribute("set");
            Map<Object, Object> map = (Map<Object, Object>) request.getAttribute("map");            
        %>
        
        <!-- Show list -->
        <h1> List </h1>
        <ul>
        <% for(Object item: list) { %>
        
            <li><%= item %></li>
        
        <% } %>
        </ul>
        
        <!-- Show set -->
        <h1> Set </h1>
        <ul>
        <% for(Object item: set) { %>
        
            <li><%= item %></li>
        
        <% } %>
        </ul>
        
        <!-- Show map -->
        <h1> Map </h1>
        <ul>
        <% for(Map.Entry<Object, Object> item: map.entrySet()) { %>
        
            <li><%= item.getKey() %> = <%= item.getValue() %></li>
        
        <% } %>
        </ul>
    </body>
</html>
