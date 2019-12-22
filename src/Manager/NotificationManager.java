package Manager;

import Model.Post;
import Model.RealEstatePost;
import Model.RealEstateUser;
import Model.User;

import java.util.List;

public class NotificationManager {
    public void sendMessage(String email, User currentUser){

        //Experiment toggle A/B testing for real estate users
        if(currentUser instanceof RealEstateUser){
            List<RealEstatePost> posts = (List<RealEstatePost>) currentUser.getFavorites();
            for( RealEstatePost post : posts) {
                if (post.getAdress().equals("Ankara"))
                {
                    System.out.println("Notify real estate posts in Ankara");
                }
                if(post.discountedPrice != post.price){
                    System.out.println("Notify discounted real estate post");
                }
            }
        }


        System.out.println(email);
    }
}
