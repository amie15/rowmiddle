
package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
* ユーザー情報 Entity
*/
@Entity

@Table(name = "user")
public class UserEntity {

/**
* ID
*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
//1行追加
private String id;
/**
* 名前
*/
@Column(name = "name")
private String name;

/**
* 住所
*/
@Column(name = "address")
private String address;

/**
* 電話番号
*/
//2行追加

@Column(name = "phone")
private String phone;

/**
* 更新日時
*/
//2行追加

@Column(name = "update_date")
private String update_date;

/**
* 登録日時
*/
@Column(name = "create_date")
private Date createDate;

}






