package luiz.github.planetAPI.rest;

import ch.qos.logback.core.net.server.Client;
import lombok.AllArgsConstructor;
import luiz.github.planetAPI.domain.Planet;
import luiz.github.planetAPI.repository.PlanetRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/planets")
@AllArgsConstructor
public class PlanetController {

    private final PlanetRepository planetRepository;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Planet save(@RequestBody Planet planet){
        return planetRepository.save(planet);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Planet> getAllPlanets(){
        return planetRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Planet getPlanetById( @PathVariable("id") Integer id){
        return planetRepository.findById(id).orElse(null);
    }




}
