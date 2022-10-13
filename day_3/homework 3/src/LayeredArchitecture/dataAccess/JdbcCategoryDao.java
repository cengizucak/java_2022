package LayeredArchitecture.dataAccess;

import LayeredArchitecture.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {

        System.out.println("Jdbc ile Category eklendi.."+category.getCategoryName());
    }
}
