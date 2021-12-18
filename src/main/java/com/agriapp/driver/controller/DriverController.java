//package
package com.agriapp.driver.controller;

//Libraries
import com.agriapp.driver.dto.DriverRequestDTO;
import com.agriapp.driver.dto.DriverResponseDTO;
import com.agriapp.driver.services.DriverService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/conducteurs")
public class DriverController {

    private DriverService driverService;

    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }

    @RequestMapping(value = "/add", produces = {"application/json", "application/xml"})
    @ResponseBody
    DriverResponseDTO addDriver(@RequestBody DriverRequestDTO dto){
        return driverService.addDriver(dto);
    }
}
