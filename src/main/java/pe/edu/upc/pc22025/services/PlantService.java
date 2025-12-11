package pe.edu.upc.pc22025.services;

import pe.edu.upc.pc22025.entities.Plant;

import java.util.List;

public interface PlantService {

    public Plant add(Plant plant);
    public List<Plant> listAll();

    public void delete(Long id);

}
