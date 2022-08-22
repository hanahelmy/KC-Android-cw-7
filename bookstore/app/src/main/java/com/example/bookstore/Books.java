package com.example.bookstore;

public class Books {
    private String bookname;
    private int bookPhoto;
    private double bookPrice;
    private String bookcategory;

    public Books (String bookname, int bookPhoto, double bookPrice, String bookcategory) {
        this.bookname = bookname;
        this.bookPhoto = bookPhoto;
        this.bookPrice = bookPrice;
        this.bookcategory = bookcategory;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookPhoto() {
        return bookPhoto;
    }

    public void setBookPhoto(int bookPhoto) {
        this.bookPhoto = bookPhoto;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }
}