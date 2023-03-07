package com.jsokol.househunter.services;

import java.util.Date;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jsokol.househunter.models.House;
import com.jsokol.househunter.models.LoginUser;
import com.jsokol.househunter.models.User;
import com.jsokol.househunter.repositories.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private HouseService hServ;
	
	public User createOrSave(User user, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		if(repo.findByEmail(user.getEmail()).isPresent()){
			result.rejectValue("email", "email", "Already Registered. Please Log In");
			return null;
		}
		
		//Age Check
		long curDate = new Date().getTime();
		long uDate = user.getBirthday().getTime();
		long minTime = 568025136000L ;
		if(curDate - uDate <= minTime) {
			result.rejectValue("birthday", "birthday", "Must Be Over 18 To Register");
			return null;
		}
		
		if(!user.getPassword().equals(user.getConfirm())) {
			result.rejectValue("password", "password", "Passwords Must Match");
			return null;
		}
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		
		return repo.save(user);
	}
	
	public User login(LoginUser loguser,BindingResult result){
		if(result.hasErrors()) {
			return null;
		}
		if(!repo.findByEmail(loguser.getEmail()).isPresent()){
			result.rejectValue("email", "email", "Email Not Found");
			return null;
		}
		
		if(!BCrypt.checkpw(loguser.getPassword(), repo.findByEmail(loguser.getEmail()).get().getPassword())){
			result.rejectValue("password", "password", "Invalid Password");
			return null;
		}
		User vUser = repo.findByEmail(loguser.getEmail()).get();
		return vUser;
	}
	
	public User getById(Long id) {
		User loggedUser = repo.findById(id).get();
		return loggedUser;
	}
	
	
	
	
}
