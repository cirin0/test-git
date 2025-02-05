package org.flow.testgit.service;


import org.flow.testgit.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	 public void saveUser(User user) {
		  // some logic
	 }

	 public void deleteUser(Long id) {
		  // some logic
	 }

  public void updateUser(User user) {
    // some logic
  }

  public User getUserById(Long id) {
    // some logic
    return new User();
  }

  public User getUserByEmail(String email) {
    // some logic
    return new User();
  }

}
