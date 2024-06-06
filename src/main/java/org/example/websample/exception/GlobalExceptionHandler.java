package org.example.websample.exception;


import lombok.extern.slf4j.Slf4j;
import org.example.websample.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 모든 controller에 동일한 exception handler 추가
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<ErrorResponse> handleIllegalAccessException(IllegalAccessException e) {
        log.error(e.getMessage());
        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .header("newHeader", "Some Value")
                .body(new ErrorResponse(ErrorCode.TOO_BIG_ID_ERROR,
                        "IllegalAccessException is occurred."));
    }

    @ExceptionHandler(WebSampleException.class)
    public ResponseEntity<ErrorResponse> handleIllegalAccessException(WebSampleException e) {
        log.error(e.getMessage());
        return ResponseEntity
                .status(HttpStatus.INSUFFICIENT_STORAGE)
                .body(new ErrorResponse(e.getErrorCode(),
                        "IllegalAccessException is occurred."));
    }
}
