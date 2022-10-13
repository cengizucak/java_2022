package LayeredArchitecture.dataAccess;

import LayeredArchitecture.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {

        System.out.println("Hibernate ile category eklendi.."+category.getCategoryName());
    }
}
