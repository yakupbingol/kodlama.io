package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service  // busines nesnesidir
public class LanguageManeger implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManeger(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void insertLanguage(Language language) {
		isEmpty(language);
		İsWith(language);
		languageRepository.insertLanguage(language);
		
	}

	@Override
	public void deleteLanguage(int id) {
		languageRepository.deleteLanguage(id);
		
	}

	@Override
	public void updateLanguage(Language withLanguage, Language newLanguage) {
		isEmpty(newLanguage);
		languageRepository.updateLanguage(withLanguage, newLanguage);
		
	}

	@Override
	public List<Language> getAllLanguage() {
		
		return languageRepository.getAllLanguage();
	}

	@Override
	public Language getLanguageId(int id) {
		
		return languageRepository.getLanguageId(id);
	}

	@Override
	public void isEmpty(Language language) {
		if(language.getName().isEmpty()) {
			try {
				throw new Exception("Programlama dili boş olamaz.");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void İsWith(Language language) {
		
		List<Language> languages = languageRepository.getAllLanguage();
		for(Language languageValue  : languages) {
			if(languageValue.getName().equals(language.getName())) {
				try {
					throw new Exception("Programlama dili daha önce kaydedilmis");
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
			}
			
		}
		
	}
	

}
