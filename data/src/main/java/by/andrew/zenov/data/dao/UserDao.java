package by.andrew.zenov.data.dao;

import java.util.List;

import by.andrew.zenov.data.model.User;

public interface UserDao{

	User get(Long id);
	
	List<User> getAll();
	
	void delete(Long id);
	
	void insert(User user);
	
	void update(User user);
	
}
