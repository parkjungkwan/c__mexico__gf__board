<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
          		게시판 <span class="caret"></span>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="board__write">게시글쓰기</a></li>
            <li><a id="board__list">게시글목록보기</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
          		${user.name} 페이지 <span class="caret"></span>
          		<input type="hidden" id="session__id" value="${user.userid}" />
          </a>
          <ul class="dropdown-menu" role="menu">
          	<li><a id="mypage__btn" >마이페이지</a></li>
          	<li><a id="modify__btn" >정보수정</a></li>
            <li><a id="logout__btn" >로그아웃</a></li>
            <li><a id="member__remove__btn" >회원탈퇴</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<script>
$('#modify__btn').click(function() {
	location.href = '${context}/move/public/member/modify';
});
$('#mypage__btn').click(function() {
	location.href = '${context}/move/auth/member/retrieve';
});
$('#member__remove__btn').click(function() {
	location.href = '${context}/move/auth/member/remove';
});
$('#board__write').click(function(){
	location.href = '${context}/move/public/board/write';
});
$('#board__list').click(function(){
	alert('board__list click!!');
});

</script>















