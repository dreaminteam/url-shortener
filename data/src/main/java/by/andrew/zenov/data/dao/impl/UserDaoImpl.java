package by.andrew.zenov.data.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import by.andrew.zenov.data.dao.UserDao;
import by.andrew.zenov.data.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public User get(Long id) {
		String sql = "select * from user where id=?";
		Object[] parameters = new Object[] { id };
		User result = null;
		try {
			result = jdbcTemplate.queryForObject(sql, parameters, User.class);
		} catch (Exception e) {
			LOGGER.debug("Exception: no such {} with parameters {}. Return null.", User.class.getSimpleName(),
					parameters);
			return null;
		}
		return result;
	}

	@Override
	public Long insert(User user) {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		jdbcInsert.withTableName("user").usingGeneratedKeyColumns("id");
		Number key = -1;
		try {
			key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(getMapAtributes(user)));
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return key.longValue();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}
	

	private Map<String, ?> getMapAtributes(User user) {

		Map<String,Object> result=new HashMap<>();
		result.put("login", user.getLogin());
		result.put("password", user.getPassword());
		result.put("email", user.getEmail());
		return result;
	}

}
