package com.example.quizme.Structures;

public class User {

    private String username;
    private String password;
    private int daysMember;
    private int numOfQuizzes;
    private int numOfTotalQuestions;
    private int numQuizzesPassed;
    private int numQuizzesAced;
    private int numQuizzesFailed;
    private int overallScore;

    public User() {
        this.username = "";
        this.password = "";
        this.daysMember = 0;
        this.numOfQuizzes = 0;
        this.numOfTotalQuestions = 0;
        this.numQuizzesPassed = 0;
        this.numQuizzesAced = 0;
        this.numQuizzesFailed = 0;

    }

    // Getters & Setters

    public boolean verifyPassword(String pass_attempt) {
        return (pass_attempt.equals(this.password));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDaysMember() {
        return daysMember;
    }

    public void setDaysMember(int daysMember) {
        this.daysMember = daysMember;
    }

    public int getNumOfQuizzes() {
        return numOfQuizzes;
    }

    public void setNumOfQuizzes(int numOfQuizzes) {
        this.numOfQuizzes = numOfQuizzes;
    }

    public int getNumOfTotalQuestions() {
        return numOfTotalQuestions;
    }

    public void setNumOfTotalQuestions(int numOfTotalQuestions) {
        this.numOfTotalQuestions = numOfTotalQuestions;
    }

    public int getNumQuizzesPassed() {
        return numQuizzesPassed;
    }

    public void setNumQuizzesPassed(int numQuizzesPassed) {
        this.numQuizzesPassed = numQuizzesPassed;
    }

    public int getNumQuizzesAced() {
        return numQuizzesAced;
    }

    public void setNumQuizzesAced(int numQuizzesAced) {
        this.numQuizzesAced = numQuizzesAced;
    }

    public int getNumQuizzesFailed() {
        return numQuizzesFailed;
    }

    public void setNumQuizzesFailed(int numQuizzesFailed) {
        this.numQuizzesFailed = numQuizzesFailed;
    }

    public int getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(int overallScore) {
        this.overallScore = overallScore;
    }
}
