
package com.example.demo.entity;

import java.util.Date;


/**
* ユーザー情報 Entity
*/
@Entity

@Table(name = "Spring1")
public class UserEntity {

/**
* ID
*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
//2行追加

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

/**
* 更新日時
*/
//2行追加

/**
* 登録日時
*/
@Column(name = "create_date")
private Date createDate;

}






