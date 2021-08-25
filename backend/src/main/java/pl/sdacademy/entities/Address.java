package pl.sdacademy.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Embeddable
public class Address {
    @NotEmpty
    @Size(max = 30, message = "Maksymalna ilość znaków to {max}")
    private String street;
    @NotEmpty
    @Size(max = 15, message = "Maksymalna ilość znaków to {max}")
    private String houseNumber;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{2,8}(?:-[0-9]{2,8})?$", message = "Kod pocztowy powinien mieć format xx-xx, przykład 100-2000")
    private String postalCode;
    // matches between 2-8, for example 22-4345.
    @NotEmpty
    @Size(max = 15, message = "Maksymalna ilość znaków to {max}")
    private String country;

    public Address(){}


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
