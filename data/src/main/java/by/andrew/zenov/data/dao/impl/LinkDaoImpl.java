package by.andrew.zenov.data.dao.impl;

import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import by.andrew.zenov.data.dao.LinkDao;
import by.andrew.zenov.data.model.Link;

@Repository(value="LinkDao")
public class LinkDaoImpl extends GenericDAOImpl<Link, String> implements LinkDao{

}
