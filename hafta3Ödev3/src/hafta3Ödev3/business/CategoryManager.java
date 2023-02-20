package hafta3�dev3.business;
import hafta3�dev3.dataAccess.CategoryDao;
import hafta3�dev3.entities.Category;



public class CategoryManager implements CategoryDao {

	@Override
	public void add(Category category) throws Exception {
		 if (!category.getCategoryName().equalsIgnoreCase("Programlama")) {
	            throw new Exception(category.getCategoryName() + " diye bir kategori bulunamad�. Yeniden se�in.");
	        } else {
	            System.out.println("Kategori Se�ildi." + category.getCategoryName().substring(0, 1).toUpperCase() + category.getCategoryName().substring(1).toLowerCase());
		
		
		
	}
	
	
	}

}
