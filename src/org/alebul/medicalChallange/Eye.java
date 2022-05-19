package org.alebul.medicalChallange;

public class Eye {
    private String name;
    boolean closedEye = false;
    private String condition;

    public Eye(String name, boolean closedEye, String condition) {
        this.name = name;
        this.closedEye = closedEye;
        this.condition = condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClosedEye(boolean closedEye) {
        this.closedEye = closedEye;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public boolean isClosedEye() {
        return closedEye;
    }

    public String getCondition() {
        return condition;
    }
}
