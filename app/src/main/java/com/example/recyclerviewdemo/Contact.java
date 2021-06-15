package com.example.recyclerviewdemo;

import java.util.ArrayList;

public class Contact {
   private String familyName;
   private String firstName;
   private int houseNumber;
   private String street;
   private String town;
   private String country;
   private int pincode;
   private String telephone;
   private String imageFileName;

   public Contact(String familyName, String firstName, int houseNumber, String street, String town, String country, int pincode, String telephone, String imageFileName) {
      this.familyName = familyName;
      this.firstName = firstName;
      this.houseNumber = houseNumber;
      this.street = street;
      this.town = town;
      this.country = country;
      this.pincode = pincode;
      this.telephone = telephone;
      this.imageFileName = imageFileName;
   }

   public String getFamilyName() {
      return familyName;
   }

   public String getFirstName() {
      return firstName;
   }

   public int getHouseNumber() {
      return houseNumber;
   }

   public String getStreet() {
      return street;
   }

   public String getTown() {
      return town;
   }

   public String getCountry() {
      return country;
   }

   public int getPincode() {
      return pincode;
   }

   public String getTelephone() {
      return telephone;
   }

   public String getImageFileName() {
      return imageFileName;
   }
}
