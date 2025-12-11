package pe.edu.upc.pc22025.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOToken {
    private String jwtToken;
    private Long id;
    private String authorities;

}
