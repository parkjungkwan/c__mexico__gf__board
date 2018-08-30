package com.rstone.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Lazy @Component
public class MemberDTO {
	private String userid,
			ssn, 
			name,
			gender,
			age,
			roll, 
			teamid,
			password,
			email,
			phone
			;

	
}
