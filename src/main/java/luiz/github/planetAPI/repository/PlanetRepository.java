package luiz.github.planetAPI.repository;

import luiz.github.planetAPI.domain.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PlanetRepository  extends JpaRepository<Planet, Integer> {

    @Query(value = "SELECT * FROM PLANET.PLANET p WHERE p.NOME = :name ", nativeQuery = true)
    Planet findByPlanetName(String name);
}
