import org.springframework.stereotype.Service;

//package com.example.demo.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
//* ユーザー情報 Service
//*/
////アノテーション追加
@Service

@Transactional(rollbackFor = Exception.class)
public class UserService {
	
	public String message() {
		String i = "ドラえもん";
		return i;
		
	}
}