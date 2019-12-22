package Manager;

import Model.Post;
import Model.User;

import java.util.Date;
import java.util.List;

//TEMPLATE DESIGN PATTERNS
public abstract class PostManager {
    private List<Post> posts;

    public void deletePost(int postID) {
        for(int i = 0; i < posts.size(); i++){
            if(postID == posts.get(i).getPostID()){
                posts.remove(i);
            }
        }
    }

    public void updatePost(int postID, Date dateTime, String title, String description, boolean isActive){
        posts.get(postID).dateTime = dateTime;
        posts.get(postID).title = title;
        posts.get(postID).description = description;
        posts.get(postID).isActive = isActive;
    }

    public void setPostState(boolean state, int postID){
        posts.get(postID).isActive = state;
    }

    public void recommendToUsers(User currentUser){
        System.out.println("POSTS RECOMMMENDED TO USERS");
    }

    abstract void listPosts();
    abstract void createPost(Post post);

}
