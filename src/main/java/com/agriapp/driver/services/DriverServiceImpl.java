package com.agriapp.driver.services;

import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;
import com.agriapp.driver.entity.Driver;
import com.agriapp.driver.mappers.DriverMapper;
import com.agriapp.driver.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;
    private DriverMapper driverMapper;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public DriverResponseDTO addDriver(DriverRequestDTO drd) {
        Driver driver = driverMapper.driverRequestDtoTDriver(drd);
        return driverMapper.driverToDriverResponse(driverRepository.save(driver));
    }

}
