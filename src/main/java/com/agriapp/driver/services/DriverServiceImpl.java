//package

package com.agriapp.driver.services;

//Libraries

import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;
import com.agriapp.driver.entity.Driver;
import com.agriapp.driver.mappers.DriverMapper;
import com.agriapp.driver.repository.DriverRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public DriverResponseDTO addDriver(DriverRequestDTO drd) {
        Driver driver = DriverMapper.INSTANCE.driverRequestDtoToDriver(drd);
        return DriverMapper.INSTANCE.driverToDriverResponseDTO(driverRepository.save(driver));
    }

}
