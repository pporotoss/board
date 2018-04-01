<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>방명록</title>
</head>
<body>
    <h1>방명록</h1>
    <br/>
    <br/>
    <table class="table">
        <thead class="thead-light">
        <tr align="center">
            <th scope="col" width="10%">#</th>
            <th scope="col" width="50%">제목</th>
            <th scope="col" width="20%">작성자</th>
            <th scope="col" width="20%">시간</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${list}" var="content">
            <tr align="center">
                <th scope="row">${content.boardId}</th>
                <td><a href="/detail?boardId=${content.boardId}">${content.title}</a></td>
                <td>${content.name}</td>
                <td><fmt:formatDate value="${content.regDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <div align="right">
        <button type="button" class="btn btn-primary" onclick="location.href='/writePage'">등록</button>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
