<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2/26/2021
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: Asus--%>
<%--  Date: 2/23/2021--%>
<%--  Time: 2:16 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"--%>
<%--          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">--%>

<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <h2 class="text-center">Các ghi chú</h2> <br>--%>
<%--    <div class="row">--%>
<%--        <div style="display: flex">--%>
<%--            <form action="/note?action=search" method="post">--%>
<%--                    <input type="search" placeholder="STT" name="id">--%>
<%--                    <input  type="submit" value="Tìm">--%>
<%--            </form>--%>
<%--        </div>--%>

<%--        <div class="col-md-2 mb-2">--%>
<%--            <a href="/note?action=inserNote">thêm ghi chú</a>--%>
<%--        </div>--%>
<%--        <table class="table table-striped">--%>
<%--            <thead>--%>
<%--            <tr>--%>
<%--                <th scope="col">STT</th>--%>
<%--                <th scope="col">Tiêu đề</th>--%>
<%--                <th scope="col">Phân loại</th>--%>
<%--                <th scope="col"></th>--%>
<%--            </tr>--%>
<%--            </thead>--%>
<%--            <tbody>--%>
<%--            <c:forEach items="${noteList}" var="note">--%>
<%--                <tr>--%>
<%--                    <td scope="row">${note.id}</td>--%>
<%--                    <td>${note.title}</td>--%>
<%--                    <td>${note.noteType.name}</td>--%>
<%--                    <td><a href="/note?action=delete&id=${note.id}" onclick="return confirm('co chac muon xoa khong?')">Xóa--%>
<%--                        |</a>--%>
<%--                        <a href="/note?action=updateNote&id=${note.id}">Sửa</a>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
<%--            </tbody>--%>
<%--        </table>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"--%>
<%--        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"--%>
<%--        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--</body>--%>
<%--</html>--%>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2/24/2021
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Tables</title>

    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
