package business.concretes;

import business.abstracts.CategoryService;
import core.logging.Logger;
import dataAccess.abstracts.CategoryDal;
import entities.concretes.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

    List<Category> categories;
    List<Logger> loggers;
    CategoryDal categoryDal;

    public CategoryManager(List<Logger> loggers, CategoryDal categoryDal) {
        this.loggers = loggers;
        this.categoryDal = categoryDal;
        categories = new ArrayList<>();
        categories.add(new Category(0,"Programlama"));
    }

    @Override
    public void add(Category category) throws Exception{
        for(Category category1 : categories)
        {
            if (category1.getName() == category.getName()){
                throw new Exception("ayni kategoriden iki tane olamaz");
            }
        }
        categoryDal.add(category);
        for(Logger logger : loggers){
            logger.log(category.getName());
        }
    }
}
