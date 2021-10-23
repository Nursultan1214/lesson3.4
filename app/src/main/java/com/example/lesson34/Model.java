package com.example.lesson34;

public class Model {

    private Integer number;
    private String blankSpace, taylorShift, time;


    public Model(Integer number, String blankSpace, String taylorShift, String time) {
        this.number = number;
        this.blankSpace = blankSpace;
        this.taylorShift = taylorShift;
        this.time = time;
    }


    public Integer getNumber() {
        return number;
    }

    public String getBlankSpace() {
        return blankSpace;
    }

    public String getTaylorShift() {
        return taylorShift;
    }

    public String getTime() {
        return time;
    }
}
