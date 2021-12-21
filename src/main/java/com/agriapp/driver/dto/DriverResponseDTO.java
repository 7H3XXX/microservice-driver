//package
package com.agriapp.driver.dto;

//Libraries

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverResponseDTO {

    private String matricule;

    private String lastName;

    private String firstName;

    //private String idCardNumber;

    private String telephone;

    private String address;

    private String emailAddress;
}
