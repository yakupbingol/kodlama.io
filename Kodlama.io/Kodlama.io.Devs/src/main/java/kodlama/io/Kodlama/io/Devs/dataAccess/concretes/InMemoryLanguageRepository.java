package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository // bu sinif DataAccess nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	@Autowired
	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Python"));
		languages.add(new Language(3, "Java"));

	}

	@Override
	public void insertLanguage(Language language) {
		languages.add(language);

	}

	@Override
	public void deleteLanguage(int id) {
		languages.remove(id);

	}

	@Override
	public void updateLanguage(Language withLanguage, Language newLanguage) {
		languages.set(withLanguage.getId(), newLanguage);

	}

	@Override
	public List<Language> getAllLanguage() {

		return languages;
	}

	@Override
	public Language getLanguageId(int id) {

		return languages.get(id);
	}

}
