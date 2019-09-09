package org.ice;

import org.ice.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SourceSpApplication  {

	private static UserService userService;

	public SourceSpApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SourceSpApplication.class, args);
		String userInfo = userService.getUserInfo("userid_01");
		System.out.println(userInfo);
	}

}
