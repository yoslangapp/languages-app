package com.example.beslangy;

public class Page {
    private int videoId;
    private int wordId;
    private int meaningId;
    private Choice choice;
    private boolean isFinalPage = false;

    public Page() {
    }

    public Page(int videoId, int wordId, int meaningId) {
        this.videoId = videoId;
        this.wordId = wordId;
        this.meaningId = meaningId;
        this.isFinalPage = true;
    }

    public Page(int videoId, int wordId, int meaningId, Choice choice, boolean isFinalPage) {
        this.videoId = videoId;
        this.wordId = wordId;
        this.meaningId = meaningId;
        this.choice = choice;
        this.isFinalPage = isFinalPage;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public int getMeaningId() {
        return meaningId;
    }

    public void setMeaningId(int meaningId) {
        this.meaningId = meaningId;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
}
