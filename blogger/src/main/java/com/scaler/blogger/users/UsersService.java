package com.scaler.blogger.users;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	private final UsersRepository usersRepository;
	private final ModelMapper modelMapper;
	
	public UsersService(@Autowired UsersRepository usersRepository, @Autowired ModelMapper modelMapper) {
		this.usersRepository = usersRepository;
		this.modelMapper = modelMapper;
	}
	
	public UserResponseDTO createUser(CreateUserDTO createUserDTO) {
		//TODO Encrypt password
		//TODO Validate Email
		//TODO Check if username already Exists
		var newUserEntity = modelMapper.map(createUserDTO, UserEntity.class);
		var savedUser = usersRepository.save(newUserEntity);
		var userResponseDTO = modelMapper.map(savedUser, UserResponseDTO.class);
		return userResponseDTO;
	}
	
	public UserResponseDTO loginUser(LoginUserDTO loginUserDTO) {
		
		var userEntity = usersRepository.findByUserName(loginUserDTO.getUserName());
		if(userEntity == null) {
			throw new UserNotFoundException(userEntity.getUserName());
		}
		//TODO Encrypt password implement this logic
		if(!userEntity.getPassword().equals(loginUserDTO.getUserName())) {
			throw new IncorrectPasswordException();
		}
		
		var userResponseDTO = modelMapper.map(userEntity, UserResponseDTO.class);
		return userResponseDTO;
	}
	
	public static class UserNotFoundException extends IllegalArgumentException{
		public UserNotFoundException(Integer id) {
			super("User with id "+id+" not found");
		}
		
		public UserNotFoundException(String userName) {
			super("User with username "+userName+" not found");
		}
	}
	
	public static class IncorrectPasswordException extends IllegalArgumentException{
		public IncorrectPasswordException() {
			super("Incorrect Password");
		}
		
	}
}
