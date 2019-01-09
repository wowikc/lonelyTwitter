package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public abstract class MoodObject {
    private Date date;
    public String currentMood;

    MoodObject() {
        this.date = new Date();
        this.currentMood = "undefined";
    }

    MoodObject(Date date_x) {
        this.date = date_x;
        this.currentMood = "undefined";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return currentMood;
    }

}


