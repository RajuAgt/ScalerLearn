package com.scaler.blogger.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponseDTO {
	String email;
	String userName;
	String password;
}
