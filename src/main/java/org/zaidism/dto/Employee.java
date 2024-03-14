package org.zaidism.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
  @NotNull Integer id;
  @NotEmpty(message = "Name cannot be empty.") String name;
  @Email(message = "Email is not in the valid format.") String email;
  @PastOrPresent(message = "Date of joining should be in the past or present.")LocalDateTime dateOfJoining;
}
