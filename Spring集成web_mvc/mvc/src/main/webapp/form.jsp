<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick13" method="post">
  <!-- 表明是第几个User对象的username age -->
  <input type="text" name="userList[0].name"><br/>
  <input type="text" name="UserList[0].age"><br/>

  <input type="text" name="userList[1].name"><br/>
  <input type="text" name="UserList[1].age"><br/>
  <input type="submit" value="提交">
</form>
</body>
</html>
