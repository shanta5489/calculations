package com.wa.calculations.request;

import java.io.File;
import java.io.Serializable;

public class CalculationsRequest implements Serializable {

    private String searchString;

    private File bankStatement;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public File getBankStatement() {
        return bankStatement;
    }

    public void setBankStatement(File bankStatement) {
        this.bankStatement = bankStatement;
    }

    @Override
    public String toString() {
        return "CalculationsRequest{" +
                "searchString='" + searchString + '\'' +
                ", bankStatement=" + bankStatement +
                '}';
    }
}
