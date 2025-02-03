package org.flow.testgit.repositoty;

import org.flow.testgit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
