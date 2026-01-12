package com.taskflow.taskmanager.dto.response;

import java.time.LocalDateTime;

public class ApiErrorResponse {

    private String code;
    private String message;
    private String path;
    private LocalDateTime timestamp;

    public ApiErrorResponse(String code, String message, String path) {
        this.code = code;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    public String getCode() { return code; }
    public String getMessage() { return message; }
    public String getPath() { return path; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
