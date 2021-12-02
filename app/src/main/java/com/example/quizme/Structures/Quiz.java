package com.example.quizme.Structures;

import java.util.Date;
import java.util.Objects;

public class Quiz {
    private String quizName;
    private String quizSubject;
    private Date dateCreated;
    private boolean isVisible;
    private int timesCompleted;


    public Quiz(String quizName, String quizSubject, Date dateCreated, boolean isVisible, int timesCompleted) {
        this.quizName = quizName;
        this.quizSubject = quizSubject;
        this.dateCreated = dateCreated;
        this.isVisible = isVisible;
        this.timesCompleted = timesCompleted;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizSubject() {
        return quizSubject;
    }

    public void setQuizSubject(String quizSubject) {
        this.quizSubject = quizSubject;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public int getTimesCompleted() {
        return timesCompleted;
    }

    public void setTimesCompleted(int timesCompleted) {
        this.timesCompleted = timesCompleted;
    }
}


