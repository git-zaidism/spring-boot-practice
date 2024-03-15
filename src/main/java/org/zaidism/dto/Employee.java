package org.zaidism.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
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
