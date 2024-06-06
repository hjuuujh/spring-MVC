package org.example.websample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.websample.exception.ErrorCode;

@AllArgsConstructor
@Data
public class ErrorResponse {
    private ErrorCode errorCode;
    private String message;
}
