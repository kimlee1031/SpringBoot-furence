package com.test.kim.model;


import lombok.extern.slf4j.Slf4j;

//2
@Slf4j
public class ErrorInfo {
    private String errorLine;
    private int lineNumber;

    public ErrorInfo(String errorLine, int lineNumber) {
        this.errorLine = errorLine;
        this.lineNumber = lineNumber;
        log.info("errorinfo 생성");  
    }

    public String getErrorLine() {
        return errorLine;
    }

    public void setErrorLine(String errorLine) {
        this.errorLine = errorLine;
    }

    public int  getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
