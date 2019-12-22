package Model;
import Model.Post;
import java.util.List;

public class Student extends User implements UserInterface{
    public String academicInfo;
    public int age;
    public String hobbies;
    public String references;

    public String getAcademicInfo() {
        return academicInfo;
    }

    public void setAcademicInfo(String academicInfo) {
        this.academicInfo = academicInfo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(String transcripts) {
        this.transcripts = transcripts;
    }

    private  String transcripts;


    public Student(int userID, List favorites, String email, String password, List<Post> recommendedPosts, String academicInfo, int age, String hobbies, String references, String transcripts, boolean isPrime) {
        super(userID, favorites, email, password, recommendedPosts, isPrime);
        this.academicInfo = academicInfo;
        this.age = age;
        this.hobbies = hobbies;
        this.references = references;
        this.transcripts = transcripts;
    }

    @Override
    public void logIn() {
        System.out.println("Student log in to student database");
    }

    @Override
    public void logOut() {
        System.out.println("Student log out from student database");
    }


    @Override
    public void sendMessage() {
        System.out.println("Student sent message");
    }

    @Override
    public void listMessages() {
        System.out.println("Student lists message");
    }


}
