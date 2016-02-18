package by.andrew.zenov.data.dao;

import by.andrew.zenov.data.model.User;

public interface UserDao {

	User get(Long id);
	
	Long insert(User user);
	
	void update(User user);
	
	void delete(Long id);
	
}
