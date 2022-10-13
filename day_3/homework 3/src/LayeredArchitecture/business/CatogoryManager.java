package LayeredArchitecture.business;

import LayeredArchitecture.dataAccess.CategoryDao;
import LayeredArchitecture.entities.Category;

public class CatogoryManager {

    private CategoryDao categoryDao;

    public CatogoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void addCatagory(Category category) {

        categoryDao.add(category);
    }

}
