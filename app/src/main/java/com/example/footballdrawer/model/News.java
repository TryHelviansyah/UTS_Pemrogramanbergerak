package com.example.footballdrawer.model;

public class News {
    String tvJudul, tvDeskripsi;
    int imgNews;

    public News(String tvJudul, String tvDeskripsi, int imgNews) {
        this.tvJudul = tvJudul;
        this.tvDeskripsi = tvDeskripsi;
        this.imgNews = imgNews;
    }

    public News() {
    }

    public String getTvJudul() {
        return tvJudul;
    }

    public void setTvJudul(String tvJudul) {
        this.tvJudul = tvJudul;
    }

    public String getTvDeskripsi() {
        return tvDeskripsi;
    }

    public void setTvDeskripsi(String tvDeskripsi) {
        this.tvDeskripsi = tvDeskripsi;
    }

    public int getImgNews() {
        return imgNews;
    }

    public void setImgNews(int imgNews) {
        this.imgNews = imgNews;
    }
}
