package Model;


import java.awt.*;
import java.util.Date;

public class RealEstatePost extends Post {

    public String estateType;
    public int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getRentOrSale() {
        return rentOrSale;
    }

    public void setRentOrSale(String rentOrSale) {
        this.rentOrSale = rentOrSale;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }

    public RealEstateUser getOwner() {
        return owner;
    }

    public void setOwner(RealEstateUser owner) {
        this.owner = owner;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public int discountedPrice;
    public String rentOrSale;
    public String adress;
    public List images;
    public RealEstateUser owner;
    public String transportation;


    public RealEstatePost(int postID, Date dateTime, String title, String description, boolean isActive, String estateType, int price, int discountedPrice, String rentOrSale, String adress, List images, RealEstateUser owner, String transportation) {
        super(postID, dateTime, title, description, isActive);
        this.estateType = estateType;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.rentOrSale = rentOrSale;
        this.adress = adress;
        this.images = images;
        this.owner = owner;
        this.transportation = transportation;
    }

    public String getEstateType() {
        return estateType;
    }

    public void setEstateType(String estateType) {
        this.estateType = estateType;
    }
}
