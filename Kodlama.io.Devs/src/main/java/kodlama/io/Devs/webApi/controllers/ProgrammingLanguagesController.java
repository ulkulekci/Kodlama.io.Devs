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
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

//Api isimlendirmelerinde çoğul kullanılır


@RestController
@RequestMapping("/api/programminglanguages")//adresleme
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;
    
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
	
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return this.programmingLanguageService.getAll();}

	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguageService.delete(id);
	}
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.update(programmingLanguage);
	}
}
