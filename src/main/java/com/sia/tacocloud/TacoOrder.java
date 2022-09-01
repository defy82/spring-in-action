package com.sia.tacocloud;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TacoOrder implements Serializable {

    public static final long serialVersionUID = 1L;

    private Long id;
    private Date placedAt;

    @NotBlank(message = "Name can't be empty")
    private String deliveryName;
    @NotBlank(message = "Street can't be empty")
    private String deliveryStreet;
    @NotBlank(message = "City can't be empty")
    private String deliveryCity;
    @NotBlank(message = "State can't be empty")
    private String deliveryState;
    @NotBlank(message = "Zip can't be empty")
    private String deliveryZip;

    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message = "Expiration date must be in MM/YY format")
    private String ccExpiration;

    @Digits(integer=3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
