package kodlama.io.Devs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private List<ProgrammingLanguage> programmingLanguages;
	private ProgrammingLanguageRepository programmingLanguageRepository;
    
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage byId(int id) {
		
		
		return programmingLanguageRepository.byId(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception{		
		for (ProgrammingLanguage programmingLanguagess : programmingLanguages) {
			if (programmingLanguagess.getName().equals(programmingLanguagess.getName())) {
                throw new Exception("Programlama ismi aynı olamaz");
			}
		programmingLanguageRepository.add(programmingLanguage);
		
	}}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
	
		programmingLanguageRepository.update(programmingLanguage);
	}


	
}