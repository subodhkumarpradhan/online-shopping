package net.skp.shoppingbackend.dao;

import java.util.List;

import net.skp.shoppingbackend.dto.Category;
import net.skp.shoppingbackend.dto.Product;

public interface CategoryDAO {

	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
