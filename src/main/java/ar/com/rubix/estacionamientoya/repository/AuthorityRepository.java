package ar.com.rubix.estacionamientoya.repository;

import ar.com.rubix.estacionamientoya.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
