package org.flow.testgit.service;


import org.flow.testgit.model.User;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	 public void saveUser(User user) {
		  // some logic
	 }

	 public void deleteUser(Long id) {
		  // some logic
	 }

  public void deleteUser(Long id) {
    SimpleJpaRepository<T, Long> userRepository;
    userRepository.deleteById(id);
  }

}
