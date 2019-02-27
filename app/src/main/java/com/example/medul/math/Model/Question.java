package com.example.medul.math.Model;

/**
 * Created by Medul on 04-Aug-17.
 */
public class Question {

    int questionId;
    String questionText;
    int mark;
    int levelId;
    String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(int questionId, String questionText, int mark, int levelId, String[] answer, String correctAnswer) {
        this.questionText = questionText;
        this.mark = mark;
        this.questionId = questionId;
        this.levelId = levelId;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    String[] answer;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }
}
