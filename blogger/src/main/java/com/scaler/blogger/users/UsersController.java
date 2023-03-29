package com.scaler.blogger.users;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UsersController {

	private final UsersService usersService;
	
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping("")
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody CreateUserDTO createUser){
		var savedUser = usersService.createUser(createUser);
		return ResponseEntity
				.create(URI.creat("/users/"+savedUser.getId()))
				.body(savedUser);
	}
}
