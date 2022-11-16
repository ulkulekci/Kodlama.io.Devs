package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.technologyRequest.CreateTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.DeleteTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.UpdateTechnologyRequest;
import kodlama.io.Devs.business.responses.technologyResponse.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.technologyResponse.UpdateTechnologyResponse;

@RestController
@RequestMapping("/api/technology")
public class TechnologiesController {
	private final TechnologyService technologyService;

    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getAll")
    public List<GetAllTechnologiesResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest) {
    	technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
    	technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest) {
        return technologyService.update(updateTechnologyRequest);
    }
}
