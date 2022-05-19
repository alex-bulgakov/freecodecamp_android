package org.alebul.medicalChallange;

public class Stomach {
    private String name;
    private String condition;
    private boolean digest;

    public Stomach(String name, String condition, boolean digest) {
        this.name = name;
        this.condition = condition;
        this.digest = digest;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public boolean isDigest() {
        return digest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDigest(boolean digest) {
        this.digest = digest;
    }

}
