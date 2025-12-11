package pe.edu.upc.pc22025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pc22025.entities.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    public Authority findByName(String name);

}
