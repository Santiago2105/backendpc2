package pe.edu.upc.pc22025.services;

import pe.edu.upc.pc22025.entities.Authority;

public interface AuthorityService {

    public Authority addAuthority(Authority authority);

    public Authority findByName(String authorityName);

}
