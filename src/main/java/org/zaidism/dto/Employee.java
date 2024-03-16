package org.zaidism.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {

  @NotNull private Integer id;

  @NotEmpty(message = "Name cannot be empty.")
  private String name;

  @PastOrPresent(message = "Date of joining should be in the past or present.")
  private LocalDate dateOfJoining;

  @NotNull(message = "Salary cannot be null.")
  @Positive(message = "Salary must be positive.")
  private double salary;

  @NotEmpty private List<String> techStack;
}
