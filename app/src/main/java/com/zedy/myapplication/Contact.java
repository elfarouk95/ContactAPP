package com.zedy.myapplication;

public class Contact {

    private String name;
    private String phonenumber;
    private String address;
    private String imgurl;// web or mobile
    private int imgLink;

    public Contact(String name, String phonenumber, String address, String imgurl, int imgLink) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.imgurl = imgurl;
        this.imgLink = imgLink;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getImgLink() {
        return imgLink;
    }

    public void setImgLink(int imgLink) {
        this.imgLink = imgLink;
    }
}
