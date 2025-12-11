package pe.edu.upc.pc22025.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.pc22025.entities.Plant;
import pe.edu.upc.pc22025.services.PlantService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/upc")
public class PlantController {

    @Autowired
    PlantService plantService;

    @PostMapping("/plants")
    public ResponseEntity<Plant> create(@RequestBody Plant plant) {
        Plant newPlant = plantService.add(plant);
        return new ResponseEntity<>(newPlant, HttpStatus.CREATED);
    }

    @GetMapping("/plants")
    public ResponseEntity<List<Plant>> listAll() {
        return new ResponseEntity<>(plantService.listAll(), HttpStatus.OK);
    }

    @DeleteMapping("/plants/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        plantService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
