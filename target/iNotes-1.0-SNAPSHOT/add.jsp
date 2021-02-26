<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2/25/2021
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Admin Product Manage</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <!-- Fontfaces CSS-->
    <link href="${pageContext.request.contextPath}/admin-assets/css/font-face.css" rel="stylesheet" media="all">
    <link
            href="${pageContext.request.contextPath}/admin-assets/vendor/font-awesome-4.7/css/font-awesome.min.css"
            rel="stylesheet" media="all">
    <link
            href="${pageContext.request.contextPath}/admin-assets/vendor/font-awesome-5/css/fontawesome-all.min.css"
            rel="stylesheet" media="all">
    <link
            href="${pageContext.request.contextPath}/admin-assets/vendor/mdi-font/css/material-design-iconic-font.min.css"
            rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/bootstrap-4.1/bootstrap.min.css"
          rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/animsition/animsition.min.css"
          rel="stylesheet" media="all">
    <link
            href="${pageContext.request.contextPath}/admin-assets/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
            rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/wow/animate.css" rel="stylesheet"
          media="all">
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/css-hamburgers/hamburgers.min.css"
          rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/slick/slick.css" rel="stylesheet"
          media="all">
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/select2/select2.min.css"
          rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/admin-assets/vendor/perfect-scrollbar/perfect-scrollbar.css"
          rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="${pageContext.request.contextPath}/admin-assets/css/theme.css" rel="stylesheet" media="all">

</head>
<body>
<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="container-fluid">

            <div class="row">
                <div class="col-12 col-md-12">
                    <h3 class="title-5 m-b-35">Note</h3>
                </div>
                <div class="row ml-3 mb-3">
                    <a href="note" type="button" class="btn btn-primary">Exit</a>
                </div>
            </div>
            <div class="row">
                <c:if test="${message!=null}">
                    <div class="col-12 col-md-12">
                        <div class="alert alert-primary"><i>${message}</i></div>
                    </div>
                </c:if>
            </div>
            <div class="row">
                <!-- FORM ADD-->
                <div class="col-12 col-md-12">
                    <form  method="post" class="form-horizontal">
                        <div class="card-header">
                            <strong>Add Note</strong>
                        </div>
                        <div class="card-body card-block">
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="title" class=" form-control-label">Tiêu đề</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" name="title" id="title" placeholder="title"
                                           required value="${Note.title}" class="form-control">
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="content" class=" form-control-label">Content</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" id="content" name="content"
                                           placeholder="content" value="${Note.content}"
                                           class="form-control">
                                </div>
                            </div>


                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="NoteType" class=" form-control-label">Category</label>
                                </div>
                                <div class="col col-md-9">
                                    <select name="NoteType" id="NoteType"  class="form-control">
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
<script src="${pageContext.request.contextPath}/admin-assets/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap JS-->
<script src="${pageContext.request.contextPath}/admin-assets/vendor/bootstrap-4.1/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/bootstrap-4.1/bootstrap.min.js"></script>
<!-- Vendor JS       -->
<script src="${pageContext.request.contextPath}/admin-assets/vendor/slick/slick.min.js">

</script>
<script src="${pageContext.request.contextPath}/-assets/vendor/wow/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/animsition/animsition.min.js"></script>
<script
        src="${pageContext.request.contextPath}/admin-assets/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">

</script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/counter-up/jquery.waypoints.min.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/counter-up/jquery.counterup.min.js">

</script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/circle-progress/circle-progress.min.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/chartjs/Chart.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/admin-assets/vendor/select2/select2.min.js">

</script>

<!-- Main JS-->
<script src="${pageContext.request.contextPath}/admin-assets/js/main.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

</html>
