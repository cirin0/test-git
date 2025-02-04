package org.flow.testgit.model;

import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "products")
@Data
public class Product {
  private Long id;
  private String name;
  private String description;

  private Double price;

}
