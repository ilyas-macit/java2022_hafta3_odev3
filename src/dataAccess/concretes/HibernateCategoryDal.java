package dataAccess.concretes;

import dataAccess.abstracts.CategoryDal;
import entities.concretes.Category;

public class HibernateCategoryDal implements CategoryDal {
    @Override
    public void add(Category category) {
        System.out.println("hibernate ile kaydedildi");
    }
}
