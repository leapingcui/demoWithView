<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>updateStudent</title>
    <script type="text/javascript" src="${webRoot}/statics/js/jQuery-core/jquery.js"></script>
    <script type="text/javascript" src="${webRoot}/statics/js/jQuery-core/jquery.form.js"></script>
    <script type="text/javascript">
        function getJsonLength(jsonData){
            var jsonLength = 0;
            for(var item in jsonData){
                jsonLength++;
            }
            return jsonLength;
        }
        function submitPicUpload() {
            var option={
                type:'POST',
                url:'${webRoot}/fileController/uploadPic.do',
                contentType:"application/json;charset=utf-8",
                dataType:'text',//返回纯文本字符串
                data:{
                    fileName : 'picFile'
                },
                success:function (data) {
                    //把json串转换成json对象
                    var json = $.parseJSON(data);
//                    alert(getJsonLength(json));
                    if(getJsonLength(json) == 1) {
                        alert(json.sizeErr);
                    } else {
                        //返回服务器图片路径，把图片路径设置给img标签
                        $("#imgSrc").attr("src", json.absolutePath);
                        //数据库保存相对路径
                        $("#stuPic").val(json.relativePath);
                    }
                },
                error:function(){
                    alert("未知错误");
                }
            };
            $("#itemForm").ajaxSubmit(option);
        }
    </script>
</head>
<body>
<h1>编辑学生</h1>
<a href="#">返回</a>
<form id="itemForm" action="${webRoot}/studentController/updateStudent.do" method="post">
    <table>
        <tr>
            <td>学号:</td>
            <td><input type="text" id="stuId" name="stuId" value="${vStuCla.stuId}" /></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" id="stuName" name="stuName" value="${vStuCla.stuName}" /></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="radio"  name="stuSex" value="男"
                    <c:if test="${vStuCla.stuSex eq '男'}">
                        checked='checked'
                    </c:if>
            />男
                <input type="radio"  name="stuSex" value="女"
                        <c:if test="${vStuCla.stuSex eq '女'}">
                            checked='checked'
                        </c:if>
                />女</td>
        </tr>
        <tr>
            <td>出生年月:</td>
            <td><input type="text" id="stuBirth" name="stuBirth"
                       value="<fmt:formatDate value="${vStuCla.stuBirth}" pattern="yyyy-MM-dd" /> " /></td>
        </tr>
        <tr>
            <td>班级号:</td>
            <td><select id="class" name="stuClaId">
                <option value="1"
                        <c:if test="${vStuCla.stuClaId eq '1'}">
                            selected="selected"
                        </c:if>
                >1</option>
                <option value="2"
                        <c:if test="${vStuCla.stuClaId eq '2'}">
                            selected="selected"
                        </c:if>
                >2</option>
            </select></td>
        </tr>
        <tr>
            <td>照片:</td>
            <td>
                <%--<a href="${webRoot}/fileController/downloadFile.do?stuPic=${vStuCla.stuPic}" target="_blank">--%>
                <a href="${webRoot}/fileController/downloadFile.do?stuPic=${vStuCla.stuPic}" target="_blank">
                    <img src="${uploadPath}/${vStuCla.stuPic}" id="imgSrc" name="imgSrc" />
                </a>
                <input type="file" id="picFile" name="picFile" onchange="submitPicUpload()" />
                <input type="hidden" id="stuPic" name="stuPic" value="${vStuCla.stuPic}" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="编辑"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>
