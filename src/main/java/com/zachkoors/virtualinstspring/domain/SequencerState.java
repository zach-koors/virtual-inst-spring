package com.zachkoors.virtualinstspring.domain;


import org.springframework.context.annotation.Bean;

import java.beans.JavaBean;
import java.util.Arrays;

public class SequencerState {
    private String sequencerStateName;
    private String[] stepClasses;

    public SequencerState(String sequencerStateName, String[] stepClasses){
        this.sequencerStateName = sequencerStateName;
        this.stepClasses = stepClasses;
    }


    public String getSequencerStateName() {
        return sequencerStateName;
    }

    public void setSequencerStateName(String sequencerStateName) {
        this.sequencerStateName = sequencerStateName;
    }

    public String[] getStepClasses() {
        return stepClasses;
    }

    public void setStepClasses(String[] stepClasses) {
        this.stepClasses = stepClasses;
    }
}