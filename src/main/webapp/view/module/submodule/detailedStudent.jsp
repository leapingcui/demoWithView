<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>detailedStudent</title>
</head>
<body>
<h1>学生详情</h1>
    <a href="javascript:history.back()">返回</a>
    <button onclick="history.back()">返回</button>
    <table border="1">
        <tr>
            <td>学号</td>
            <td>${vStuCla.stuId}</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${vStuCla.stuName}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${vStuCla.stuSex}</td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td><fmt:formatDate value="${vStuCla.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        </tr>
        <tr>
            <td>班级号</td>
            <td>${vStuCla.claId}</td>
        </tr>
        <tr>
            <td>班级名</td>
            <td>${vStuCla.claName}</td>
        </tr>
        <tr>
            <td>班级人数</td>
            <td>${vStuCla.claTotalNum}</td>
        </tr>
    </table>

</body>
</html>
