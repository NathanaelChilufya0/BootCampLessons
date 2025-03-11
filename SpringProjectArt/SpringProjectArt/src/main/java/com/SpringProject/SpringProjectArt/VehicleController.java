package com.SpringProject.SpringProjectArt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {
    @GetMapping(path = "Vehicle")
    public List<Vehicles> getVehicle(){
        System.out.println("here are our vehicles");
        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(new Vehicles("Bugatti","AB23","Navy blue",3300000));
        vehicles.add(new Vehicles("Lamborghini","D22B","White",507353));
        vehicles.add(new Vehicles("Agera","AC4R","Grey",2500000));
        return vehicles;
    }

}
