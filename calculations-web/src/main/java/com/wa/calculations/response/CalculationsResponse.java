package com.wa.calculations.response;

import java.io.Serializable;

public class CalculationsResponse implements Serializable {

    private String found;

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "CalculationsResponse{" +
                "found='" + found + '\'' +
                '}';
    }
}
