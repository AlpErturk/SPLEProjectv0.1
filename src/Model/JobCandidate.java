package Model;

import java.io.File;
import java.util.Date;
import java.util.List;

public class JobCandidate extends User implements UserInterface{
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public File getCv() {
        return cv;
    }

    public void setCv(File cv) {
        this.cv = cv;
    }

    public String education;
    public String jobExperience;
    public Date dob;
    public String username;
    public File cv;

    public JobCandidate(int userID, List favorites, String email, String password, List<Post> recommendedPosts, String education, String jobExperience, Date dob, String username, File cv, boolean isPrime) {
        super(userID, favorites, email, password, recommendedPosts, isPrime);
        this.education = education;
        this.jobExperience = jobExperience;
        this.dob = dob;
        this.username = username;
        this.cv = cv;
    }

    @Override
    public void logIn() {
        System.out.println("Job candidate log in to candidate database");
    }

    @Override
    public void logOut() {
        System.out.println("Job candidate log out from candidate database");
    }



    @Override
    public void sendMessage() {
        System.out.println("Job candidate sent message");
    }

    @Override
    public void listMessages() {
        System.out.println("Job candidate list messages");
    }


}
