package com.zachkoors.virtualinstspring.domain;


public class SequencerState {
    private String[] stepClasses;
    private String sequencerStateName;

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