package Model;

import java.util.Date;
import java.util.List;

public class UserFactory {



    public User register(String email, String password, User.UserType type){

        //factory design pattern implemented
        if(type == User.UserType.REALESTATEUSER){
            RealEstateUser newUser = new RealEstateUser(1, null, email, password, null, "0", false);
            return newUser;
        }
        else if (type == User.UserType.COMPANYHR){
            CompanyHR newHR = new CompanyHR(1, null, email, password, null, "Example Company", false);
            return newHR;
        }
        else if(type == User.UserType.JOBCANDIDATE){
            JobCandidate newCandidate = new JobCandidate(1, null, email, password, null, "Current Academic Info", "Current Experience", new Date(1998-01-29), "username", null, false);
            return newCandidate;
        }
        else{
            Student newStudent = new Student(1, null, email, password, null, "current academic infor", 20, "current hobies", "current references", "transcripts", false);
            return newStudent;
        }
    }
}
