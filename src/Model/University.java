package Model;

import java.util.Date;
import java.util.List;

public class University {
    public int uniID;
    public String name;
    public String location;
    public Date establishData;
    public String scholarshipInformation;
    public List<String> departments;
    public List<String> facilities;
    public String transportationServices;
    public String ranking;

    public int getUniID() {
        return uniID;
    }

    public void setUniID(int uniID) {
        this.uniID = uniID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getEstablishData() {
        return establishData;
    }

    public void setEstablishData(Date establishData) {
        this.establishData = establishData;
    }

    public String getScholarshipInformation() {
        return scholarshipInformation;
    }

    public void setScholarshipInformation(String scholarshipInformation) {
        this.scholarshipInformation = scholarshipInformation;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public String getTransportationServices() {
        return transportationServices;
    }

    public void setTransportationServices(String transportationServices) {
        this.transportationServices = transportationServices;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public University(int uniID, String name, String location, Date establishData, String scholarshipInformation, List<String> departments, List<String> facilities, String transportationServices, String ranking) {
        this.uniID = uniID;
        this.name = name;
        this.location = location;
        this.establishData = establishData;
        this.scholarshipInformation = scholarshipInformation;
        this.departments = departments;
        this.facilities = facilities;
        this.transportationServices = transportationServices;
        this.ranking = ranking;
    }
}
