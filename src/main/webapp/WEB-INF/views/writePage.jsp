<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>방명록</title>
</head>
<body>
    <h1>내용 작성</h1>
    <br/>
    <br/>
    <form name="board" method="post" action="/write" >
        <div class="form-group row">
            <label for="name" class="col-sm-1 col-form-label">이름</label>
            <div class="col-sm-11">
                <input type="text" class="form-control" id="name" name="name" placeholder="이름을 입력해 주세요.">
            </div>
        </div>
        <div class="form-group row">
            <label for="title" class="col-sm-1 col-form-label">제목</label>
            <div class="col-sm-11">
                <input type="text" class="form-control" id="title" name="title" placeholder="제목을 입력해 주세요.">
            </div>
        </div>
        <div class="form-group">
            <label for="content">내용</label>
            <textarea class="form-control" id="content" name="content" rows="3"></textarea>
        </div>
        <div align="right">
            <button type="submit" class="btn btn-primary">등록</button>
            <button type="button" class="btn btn-success" onclick="location.href='/list'">목록</button>
        </div>
    </form>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
