package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
* ユーザー情報 Controller
*/
@Controller
public class UserController {
///**
//* ユーザー情報 Service
//*/
////2行追加
//
///**
//* ユーザー情報一覧画面を表示
//* @param model Model
//* @return ユーザー情報一覧画面のHTML
//*/
//@RequestMapping("/user/list")
//public String displayList(Model model) {
//
////3行追加
//
//
//
//}
//}
	@GetMapping("/")
	public String a() {
		return "index";
		
		
	}
	
}