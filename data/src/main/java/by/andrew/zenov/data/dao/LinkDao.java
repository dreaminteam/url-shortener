package by.andrew.zenov.data.dao;

import java.util.List;

import by.andrew.zenov.data.model.Link;

public interface LinkDao {
	
	Link get(String shortUrl);
	
	Long insert(Link reference);
	
	void update(Link reference);
	
	void delete(String shortUrl);
	
	List<Link> getAll();
	
	List<Link> getAll(long first, long count);

	Long getCount();
}
