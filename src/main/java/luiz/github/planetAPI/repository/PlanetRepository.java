package luiz.github.planetAPI.repository;

import luiz.github.planetAPI.domain.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository  extends JpaRepository<Planet, Integer> {
}
