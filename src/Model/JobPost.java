package Model;

import java.util.Date;
import java.util.List;

public class JobPost extends Post{
    public List<JobApplication> applications;
    public CompanyHR company;
    public String position;
    public String requiredSkills;
    public String location;
    public String jobType;
    public String jobHours;

    public String getJobHours() {
        return jobHours;
    }

    public void setJobHours(String jobHours) {
        this.jobHours = jobHours;
    }

    public List<JobApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<JobApplication> applications) {
        this.applications = applications;
    }

    public CompanyHR getCompany() {
        return company;
    }

    public void setCompany(CompanyHR company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String department;

    public JobPost(int postID, Date dateTime, String title, String description, boolean isActive, List<JobApplication> applications, CompanyHR company, String position, String requiredSkills, String location, String jobType, String jobHours, String department) {
        super(postID, dateTime, title, description, isActive);
        this.applications = applications;
        this.company = company;
        this.position = position;
        this.requiredSkills = requiredSkills;
        this.location = location;
        this.jobType = jobType;
        this.department = department;
        this.jobHours = jobHours;
    }


}
