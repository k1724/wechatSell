package com.imocc.sell.repository;

import com.imocc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


/**
 * @author miss.ke
 * @date 2018-7-9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
//        ProductCategory productCategory = repository.count();
        Long log = repository.count();
        ProductCategory productCategory = repository.getOne(1);
        System.out.println(productCategory.toString());
        System.out.println(log);
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱", 3);
        ProductCategory result = repository.saveAndFlush(productCategory);
        System.out.println(result.toString());
        Assert.assertNotNull(result);


//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男生最爱2");
//        productCategory.setCategoryType(3);
//        System.out.println(productCategory);
//        ProductCategory result = repository.save(productCategory);
//        Assert.assertNotEquals(null, result);




//        ProductCategory productCategory = repository.getOne(1);
//        productCategory.setCategoryName("男生最爱2");
//        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}