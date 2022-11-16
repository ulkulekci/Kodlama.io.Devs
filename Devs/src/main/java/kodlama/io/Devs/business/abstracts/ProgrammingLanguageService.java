package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.languageRequest.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponse.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languageResponse.UpdateLanguagesResponse;


public interface ProgrammingLanguageService {
	 List<GetAllLanguagesResponse> getAll(); //bu bir respons method 
	 void add(CreateLanguageRequest createLanguageRequest); 
	 void delete(DeleteLanguageRequest deleteLanguageRequest);
	 UpdateLanguagesResponse update(UpdateLanguageRequest updateLanguageRequest);
}
