package com.example.thejob;

public class Doctor {

    int image;
    String name,objective;

    public Doctor(int image, String name, String objective) {
        this.image = image;
        this.name = name;
        this.objective = objective;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
