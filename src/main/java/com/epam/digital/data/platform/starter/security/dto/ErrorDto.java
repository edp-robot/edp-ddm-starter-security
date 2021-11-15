package com.epam.digital.data.platform.starter.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {

  private String traceId;
  private String code;
  private String message;
  private String localizedMessage;
}