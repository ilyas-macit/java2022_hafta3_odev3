package dataAccess.concretes;

import dataAccess.abstracts.CategoryDal;
import entities.concretes.Category;

public class JbdcCategoryDal implements CategoryDal  {
    @Override
    public void add(Category category) {
        System.out.println("jbdc ile kaydedildi");
    }
}
