package com.scaler.blogger.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDTO {

	String email;
	String userName;
	String password;
	
}
