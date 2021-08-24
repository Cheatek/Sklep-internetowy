package pl.sdacademy.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Embeddable
public class Address {
    @NotBlank
    @Size(max = 30, message = "Maksymalna ilość znaków to {max}")
    private String street;
    @NotBlank
    @Size(max = 15, message = "Maksymalna ilość znaków to {max}")
    private String houseNumber;
    @NotBlank
    @Pattern(regexp = "^[0-9]{2,8}(?:-[0-9]{2,8})?$", message = "Kod pocztowy powinien mieć format xx-xx, przykład 100-2000")
    private String postalCode;
    // matches between 2-8, for example 22-4345.
    @NotBlank
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
