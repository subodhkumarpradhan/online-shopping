package net.skp.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.skp.shoppingbackend.dao.CategoryDAO;
import net.skp.shoppingbackend.dto.Category;

public class CategoryTestCase {

	
	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("net.skp.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	
/*	@Test
	public void testAddCategory(){
		
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some discription for laptop!");
		category.setImageURL("CAT_3.png");
		
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}*/
	
	/*
	@Test
	public void testGetCategory(){
		
		category = categoryDAO.get(1);
		
		assertEquals("Successfully fatched  a single category from the table!","Television",category.getName());
		
	}*/
	
	
	/*@Test
	public void testUpdateCategory(){
		
		category = categoryDAO.get(1);
		category.setName("TV");
		
		assertEquals("Successfully updated  a single category in the table!",true,categoryDAO.update(category));
		
	}*/
	
/*	@Test
	public void testDeleteCategory(){
		
		category = categoryDAO.get(1);
			
		assertEquals("Successfully deleted  a single category in the table!",true,categoryDAO.delete(category));
		
	}*/
	
	
	/*@Test
	public void testListCategory(){
		
		category = categoryDAO.get(1);
			
		assertEquals("Successfully fetched the list of categories from the table!",2,categoryDAO.list().size());
		
	}*/
	
	
	@Test
	public void testCRUDCategory(){
		
		//add category
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some discription for laptop!");
		category.setImageURL("CAT_1.png");
		
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for television!");
		category.setImageURL("CAT_2.png");
		
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
		//Fetching and updating category
		category = categoryDAO.get(2);
		category.setName("TV");
		
		assertEquals("Successfully updated  a single category in the table!",true,categoryDAO.update(category));
		
		
		//deleting the category
				
		assertEquals("Successfully deleted  a single category in the table!",true,categoryDAO.delete(category));
		
		
		//fetched the list		
		assertEquals("Successfully fetched the list of categories from the table!",1,categoryDAO.list().size());
		
	}
}
