package com.example.footballdrawer.model;

public class Player {
    String namePlayer;
    int imgPlayer;

    public Player() {
    }

    public Player(String namePlayer, int imgPlayer) {
        this.namePlayer = namePlayer;
        this.imgPlayer = imgPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getImgPlayer() {
        return imgPlayer;
    }

    public void setImgPlayer(int imgPlayer) {
        this.imgPlayer = imgPlayer;
    }
}
