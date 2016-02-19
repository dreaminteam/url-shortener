package by.andrew.zenov.data.dao.impl;

import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import by.andrew.zenov.data.dao.UserDao;
import by.andrew.zenov.data.model.User;

@Repository(value = "UserDao")
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDao {

}
