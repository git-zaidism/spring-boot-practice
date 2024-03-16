package org.zaidism.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Data
public class ErrorResponse {
  Set<String> errorMessage;
}
