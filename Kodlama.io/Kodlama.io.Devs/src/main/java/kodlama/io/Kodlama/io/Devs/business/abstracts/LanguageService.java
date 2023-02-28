package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	void insertLanguage(Language language);
	void deleteLanguage(int id);
	void updateLanguage(Language withLanguage, Language newLanguage);
	List<Language> getAllLanguage();
	Language getLanguageId(int id);
	void isEmpty(Language language);
	void İsWith(Language language);
	

}
