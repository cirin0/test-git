package org.flow.testgit.service;

import lombok.AllArgsConstructor;
import org.flow.testgit.model.User;
import org.flow.testgit.repositoty.UserRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
  public final UserRepo userRepo;

  public void saveUser(User user) {
    userRepo.save(user);
  }

  public void deleteUser(Long id) {
    userRepo.deleteById(id);
  }
}
