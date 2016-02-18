package by.andrew.zenov.data.dao;

import java.util.List;

import by.andrew.zenov.data.model.Tag;

public interface TagDao {
	
	Tag get(Long id);
	
	Long insert(Tag tag);
	
	void update(Tag tag);
	
	void delete(Long id);
	
	List<Tag> getAll();
	
	List<Tag> getAll(long first, long count);

	Long getCount();

}
