package Model;

import java.util.List;

public class CompanyHR extends User implements UserInterface {
    public String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyHR(int userID, List favorites, String email, String password, List<Post> recommendedPosts, String companyName, boolean isPrime) {
        super(userID, favorites, email, password, recommendedPosts, isPrime);
        this.companyName = companyName;
    }

    @Override
    public void logIn() {
        System.out.println("Company HR log in to HR database");
    }

    @Override
    public void logOut() {
        System.out.println("Company HR log out from HR database");
    }



    @Override
    public void sendMessage() {
        System.out.println("Company HR sent message");
    }

    @Override
    public void listMessages() {
        System.out.println("Company HR list message");
    }


}
