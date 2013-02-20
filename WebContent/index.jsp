<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="POST" action='Controller' name="edit">
<table>
  <tr>
    <td>Question:</td>
    <td><input type="text" name="question"></td>
  </tr>
  <tr>
    <td>Answer:</td>
    <td><input type="text" name="answer"></td>
  </tr>
  <tr>
    <td>Wrong answer:</td>
    <td><input type="text" name="wrongAnwer"></td>
  </tr>
  <tr>
    <td>Wrong answer 2:</td>
    <td><input type="text" name="wrongAnwer2"></td>
  </tr>
  <tr>
    <td>Wrong answer 3:</td>
    <td><input type="text" name="wrongAnwer3"></td>
  </tr>
  <tr>
    <td>Course id</td>
    <td><input type="text" name="courseID"></td>
  </tr>
  <tr>
    <td><input type="submit" value="save"> <input
      type="reset" value="reset"> <input type="submit" value="back">
    </td>
  </tr>
</table>
</form>

</body>
</html> 