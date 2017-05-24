package net.skp.shoppingbackend.dao;

import java.util.List;

import net.skp.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
