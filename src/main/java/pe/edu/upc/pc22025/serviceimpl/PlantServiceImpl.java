package pe.edu.upc.pc22025.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.pc22025.entities.Plant;
import pe.edu.upc.pc22025.exceptions.IncompleteDataException;
import pe.edu.upc.pc22025.exceptions.ResourceNotFoundException;
import pe.edu.upc.pc22025.repositories.PlantRepository;
import pe.edu.upc.pc22025.services.PlantService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    PlantRepository plantRepository;

    @Override
    public Plant add(Plant plant) {
        if (plant.getName().isBlank()){
            throw new IncompleteDataException("Plant name can not be blank");
        }
        if (plant.getDescription().isBlank()){
            throw new IncompleteDataException("Plant description can not be blank");
        }
        if (plant.getPlantingDate().isAfter(LocalDate.now())){
            throw new IncompleteDataException("Planting date can not be in the future");
        }

        return plantRepository.save(plant);
    }

    @Override
    public List<Plant> listAll() {
        return plantRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Plant plant = plantRepository.findById(id).orElse(null);
        if (plant==null){
            throw new ResourceNotFoundException("Plant with Id: "+id.toString()+" can not be found");
        }
        plantRepository.deleteById(id);
    }
}
