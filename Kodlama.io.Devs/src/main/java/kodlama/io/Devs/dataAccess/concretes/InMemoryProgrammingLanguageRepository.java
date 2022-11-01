package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public  class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
    List<ProgrammingLanguage> programmingLanguages;
    
    @Autowired
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C++"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage byId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

 
}
