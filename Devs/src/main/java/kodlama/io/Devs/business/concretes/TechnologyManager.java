package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Devs.business.requests.technologyRequest.CreateTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.DeleteTechnologyRequest;
import kodlama.io.Devs.business.requests.technologyRequest.UpdateTechnologyRequest;
import kodlama.io.Devs.business.responses.technologyResponse.GetAllTechnologiesResponse;
import kodlama.io.Devs.business.responses.technologyResponse.UpdateTechnologyResponse;

@Service
public class TechnologyManager implements TechnologyService{

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UpdateTechnologyResponse update(UpdateTechnologyRequest updateTechnologyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
