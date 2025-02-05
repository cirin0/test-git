package org.flow.testgit.model;

import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "users")
@Data
public class User {
  private Long id;
  private String name;
  private String email;
  private String password;
  private String role;
  private String number;
  private String scholl;
  private String schollllll;

  private String address;
  private String phone;
  private String imageUrl;

}
