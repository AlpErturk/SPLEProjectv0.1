package Service;

import Manager.RealEstatePostManager;
import Model.RealEstateUser;

public class EstateUserService {
    private RealEstatePostManager postManager;

    public void getMorgageLoanInfo(){

    }

    public void getCurrencyInfo(){

    }

    public void calculateEstatePrice(RealEstateUser currentUser){
        //Permission toggle to enabling calculate estate price to premium real estate users.
        if(currentUser.isPrime){
            System.out.println("Estate Price Calculated for Premium User");
        }

        else{
            System.out.println("Can not calculate estate price, upgrade your account to use this feature.");
        }
    }

    public void getRegionInfo(){

    }

    public void getDiscounted(){

    }

    public void enterHobbiesAndInterests(){

    }

    public void searchEstateOnMap(){

    }

    public void getTransportationInfo(){

    }

    public void compareEstates(){

    }
}

