<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/1
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>insertStudent</title>
    <script type="text/javascript" src="${webRoot}/statics/js/jQuery-core/jquery.js"></script>
    <script type="text/javascript" src="${webRoot}/statics/js/jQuery-core/jquery.form.js"></script>
    <script type="text/javascript">
        function submitPicUpload() {
            var option={
                type:'POST',
                url:'${webRoot}/uploadController/uploadPic.do',
                contentType:"application/json;charset=utf-8",
                dataType:'text',//返回纯文本字符串
                data:{
                    fileName : 'picFile'
                },
                success:function (data) {
                    //把json串转换成json对象
                    var json = $.parseJSON(data);
                    //返回服务器图片路径，把图片路径设置给img标签(没法及时回显！！！！！！！)
                    $("#imgSrc").attr("src", json.absolutePath);
                    //数据库保存相对路径
                    $("#stuPic").val(json.relativePath);
                },
                error:function(){
                    alert("系统错误");
                }
            };
            $("#itemForm").ajaxSubmit(option);
        }
    </script>

</head>
<body>
<h1>新增学生</h1>
<a href="#">返回</a>
<form id="itemForm" action="${webRoot}/studentController/insertStudent.do" method="post">
    <table>
        <tr>
            <td>学号:</td>
            <td><input type="text" id="stuId" name="stuId" /></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" id="stuName" name="stuName" /></td>
        </tr>
        <tr>
            <td>照片:</td>
            <td>
                <%--<img src='http://localhost:8080/upload/tou_xiang.jpg' />能显示（在tomcat的server.xml中配置了虚拟目录）--%>
                <%--http://localhost:8080/demowv/upload/tou_xiang.jpg--%>
                <%--<img src='${webRoot}/upload/tou_xiang.jpg' id="imgSrc" name="imgSrc" width="100px"/>--%>
                <img src='${absolutePath}' id="imgSrc" name="imgSrc" width="100px" />
                <%--<a href="${webRoot}/view/module/submodule/uploadStuPic.jsp" target="_blank"><button type="button">上传图片</button></a>--%>
                <input type="file" id="picFile" name="picFile" onchange="submitPicUpload()" />
                <input type="hidden" id="stuPic" name="stuPic" value="${relativePath}" />
            </td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="radio"  name="stuSex" value="男" checked="checked" />男
                <input type="radio"  name="stuSex" value="女" />女
            </td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text" id="stuBirth" name="stuBirth" /></td>
        </tr>
        <tr>
            <td>班级号:</td>
            <td><select id="class" name="stuClaId">
                <option value="1">1</option>
                <option value="2">2</option>
            </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="新增"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重新填写"/></td>
        </tr>
    </table>
</form>


</body>
</html>
