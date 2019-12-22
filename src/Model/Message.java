package Model;

import java.util.Date;

public class Message {
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String messageText;
    public User sender;
    public User receiver;
    public Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id;

    public Message(String messageText, User sender, User receiver, Date date, int id) {
        this.messageText = messageText;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.id = id;
    }
}
