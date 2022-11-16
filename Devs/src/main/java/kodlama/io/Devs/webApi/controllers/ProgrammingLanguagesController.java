package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.languageRequest.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.languageRequest.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponse.GetAllLanguagesResponse;
import kodlama.io.Devs.business.responses.languageResponse.UpdateLanguagesResponse;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
   private ProgrammingLanguageService programmingLanguageService;
      
      @Autowired
      public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
	  super();
	  this.programmingLanguageService = programmingLanguageService;
}
      @GetMapping("/getAll")
      public List<GetAllLanguagesResponse> getAll() {
    	  return programmingLanguageService.getAll();
	}
      @PostMapping("/add")
      public void add(CreateLanguageRequest createLanguageRequest) {
    	  this.programmingLanguageService.add(createLanguageRequest);
      }
      @DeleteMapping("/delete")
      public void delete(DeleteLanguageRequest deleteLanguageRequest) {
    	  programmingLanguageService.delete(deleteLanguageRequest);
      }

      @PutMapping("/update")
      public UpdateLanguagesResponse update(UpdateLanguageRequest updateLanguageRequest) {
          return programmingLanguageService.update(updateLanguageRequest);
      }
}
