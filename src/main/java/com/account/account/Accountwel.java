package com.account.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class Accountwel {

		@GetMapping("/account")
		public String welcome() {
			return "Welcome to String boot account";
		}
		
	}


