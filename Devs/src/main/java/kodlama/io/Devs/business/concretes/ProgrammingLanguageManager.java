package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.languageRequest.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponse.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languageResponse.UpdateLanguagesResponse;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
    private ProgrammingLanguageRepository programmingLanguageRepository;
    
    
	
    @Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
	
		this.programmingLanguageRepository = programmingLanguageRepository;
	}





	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllLanguagesResponse ResponseItem = new GetAllLanguagesResponse();
			ResponseItem.setId(programmingLanguage.getId());
			ResponseItem.setName(programmingLanguage.getName());
			languagesResponse.add(ResponseItem); 
		}
		
		return 	languagesResponse;
	}





	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}





	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public UpdateLanguagesResponse update(UpdateLanguageRequest updateLanguageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
