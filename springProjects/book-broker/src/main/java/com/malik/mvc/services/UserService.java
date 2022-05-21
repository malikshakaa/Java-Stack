package com.malik.mvc.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.malik.mvc.models.LoginUser;
import com.malik.mvc.models.User;
import com.malik.mvc.repositories.UserRepository;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    	
    	public List <User> allUsers(){
    		return (List<User>) userRepo.findAll();
    	}
    
    public User register(User newUser, BindingResult result) {
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "found", "The email already exist!");
        return null;
    	}
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
		    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
		    return null;	
		}
		else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashed);
				return userRepo.save(newUser);
			
		}
		
	
    	
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
    	Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
    	if (potentialUser.isEmpty()) {
    		result.rejectValue("email", "Matches","invalid password!");
    		return null;
    	}
    	else {
    		User logUser = potentialUser.get();
    		return logUser;
    	}
    	
    }
    public User newUser(User newUser) {
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
        return userRepo.save(newUser);
    }
	public User findUserById(Long id) {
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			User user1 = user.get();
			return user1;
		} else {
			return null;
		}
}
}
