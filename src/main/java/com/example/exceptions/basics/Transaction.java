package com.example.exceptions.basics;

public class Transaction {
    private long id;
    private long timeStamp;

    public Transaction() {
    }

    public Transaction(long id, long timeStamp) {
        this.id = id;
        this.timeStamp = timeStamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
