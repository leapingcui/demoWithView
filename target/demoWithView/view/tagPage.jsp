<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%
    response.setHeader("cache-control", "max-age=5,public,must-revalidate"); //one day
    response.setDateHeader("expires", -1);
    String cdntime = String.valueOf(System.currentTimeMillis());
    request.setAttribute("cdntime",cdntime);
%>
<c:set value="${pageContext.request.contextPath}" var="webRoot" />

<%
// 获得服务器上传的地址(例如: http://localhost:8080/upload/)赋值给basePath变量
    String uploadPath = request.getScheme()+"://"+request.getServerName()
            +":"+request.getServerPort()+"/upload";
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。
%>
<c:set value="<%=uploadPath%>" var="uploadPath" />
