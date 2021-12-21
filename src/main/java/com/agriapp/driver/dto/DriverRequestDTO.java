//Package
package com.agriapp.driver.dto;

//Libraries

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverRequestDTO {

    private Long Id;

    private String matricule;

    private String lastName;

    private String firstName;

    private String idCardNumber;

    private String telephone;

    private String address;

    private String emailAddress;
}
