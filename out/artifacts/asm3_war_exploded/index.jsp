<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List</title>
    <style>
        #students {
            font-family: "Times New Roman", Times, serif;
            border-collapse: collapse;
            width: 100%;
        }

        #students td, #students th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #students tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #students tr:hover {
            background-color: #ddd;
        }

        #students th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #353baf;
            color: white;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">List</h1>
<a href="/create-student">Add New</a>
<table id="students">
    <tr>
        <th>Id</th>
        <th>Subject Name</th>
        <th>Student Name</th>
        <th>Point Theory</th>
        <th>Point Assigment</th>
        <th>Point Project</th>
        <th>Created At</th>
        <th>Updated At</th>
        <th>Update and Delete</th>
    </tr>

    <s:iterator value="students">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="subjectName"/></td>
            <td><s:property value="nameStudent"/></td>
            <td><s:property value="theory"/></td>
            <td><s:property value="asm"/></td>
            <td><s:property value="proj"/></td>
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