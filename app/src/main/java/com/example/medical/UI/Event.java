package com.example.medical.UI;

public class Event {
    // Store the title of the event
    private String title;
    // Store the name of the event
    private String name;
    // Store the release date of the event
    private String date;

    // Constructor that is used to create an instance of the Event object
    public Event(String title, String name, String date) {
        this.name = name;
        this.title = title;
        this.date = date;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}

