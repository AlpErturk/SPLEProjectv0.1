package Manager;

import Model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UniversityPostManager extends PostManager {

    private List<UniversityPost> posts;


    @Override
    public void updatePost(int postID, Date dateTime, String title, String description, boolean isActive) {
        super.updatePost(postID, dateTime, title, description, isActive);
        University uni = null;
        posts.get(postID).degreeType = "new degree type";
        posts.get(postID).department = "new degree type";
        posts.get(postID).facultyType = "new degree type";
        posts.get(postID).studyProgram = "new studyProgram";
        posts.get(postID).University = uni;

    }

    @Override
    void createPost(Post post) {
        University uni = null;
        UniversityPost uniPost = new UniversityPost(post.postID, post.dateTime, post.title, post.description, post.isActive, "study program", uni, "degree type,", "faculty type", "department");
        posts.add(uniPost);
    }



    @Override
    void listPosts() {
        System.out.println("University Posts are Listed Below");
    }

    @Override
    public void recommendToUsers(User currentUser){
        //Feature flag (release toggle)
        Student currentStudent = (Student) currentUser;
        List<UniversityPost> toRecommend = new ArrayList<UniversityPost>();
        for (UniversityPost post : posts) {
            //Recommendation feature for graduate programs considered as incomplete, recommendation features for undergraduate students available only.
            if (post.getDegreeType().equals("bachelors")) {
                if (currentStudent.getAcademicInfo().contains("High school graduated"))
                    toRecommend.add(post);
            }
        }
        System.out.println("Bachelor programs are recommended.");
    }

}
