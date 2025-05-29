package edu.upc.dsa.models;

public class Issue {
    public String date;
    public String title;
    public String message;
    public String sender;

    public Issue() {}  // Necesario para deserialización JSON

    public Issue(String date, String title, String message, String sender) {
        this.date = date;
        this.title = title;
        this.message = message;
        this.sender = sender;
    }
}
