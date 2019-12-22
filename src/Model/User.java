package Model;
import Model.Post;
import java.util.List;

public class User {

    public int userID;
    public List favorites;
    public  String email;
    public String password;
    public List<Post> recommendedPosts;
    public boolean isPrime;

    public User(int userID, List favorites, String email, String password, List<Post> recommendedPosts, boolean isPrime) {
        this.userID = userID;
        this.favorites = favorites;
        this.email = email;
        this.password = password;
        this.recommendedPosts = recommendedPosts;
        this.isPrime = isPrime;
    }

    public List getFavorites() {
        return favorites;
    }

    public void setFavorites(List favorites) {
        this.favorites = favorites;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getRecommendedPosts() {
        return recommendedPosts;
    }

    public void setRecommendedPosts(List<Post> recommendedPosts) {
        this.recommendedPosts = recommendedPosts;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public enum UserType {
        REALESTATEUSER,
        COMPANYHR,
        JOBCANDIDATE,
        STUDENT
    }
}
