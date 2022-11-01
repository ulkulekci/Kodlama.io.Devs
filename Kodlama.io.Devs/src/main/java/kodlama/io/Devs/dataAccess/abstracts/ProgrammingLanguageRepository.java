package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage byId(int id);
	public void add(ProgrammingLanguage programmingLanguage);
	public void delete(int id);
	public void update(ProgrammingLanguage programmingLanguage);
		
}
