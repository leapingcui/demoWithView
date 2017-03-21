<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="tagPage.jsp"%>
<html>
<head>
    <title>mainFrame</title>
</head>
<body>
<h1>学生信息</h1>
<form action="${webRoot}/vStuClaController/fuzzySearch.do" method="post">
    <input type="text" name="fuzzyInfo" />
    <input type="submit" value="查询" />
</form>
<a href="${webRoot}/studentController/insertStudentUI.do">新增</a>
<table border="1" >
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>班级名</th>
        <th>班级人数</th>
        <th>详情</th>
        <th>编辑</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${pageInfo.list}" var="vStuCla">
    <tr>
        <td>${vStuCla.stuId}</td>
        <td>${vStuCla.stuName}</td>
        <td>${vStuCla.stuSex}</td>
        <td><fmt:formatDate value="${vStuCla.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td>${vStuCla.claName}</td>
        <td>${vStuCla.claTotalNum}</td>
        <td><a href="${webRoot}/vStuClaController/detailedStudent.do?stuId=${vStuCla.stuId}">详情</a></td>
        <td><a href="${webRoot}/studentController/updateStudentUI.do?stuId=${vStuCla.stuId}">编辑</a></td>
        <td><a href="${webRoot}/studentController/deleteStudent.do?stuId=${vStuCla.stuId}">删除</a></td>
    </tr>
    </c:forEach>
</table>
第${pageInfo.pageNum}页/共${pageInfo.pages}页  &nbsp;&nbsp;${pageInfo.total}条记录
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:choose>
    <c:when test="${pageInfo.isFirstPage}">
        首页
    </c:when>
    <c:otherwise>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=1&pageSize=5">首页</a>
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.hasPreviousPage}">
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.pageNum - 1}&pageSize=5">上一页</a>
    </c:when>
    <c:otherwise>
        上一页
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.hasNextPage}">
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.pageNum + 1}&pageSize=5">下一页</a>
    </c:when>
    <c:otherwise>
        下一页
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.isLastPage}">
        末页
    </c:when>
    <c:otherwise>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.lastPage}&pageSize=5">末页</a>
    </c:otherwise>
</c:choose>
</body>
</html>
