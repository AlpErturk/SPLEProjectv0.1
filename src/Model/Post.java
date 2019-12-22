package Model;

import java.util.Date;

public class Post {
    public int postID;
    public Date dateTime;
    public String title;
    public String description;
    public boolean isActive;

    public Post(int postID, Date dateTime, String title, String description, boolean isActive) {
        this.postID = postID;
        this.dateTime = dateTime;
        this.title = title;
        this.description = description;
        this.isActive = isActive;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}


