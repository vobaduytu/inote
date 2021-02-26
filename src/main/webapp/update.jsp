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
<%--<div>--%>


<%--    <p>${mess}</p>--%>
<%--    <form action="/note?action=updateNote" method="post">--%>
<%--        <input type="hidden" name="id" value="${note.id}">--%>
<%--        <div>--%>
<%--            <h5>Tiêu Đề</h5>--%>
<%--            <input  type="text" name="title" value="${note.title}">--%>
<%--        </div>--%>
<%--        <div> <h5>Nội Dung</h5>--%>
<%--            <input type="text" name="content" value="${note.content}">--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <div class="col-md-3 mb-3">--%>
<%--                <select name="noteType"  class="custom-select" id="validationDefault04" required>--%>
<%--                    <c:forEach var="list" items="${listNoteType}">--%>
<%--                        <option value="${list.id}">${list.name}</option>--%>
<%--                    </c:forEach>--%>
<%--                </select>--%>
<%--            </div>--%>

<%--            <input type="submit" value="Lưu">--%>
<%--        </div>--%>

<%--    </form>--%>
<%--</div>--%>
<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"--%>
<%--        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"--%>
<%--        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--</body>--%>
<%--</html>--%>






                <div class="col-12 col-md-12">
                    <form action="/note?action=updateNote" method="post">
                        <input type="hidden" name="id" value="${note.id}">
                        <div class="card-header">
                            <strong>UPDATE</strong>
                        </div>
                        <div class="card-body card-block">
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="title" class=" form-control-label">Tiêu đề</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" name="title" id="title" placeholder="title"
                                           required value="${note.title}" class="form-control">
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="content" class=" form-control-label">Content</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" id="content" name="content"
                                           placeholder="content" value="${note.content}"
                                           class="form-control">
                                </div>
                            </div>


                        </div>
                        <div class="row form-group">
                            <div class="col col-md-3">
                                <label for="NoteType" class=" form-control-label">Category</label>
                            </div>
                            <div class="col col-md-9">
                                <select name="noteType" id="noteType"  class="form-control">
                                    <c:forEach items="${listNoteType}" var="list">
                                        <option value="${list.id}">${list.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="card-footer">
                            <button type="submit" class="btn btn-primary btn-sm">
                                <i class="fa fa-dot-circle-o"></i> Submit
                            </button>
                            <button type="reset" class="btn btn-danger btn-sm">
                                <i class="fa fa-ban"></i> Reset
                            </button>
                        </div>
                    </form>
                </div>

            </div>
            <div class="row">
                <div class="col-md-12">

                </div>
            </div>
        </div>
    </div>
</div>
</body>
<!-- Jquery JS-->

<!-- Main JS-->
<script src="${pageContext.request.contextPath}/admin-assets/js/main.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

</html>
