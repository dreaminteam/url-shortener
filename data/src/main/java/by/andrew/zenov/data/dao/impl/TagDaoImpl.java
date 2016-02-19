package by.andrew.zenov.data.dao.impl;

import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import by.andrew.zenov.data.dao.TagDao;
import by.andrew.zenov.data.model.Tag;

@Repository(value="TagDao")
public class TagDaoImpl extends GenericDAOImpl<Tag, Long> implements TagDao {

}
