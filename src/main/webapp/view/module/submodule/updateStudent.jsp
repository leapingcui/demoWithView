<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>updateStudent</title>
</head>
<body>
<h1>编辑学生</h1>
<a href="#">返回</a>
<form action="${webRoot}/studentController/updateStudent.do" method="post">
    学号:<input type="text" id="stuId" name="stuId" value="${vStuCla.stuId}" /><br>
    姓名:<input type="text" id="stuName" name="stuName" value="${vStuCla.stuName}" /><br>
    性别:<input type="radio"  name="stuSex" value="男"
            <c:if test="${vStuCla.stuSex eq '男'}">
            checked='checked'
            </c:if>
        />男
    <input type="radio"  name="stuSex" value="女"
            <c:if test="${vStuCla.stuSex eq '女'}">
                checked='checked'
            </c:if>
        />女<br>
    出生年月:<input type="text" id="stuBirth" name="stuBirth"
                value="<fmt:formatDate value="${vStuCla.stuBirth}" pattern="yyyy-MM-dd" /> " /><br>
    班级号:<select id="class" name="stuClaId">
                <option value="1"
                        <c:if test="${vStuCla.claId eq '1'}">
                            selected="selected"
                        </c:if>
                 >1</option>
                <option value="2"
                        <c:if test="${vStuCla.claId eq '2'}">
                            selected="selected"
                        </c:if>
                 >2</option>
            </select><br>
    班级名:<input readonly="readonly" type="text"  value="${vStuCla.claName}" /><br>
    班级人数:<input readonly="readonly" type="text"  value="${vStuCla.claTotalNum}" /><br>
    <input type="submit" value="编辑"/>
    <input type="reset" value="重置"/>

</form>
</body>
</html>
