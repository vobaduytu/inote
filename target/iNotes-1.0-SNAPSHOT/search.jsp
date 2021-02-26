<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2/23/2021
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>

<div>

    <div class="row ml-3 mb-3">
        <a href="note" type="button" class="btn btn-primary">Exit</a>
    </div>
    <p>${mess}</p>
    <form action="/note?action=updateNote" method="post">
        <table class="table table-borderless">
            <thead>
            <tr>
                <th scope="col">Tiêu Đề</th>
                <th scope="col">Nộ Dung</th>
                <th scope="col">Phân Loại</th>

            </tr>
            <tr>
                <th scope="col">${note.title}</th>
                <th scope="col">${note.content}</th>
                <th scope="col">${note.noteType.name}</th>

            </tr>
            </thead>

        </table>
<%--        <input type="hidden" name="id" value="${note.id}">--%>
<%--        <div>--%>
<%--            <h5>Tiêu Đề</h5>--%>
<%--            <input  type="text" name="title" value="${note.title}">--%>
<%--        </div>--%>
<%--        <div> <h5>Nội Dung</h5>--%>
<%--            <input type="text" name="content" value="${note.content}">--%>
<%--        </div>--%>
<%--        <div> <h5>Phân loại</h5>--%>
<%--            <input type="text" name="content" value="${note.noteType.name}">--%>
<%--        </div>--%>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
        crossorigin="anonymous"></script>

</body>
</html>
