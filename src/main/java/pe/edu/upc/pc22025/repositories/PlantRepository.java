package pe.edu.upc.pc22025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pc22025.entities.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
