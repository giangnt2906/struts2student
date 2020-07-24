<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Student</title>
    <style>
        #customers {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #customers tr:hover {
            background-color: #ddd;
        }

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">List Point Student</h1>
<a href="/create-student">Add Point For Student</a>
<table id="customers">
    <tr>
        <th>RollNumber</th>
        <th>Subject</th>
        <th>Name Student</th>
        <th>Point Lt</th>
        <th>Point Th</th>
        <th>Point Assignment</th>
        <th>Created At</th>
        <th>Updated At</th>
        <th>Action</th>
    </tr>

    <s:iterator value="students">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="subjects"/></td>
            <td><s:property value="nameStudent"/></td>
            <td><s:property value="pointLt"/></td>
            <td><s:property value="pointTh"/></td>
            <td><s:property value="pointAssignment"/></td>
            <td><s:date name="createdAt" format="dd-MM-yyyy HH:mm:ss"/></td>
            <td><s:date name="updatedAt" format="yyyy-MM-dd HH:mm:ss"/></td>
            <td><s:url action="edit-student" var="urlGetIdUpdate">
                <s:param name="id"><s:property value="id"/> </s:param>
            </s:url>
                <s:url action="delete-student" var="urlGetIdDelete">
                    <s:param name="id"><s:property value="id"/> </s:param>
                </s:url>

                <a href="<s:property value="#urlGetIdUpdate"/>">Update</a> &nbsp; &nbsp;
                <a href="<s:property value="#urlGetIdDelete"/>">Delete</a>
            </td>
        </tr>
    </s:iterator>

</table>
</body>
</html>