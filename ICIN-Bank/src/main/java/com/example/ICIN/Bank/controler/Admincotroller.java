package com.example.ICIN.Bank.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ICIN.Bank.model.Admin;
import com.example.ICIN.Bank.model.Users;
import com.example.ICIN.Bank.repo.adminrepoo;

@RestController
public class Admincotroller {
	
	@Autowired
	adminrepoo  repoo;

	 @GetMapping("/allusers")
	public List<Admin> getuserss(){
		return repoo.findAll();
	}
	 
	

}
