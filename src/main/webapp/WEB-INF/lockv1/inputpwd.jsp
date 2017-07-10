<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: why777s
  Date: 2017/7/9
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入密码</title>
</head>
<body>

<s:hidden name="bbb" value="#request.bikdPWD"/>
该车密码（密码会动态变化）:
<s:property  value="#request.bikdPWD"/>
<br/>
<br/>
输入密码解锁(模拟解锁过程) :
<br/>
<br/>

<s:form action="unlock1">
    <s:textfield name="pwd"/>
    <s:hidden name="rightPwd" value="%{bikdPWD}"/>
    <s:submit value="解锁"/>
</s:form>



</body>
</html>
