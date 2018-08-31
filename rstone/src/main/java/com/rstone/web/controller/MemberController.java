package com.rstone.web.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import com.rstone.web.domain.*;
import com.rstone.web.service.MemberService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
@Controller
@RequestMapping("/member")
@SessionAttributes("user")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(
			Model model,
			@ModelAttribute MemberDTO member) {
		logger.info("\n MEMBER__ADD's PARAM is {} !!--------",member.toString());
		memberService.add(member);
		return "auth:member/login.tiles";
	}
	@RequestMapping("/list")
	public String list() {
		return "";
	}
	@RequestMapping("/search")
	public String search() {
		return "";
	}
	@RequestMapping("/retrieve/{userid}")
	public String retrieve(
			@PathVariable String userid,
			Model model) {
		member.setUserid(userid);
		model.addAttribute("user", memberService.retrieve(member));
		return "auth:member/retrieve.tiles";
	}
	@RequestMapping("/count")
	public String count() {
		return "";
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(Model model,
			@ModelAttribute("user") MemberDTO user){
		logger.info("member :: id :: " + this.member.getUserid());
		logger.info("modify()");
		memberService.modify(member);
		return "auth:member/retrieve.tiles";
	}
	@RequestMapping("/remove")
	public String remove(
			@ModelAttribute("user") MemberDTO user,
			SessionStatus session) {
		logger.info("member :: id :: " + user.getUserid());
		logger.info("remove()");
		memberService.remove(user);
		session.setComplete();
		return "redirect:/";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
			@ModelAttribute("member") MemberDTO member,
			Model model) {
		logger.info("\n LOGIN__PARAM is {}",member.toString());
		
		if(memberService.login(member)) {
			this.member = memberService.retrieve(member);
			model.addAttribute("user", this.member);
		}else {
			logger.info("\n LOGIN is FAIL");
			return "auth:member/login.tiles" ;
		}
		logger.info("\n LOGIN__RESULT is {}",model.toString());
		return "auth:common/content.tiles";
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus session) {
		logger.info("logout()");
		session.setComplete();
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public String fileupload() {
		return "";
	}
}
