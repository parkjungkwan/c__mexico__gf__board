<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div id="contentBox">
		<form id="member__remove__form">
			비밀번호 재입력 
			<input type="password" id="password" name="password"/>
			<input id="member__remove__submit" 
				type="button" value="전 송" />
		</form>
	</div>
	<script>1
	$('#member__remove__submit').click(function(){
		if('${user.password}' === $('#password').val()){
			$('#member__remove__form')
			.attr({ action : "${context}/member/remove",
					method : "POST"})
			.submit();	
		}else{
			alert('${user.password} 는 세션 비번');
			alert($('#password').val()+'는 입력 비번');
		}
		
	});
	
	</script>
	
	
	
	
	
	