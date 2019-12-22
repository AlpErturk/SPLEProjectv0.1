package Manager;

import Model.*;

import java.util.Date;
import java.util.List;

public class RealEstatePostManager extends PostManager{

    private List<RealEstatePost> posts;



    @Override
    public void updatePost(int postID, Date dateTime, String title, String description, boolean isActive) {
        super.updatePost(postID, dateTime, title, description, isActive);

        RealEstateUser user = null;
        List images = null;

        posts.get(postID).adress = "new address";
        posts.get(postID).discountedPrice = 50;
        posts.get(postID).estateType = "new estateType";
        posts.get(postID).images = (java.awt.List) images;
        posts.get(postID).owner = user;
        posts.get(postID).price = 100;
        posts.get(postID).rentOrSale = "new rent or sale";
        posts.get(postID).transportation = "new transportation information";


    }

    @Override
    void createPost(Post post) {
        RealEstateUser user = null;
        List images = null;

        RealEstatePost newPost = new RealEstatePost(post.postID, post.dateTime, post.title, post.description, post.isActive, "estate type", 100, 50, "rent", "address1", (java.awt.List) images, user,"transporation informations");
        posts.add(newPost);
    }

    @Override
    void listPosts() {
        System.out.println("Real Estate Posts are Listed Below");
    }


}
