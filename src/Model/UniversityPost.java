package Model;

import java.util.Date;

public class UniversityPost extends Post{

    public String studyProgram;
    public University University;
    public String degreeType;

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Model.University getUniversity() {
        return University;
    }

    public void setUniversity(Model.University university) {
        University = university;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getFacultyType() {
        return facultyType;
    }

    public void setFacultyType(String facultyType) {
        this.facultyType = facultyType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String facultyType;
    public String department;

    public UniversityPost(int postID, Date dateTime, String title, String description, boolean isActive, String studyProgram, Model.University university, String degreeType, String facultyType, String department) {
        super(postID, dateTime, title, description, isActive);
        this.studyProgram = studyProgram;
        University = university;
        this.degreeType = degreeType;
        this.facultyType = facultyType;
        this.department = department;
    }
}
