package Manager;

import Model.*;

import java.util.Date;
import java.util.List;

public class JobPostManager extends  PostManager{

    private List<JobPost> posts;


    @Override
    public void updatePost(int postID, Date dateTime, String title, String description, boolean isActive) {
        super.updatePost(postID, dateTime, title, description, isActive);

        List<JobApplication> applications = null;
        CompanyHR hr = null;

        posts.get(postID).applications = applications;
        posts.get(postID).company = hr;
        posts.get(postID).position = "new position";
        posts.get(postID).requiredSkills = "new requiredSkills";
        posts.get(postID).location = "new location";
        posts.get(postID).jobType = "new jobType";
    }


    @Override
    void listPosts() {
        System.out.println("Job Posts are Listed Below");
    }

    @Override
    void createPost(Post post) {
        List<JobApplication> applications = null;
        CompanyHR hr = null;
        JobPost jobPost = new JobPost(post.postID, post.dateTime, post.title, post.description, post.isActive, applications, hr, "position1", "requiredSkills", "location", "jobType", "jobHours", "department");
        posts.add(jobPost);
    }

    @Override
    public void recommendToUsers(User currentUser){
        //Permission toggle to only enabling job posts related to enterd skills to premium users.
        if (currentUser.isPrime){
            System.out.println("Job posts recommended according to skills to premium user");
        }

        else{
            System.out.println("There are no recommendations for normal users, you have to search yourself.");
        }
    }


}
