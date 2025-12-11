package pe.edu.upc.pc22025.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOUser {
    private Long id;
    private String username;
    private String password;
    private String authorities;


}
