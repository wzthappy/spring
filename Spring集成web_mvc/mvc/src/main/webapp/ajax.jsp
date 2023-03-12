<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<script src="./js/jquery.min.js"></script>
<script>
  let userList = [];
  userList.push({name: "zhangsan", age: 20});
  userList.push({name: "中国", age: 20});
  let stringify = JSON.stringify(userList)
  $.ajax({
    url: "${pageContext.request.contextPath}/user/quick14",
    type: "post",
    data: stringify,
    contentType: "application/json;charset=utf-8"
  });

</script>
</body>
</html>
