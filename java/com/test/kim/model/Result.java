package com.test.kim.model;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Result {
    private boolean fileCheck;

    private boolean duplicateCheck;
    private String message;
    private int successCount;
    private int failCount;

    private List<ErrorInfo> errors;

    public Result() {
        fileCheck = true;
        successCount = 0;
        failCount = 0;
        errors =new ArrayList<>();
    }

    public void incSuccessCount() {
        this.successCount++;
    }

    public void incFailCount() {
        this.failCount++;
    }

    public int getSuccessCount() {
        return successCount;
    }
    public void setSuccessCount(int successCount) {
        this.successCount=successCount;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ErrorInfo> getErrors() {
        return errors;
    }

    public void failedErrors(String line, int lineNumber) {
        errors.add(new ErrorInfo(line, lineNumber));
    }

    public void setErrors(List<ErrorInfo> errors) {
        this.errors = errors;
    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }


    public boolean isFileCheck() {
        return fileCheck;
    }

    public void setFileCheck(boolean fileCheck) {
        this.fileCheck = fileCheck;
    }

    public boolean isDuplicateCheck() {
        return duplicateCheck;
    }

    public void setDuplicateCheck(boolean duplicateCheck) {
        this.duplicateCheck = duplicateCheck;
    }
}
