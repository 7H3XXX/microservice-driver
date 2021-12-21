//package
package com.agriapp.driver.mappers;

//Libraries

import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;
import com.agriapp.driver.entity.Driver;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DriverMapper {

    DriverMapper INSTANCE = Mappers.getMapper(DriverMapper.class);

    //@Mapping(source = "nom", target = "name")
    DriverResponseDTO driverToDriverResponseDTO(Driver driver);
    Driver driverRequestDtoToDriver(DriverRequestDTO driverRequestDTO);
}