<div class="page-wrapper">
    <!-- HEADER MOBILE-->
    <%----%>
    <!-- END HEADER MOBILE-->

    <!-- MENU SIDEBAR-->
    <aside class="menu-sidebar d-none d-lg-block">
        <div class="logo" style="background: #fff; box-shadow: none">
            <a href="#">
                <img src="images/icon/download.png" alt="Cool Admin"/>
            </a>
        </div>
        <div class="menu-sidebar__content js-scrollbar1">
            <nav class="navbar-sidebar">
                <ul class="list-unstyled navbar__list">
                    <li>
                        <a href="/note?action=insertNote">Thêm tài khoản mới</a>
                    </li>

                    <li>
                        <a href="/listmany.jsp">
                            <i class="fas fa-chart-bar"></i>Cho đời sống</a>
                    </li>
                    <li class="active">
                        <a href="/listmany.jsp">
                            <i class="fas fa-table"></i>Cho công việc</a>
                    </li>
                    <li>
                        <a href="/listmany.jsp">
                            <i class="far fa-check-square"></i>Cho trường học</a>
                    </li>
                    <li>
                        <a href="/listmany.jsp">
                            <i class="fas fa-calendar-alt"></i>Cho gia đình</a>
                    </li>
                    <li>
                        <a href="/listmany.jsp">
                            <i class="fas fa-map-marker-alt"></i>Viết nhật kí</a>
                    </li>
                    <li class="has-sub">
                        <a class="js-arrow" href="/listmany.jsp">
                            <i class="fas fa-copy"></i>Viết nhắc nhở</a>

                </ul>
            </nav>
        </div>
    </aside>
    <!-- END MENU SIDEBAR-->

    <!-- PAGE CONTAINER-->
    <div class="page-container">
        <!-- HEADER DESKTOP-->
        <header class="header-desktop">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="header-wrap">
                        <form class="form-header">
                        </form>
                        <div class="header-button">

                            <div class="account-wrap">
                                <div class="account-item clearfix js-item-menu">
                                    <div class="image">
                                        <img src="https://lh3.googleusercontent.com/-lHmEsP7U6rg/YAl9i1aPXXI/AAAAAAAAAHc/6-IdXAksmU0rp1xXJboVIa0RryfT-V98gCEwYBhgLKtMDAL1OcqzNyw6dsAHNScg8FcmDM8QrP1I3Ho33kvXp-NnAUl31lY31KnEet5ViW4_todh5cihQparDN9PJ1WFYd72z0-fz0KEDYI3nVMS4dfOdaWuKyItZsqGHZdPy5KtkWrmxGiNnEwCS7CzNg08uEw4SxtjMlFUtHua2pZMI9s1_C3L4kcOmRCKhXButTtd0FtnImLvDQa-WcVKZxRm5mz1KnG-kWht2HhnstTzp7992qB8sqJCtiAUuD_nXcM-tlg5yNzOsH4NmShOISxJ4sbpJ6Yurx1NPH2wFf_HAcCW0sgxHdkwhbg5Flfpai-WADiFSKq6m2Oy3zDtHSJNDP8eCyAix9iu2urJEVi_a4nkKRhgCOlKEBYlpajM9X9W5RpI_wENVGpg3rGFWihrVcgZY17P55qw200-Lv5bUj5Ndwuf6XWAKiwf6d9U0fNWDqlz3Gtmt06JTz6ENSvrkGtR0sgBwD1MFWnsd8eAi6b9-RMWDf2uN4ZQYEYDbnNMh7tJ89A8b03X1_l90dsbWlqw9tPoQ_r0s97yNzW6OydDN4B2xwQTLDncftxvHJaNmqqktUTXTRLHQ6ch_TVbEOdwM3u_yodWDQo_KVAFXsNVYQ6ows6zhgQY/w139-h140-p/61437896_2310298219289327_7566582316454117376_o.jpg" alt="John Doe"/>
                                    </div>
                                    <div class="content">
                                        <a class="js-acc-btn" href="//www.facebook.com/profile.php?id=100009275134964">ADmin: Duy Tự</a>
                                    </div>
                                    <div class="account-dropdown js-dropdown">
                                        <div class="info clearfix">
                                            <div class="image">
                                                <a href="#">
                                                    <img src="https://lh3.googleusercontent.com/-lHmEsP7U6rg/YAl9i1aPXXI/AAAAAAAAAHc/6-IdXAksmU0rp1xXJboVIa0RryfT-V98gCEwYBhgLKtMDAL1OcqzNyw6dsAHNScg8FcmDM8QrP1I3Ho33kvXp-NnAUl31lY31KnEet5ViW4_todh5cihQparDN9PJ1WFYd72z0-fz0KEDYI3nVMS4dfOdaWuKyItZsqGHZdPy5KtkWrmxGiNnEwCS7CzNg08uEw4SxtjMlFUtHua2pZMI9s1_C3L4kcOmRCKhXButTtd0FtnImLvDQa-WcVKZxRm5mz1KnG-kWht2HhnstTzp7992qB8sqJCtiAUuD_nXcM-tlg5yNzOsH4NmShOISxJ4sbpJ6Yurx1NPH2wFf_HAcCW0sgxHdkwhbg5Flfpai-WADiFSKq6m2Oy3zDtHSJNDP8eCyAix9iu2urJEVi_a4nkKRhgCOlKEBYlpajM9X9W5RpI_wENVGpg3rGFWihrVcgZY17P55qw200-Lv5bUj5Ndwuf6XWAKiwf6d9U0fNWDqlz3Gtmt06JTz6ENSvrkGtR0sgBwD1MFWnsd8eAi6b9-RMWDf2uN4ZQYEYDbnNMh7tJ89A8b03X1_l90dsbWlqw9tPoQ_r0s97yNzW6OydDN4B2xwQTLDncftxvHJaNmqqktUTXTRLHQ6ch_TVbEOdwM3u_yodWDQo_KVAFXsNVYQ6ows6zhgQY/w139-h140-p/61437896_2310298219289327_7566582316454117376_o.jpg" alt="John Doe"/>

                                                </a>
                                            </div>
                                            <div class="content">
                                                <h5 class="name">
                                                    <a href="//www.facebook.com/profile.php?id=100009275134964">Chủ Tịch</a>
                                                </h5>
                                                <span class="email">Liên hệ tôi: 0799048174</span>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- END HEADER DESKTOP-->

        <!-- MAIN CONTENT-->
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row m-t-30">
                        <div class="col-md-12">
                            <!-- DATA TABLE-->
                            <div class="table-responsive m-b-40">
                                <table class="table table-borderless table-data3">
                                    <thead>
                                    <tr>
                                        <th>STT</th>
                                        <th>tài khoản</th>
                                        <th>Mật khẩu</th>
                                        <th>Hoạt động</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach items="${loginList}" var="note">
                                        <tr>
                                            <td>${note.id}</td>
                                            <td>${note.fullname}</td>
                                            <td>${note.password}</td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/adminl?action=delete&id=${note.id}"
                                                   onclick="return confirm('co chac muon xoa khong?')">Xóa
                                                    |</a>
                                                <a href="${pageContext.request.contextPath}/adminl?action=selectlogin&id=${note.id}">xem trộm</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- END DATA TABLE-->
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="copyright">
                                <p>VobaduyTu © 2001 . created this page <a href="https://colorlib.com">Colorlib</a>.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- Jquery JS-->
<script src="vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap JS-->
<script src="vendor/bootstrap-4.1/popper.min.js"></script>
<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
<!-- Vendor JS       -->
<script src="vendor/slick/slick.min.js">
</script>
<script src="vendor/wow/wow.min.js"></script>
<script src="vendor/animsition/animsition.min.js"></script>
<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
</script>
<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
<script src="vendor/counter-up/jquery.counterup.min.js">
</script>
<script src="vendor/circle-progress/circle-progress.min.js"></script>
<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
<script src="vendor/chartjs/Chart.bundle.min.js"></script>
<script src="vendor/select2/select2.min.js">
</script>

<!-- Main JS-->
<script src="js/main.js"></script>

</body>

</html>
<!-- end document-->

</body>
</html>
