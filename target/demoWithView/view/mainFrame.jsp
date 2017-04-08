<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="tagPage.jsp"%>
<html>
<head>
    <title>mainFrame</title>

</head>
<body>
<h1>学生信息</h1>
<form action="${webRoot}/vStuClaController/showAllStudents.do" method="get">
    <input type="hidden" name="pageNum" value="" />
    <input type="hidden" name="pageSize" value="" />
    <table>
        <tr>
            <td>学号:</td>
            <td><input type="text" name="stuId" id="stuId" value="${searchColumn.stuId}"/></td>
            <td>姓名:</td>
            <td><input type="text" name="stuName" id="stuName" value="${searchColumn.stuName}"/></td>
            <td>性别:</td>
            <td><input type="text" name="stuSex" id="stuSex" value="${searchColumn.stuSex}"/></td>
            <td></td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text" name="stuBirthStart" id="stuBirthStart" value="${searchColumn.stuBirthStart}"/></td>
            <td>~</td>
            <td><input type="text" name="stuBirthEnd" id="stuBirthEnd" value="${searchColumn.stuBirthEnd}"/></td>
            <td>班级名:</td>
            <td><input type="text" name="claName" id="claName" value="${searchColumn.claName}"/></td>
            <td><input type="submit" value="查询" /></td>
        </tr>

    </table>
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
        <%--<button id="firstPage">首页</button>--%>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=1&pageSize=${pageInfo.pageSize}&
        stuId=${searchColumn.stuId}&stuName=${searchColumn.stuName}&stuSex=${searchColumn.stuSex}&
        stuBirthStart=${searchColumn.stuBirthStart}&stuBirthEnd=${searchColumn.stuBirthEnd}&
        claName=${searchColumn.claName}">首页</a>
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.hasPreviousPage}">
        <%--<button id="previousPage">上一页</button>--%>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.pageNum - 1}&pageSize=${pageInfo.pageSize}&
        stuId=${searchColumn.stuId}&stuName=${searchColumn.stuName}&stuSex=${searchColumn.stuSex}&
        stuBirthStart=${searchColumn.stuBirthStart}&stuBirthEnd=${searchColumn.stuBirthEnd}&
        claName=${searchColumn.claName}">上一页</a>
    </c:when>
    <c:otherwise>
        上一页
    </c:otherwise>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.hasNextPage}">
        <%--<button id="nextPage">下一页</button>--%>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.pageNum + 1}&pageSize=${pageInfo.pageSize}&
        stuId=${searchColumn.stuId}&stuName=${searchColumn.stuName}&stuSex=${searchColumn.stuSex}&
        stuBirthStart=${searchColumn.stuBirthStart}&stuBirthEnd=${searchColumn.stuBirthEnd}&
        claName=${searchColumn.claName}">下一页</a>
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
        <%--<button id="lastPage">末页</button>--%>
        <a href="${webRoot}/vStuClaController/showAllStudents.do?pageNum=${pageInfo.lastPage}&pageSize=${pageInfo.pageSize}&
        stuId=${searchColumn.stuId}&stuName=${searchColumn.stuName}&stuSex=${searchColumn.stuSex}&
        stuBirthStart=${searchColumn.stuBirthStart}&stuBirthEnd=${searchColumn.stuBirthEnd}&
        claName=${searchColumn.claName}">末页</a>
    </c:otherwise>
</c:choose>

</body>
</html>
