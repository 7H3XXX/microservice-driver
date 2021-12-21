//package

package com.agriapp.driver.services;

//Libraries

import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;

public interface DriverService {
    public DriverResponseDTO addDriver(DriverRequestDTO drd);
}
