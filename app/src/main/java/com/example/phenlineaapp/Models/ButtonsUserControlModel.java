package com.example.phenlineaapp.Models;

public class ButtonsUserControlModel {
    private int Id;
    private int Image;
    private String Title;
    private String Description;

    public ButtonsUserControlModel(int id, int image, String title, String description) {
        Id = id;
        Image = image;
        Title = title;
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
