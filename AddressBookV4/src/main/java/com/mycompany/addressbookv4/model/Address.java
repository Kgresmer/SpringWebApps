package com.mycompany.addressbookv4.model;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Address {

    private int addressId;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    @NotEmpty(message="You must supply a value for first name.")
    @Length(max=50, message="First Name must be no more than 50 characters in length.")
    private String fName;
    
    @NotEmpty(message="You must supply a value for last name.")
    @Length(max=50, message="Last Name must be no more than 50 characters in length.")
    private String lName;
    
    @NotEmpty(message="You must supply a value for street")
    @Length(max=50, message="Street Name must be no more than 50 characters in length.")
    private String street;
    
    @NotEmpty(message="You must supply a value for city.")
    @Length(max=50, message="City must be no more than 50 characters in length.")
    private String city;
    
    @NotEmpty(message="You must supply a value for state.")
    @Length(max=2, message="State must be no more than 2 characters in length.")
    private String state;
    
    @NotEmpty(message="You must supply a value for zip code.")
    @Length(max=10, message="Zip code must be no more than 10 characters in length.")
    private String zip;

    public Address() {
    }

    public Address(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Address(String fName, String lName, String street, String city, String state, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return fName + ' ' + lName + '\n'
                + street + '\n'
                + city + ", " + state + ' ' + zip;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.addressId;
        hash = 37 * hash + Objects.hashCode(this.fName);
        hash = 37 * hash + Objects.hashCode(this.lName);
        hash = 37 * hash + Objects.hashCode(this.street);
        hash = 37 * hash + Objects.hashCode(this.city);
        hash = 37 * hash + Objects.hashCode(this.state);
        hash = 37 * hash + Objects.hashCode(this.zip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (this.addressId != other.addressId) {
            return false;
        }
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        return true;
    }
}
