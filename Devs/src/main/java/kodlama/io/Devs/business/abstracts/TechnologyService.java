package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.technologyRequest.CreateTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.DeleteTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.UpdateTechnologyRequest;
import kodlama.io.Devs.business.responses.technologyResponse.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.technologyResponse.UpdateTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();
    void add(CreateTechnologyRequest createTechnologyRequest);
    void delete(DeleteTechnologyRequest deleteTechnologyRequest);
    UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest);
}


