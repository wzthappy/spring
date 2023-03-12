<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick18" method="post"
      enctype="multipart/form-data">
  名称: <input type="text" name="username"/><br/>
  上传的图片: <input type="file" name="uploadFile" id="personsFile" onchange="uploadImg()"/><br/>
  <input type="submit" value="提交"/>


  <script type="text/javascript">
    function uploadImg() {
      var _name, _fileName, personsFile;
      personsFile = document.getElementById("personsFile");
      _name = personsFile.value;
      _fileName = _name.substring(_name.lastIndexOf(".") + 1).toLowerCase();
      if (_fileName !== "png" && _fileName !== "jpg") {
        alert("上传图片格式不正确，请重新上传");
      }
    }
  </script>
</form>
</body>
</html>
