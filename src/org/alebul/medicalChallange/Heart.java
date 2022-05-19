package org.alebul.medicalChallange;

public class Heart {
    private String name;
    private String condition;
    int heart_rate;

    public Heart(String name, String condition, int heart_rate) {
        this.name = name;
        this.condition = condition;
        this.heart_rate = heart_rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public int getHeart_rate() {
        return heart_rate;
    }
}
