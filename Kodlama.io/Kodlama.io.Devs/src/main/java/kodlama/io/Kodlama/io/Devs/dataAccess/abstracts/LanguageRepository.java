package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	void insertLanguage(Language language);
	void deleteLanguage(int id);
	void updateLanguage(Language withLanguage, Language newLanguage);
	List<Language> getAllLanguage();
	Language getLanguageId(int id);
	

}
