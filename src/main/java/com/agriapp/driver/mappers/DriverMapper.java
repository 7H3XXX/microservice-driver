//package
package com.agriapp.driver.mappers;

//Libraries

import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;
import com.agriapp.driver.entity.Driver;

public interface DriverMapper {
    DriverResponseDTO driverToDriverResponse(Driver driver);
    Driver driverRequestDtoTDriver(DriverRequestDTO driverRequestDTO);
}
