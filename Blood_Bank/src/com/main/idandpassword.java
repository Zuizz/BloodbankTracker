package com.main;

import java.util.HashMap;

public class idandpassword {
	static HashMap<String,String> logininfo = new HashMap<String,String>();
	
	idandpassword(){
		logininfo.put("Zuizz", "Hello");
		logininfo.put("Neha", "Ghemud");
		logininfo.put("Saahil", "Kaaliya");
		logininfo.put("musthakeem", "rowthar");
		
		
	}
	
	 static HashMap getlogininfo() {
		return logininfo;
	}
}
