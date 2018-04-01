<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>방명록</title>
</head>
<body>
    <h1>상세페이지</h1>
    <br/>
    <br/>
    <div class="form-group row">
        <label class="col-sm-1 col-form-label">이름</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" readonly value="${content.name}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-1 col-form-label">제목</label>
        <div class="col-sm-11">
            <input type="text" class="form-control" readonly value="${content.title}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-1">내용</label>
        <div class="col-sm-11">
            <textarea class="form-control" rows="3" readonly>${content.content}</textarea>
        </div>
    </div>
    <div align="right">
        <button type="button" class="btn btn-success" onclick="location.href='/list'">목록</button>
    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
