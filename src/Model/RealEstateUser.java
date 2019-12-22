package Model;

import java.util.List;

public class RealEstateUser extends User implements UserInterface{
    public String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RealEstateUser(int userID, List favorites, String email, String password, List<Post> recommendedPosts, String phoneNumber, boolean isPrime) {
        super(userID, favorites, email, password, recommendedPosts, isPrime);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void logIn() {
        System.out.println("Real estate user log in to real estate database");
    }

    @Override
    public void logOut() {
        System.out.println("Real estate user log out to real estate database");
    }


    @Override
    public void sendMessage() {
        System.out.println("Real estate user sent message ");
    }

    @Override
    public void listMessages() {
        System.out.println("Real estate user list message ");
    }


}
