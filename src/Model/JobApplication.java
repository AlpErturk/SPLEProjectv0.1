package Model;

public class JobApplication {
    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public JobCandidate getApplicant() {
        return applicant;
    }

    public void setApplicant(JobCandidate applicant) {
        this.applicant = applicant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int applicationID;
    public String applicationStatus;
    public JobCandidate applicant;
    public String status;


    public JobApplication(int applicationID, String applicationStatus, JobCandidate applicant, String status) {
        this.applicationID = applicationID;
        this.applicationStatus = applicationStatus;
        this.applicant = applicant;
        this.status = status;
    }


}
