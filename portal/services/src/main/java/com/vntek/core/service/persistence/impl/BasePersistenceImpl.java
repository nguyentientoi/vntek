/**
 * 
 */
package com.vntek.core.service.persistence.impl;

import java.sql.Connection;
import java.util.Map;
import java.util.Set;

import javax.naming.NamingException;
import javax.naming.Reference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Cache;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.StatelessSessionBuilder;
import org.hibernate.TypeHelper;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.stat.Statistics;

import com.vntek.core.exception.SystemException;
import com.vntek.core.model.BaseModel;
import com.vntek.core.service.persistence.BasePersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:21:05 PM
 */
public class BasePersistenceImpl<T extends BaseModel<T>> implements BasePersistence<T>, SessionFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2350403366602641728L;

	public Reference getReference() throws NamingException {
		return sessionFactory.getReference();
	}

	public SessionFactoryOptions getSessionFactoryOptions() {
		return sessionFactory.getSessionFactoryOptions();
	}

	public SessionBuilder withOptions() {
		return sessionFactory.withOptions();
	}

	public Session openSession() throws HibernateException {
		return sessionFactory.openSession();
	}

	public Session getCurrentSession() throws HibernateException {
		return sessionFactory.getCurrentSession();
	}

	public StatelessSessionBuilder withStatelessOptions() {
		return sessionFactory.withStatelessOptions();
	}

	public StatelessSession openStatelessSession() {
		return sessionFactory.openStatelessSession();
	}

	public StatelessSession openStatelessSession(Connection connection) {
		return sessionFactory.openStatelessSession();
	}

	public ClassMetadata getClassMetadata(Class entityClass) {
		return sessionFactory.getClassMetadata(entityClass);
	}

	public ClassMetadata getClassMetadata(String entityName) {
		return sessionFactory.getClassMetadata(entityName);
	}

	public CollectionMetadata getCollectionMetadata(String roleName) {
		return sessionFactory.getCollectionMetadata(roleName);
	}

	public Map<String, ClassMetadata> getAllClassMetadata() {
		return sessionFactory.getAllClassMetadata();
	}

	public Map getAllCollectionMetadata() {
		return sessionFactory.getAllClassMetadata();
	}

	public Statistics getStatistics() {
		return sessionFactory.getStatistics();
	}

	public void close() throws HibernateException {
		sessionFactory.close();
	}

	public boolean isClosed() {
		return sessionFactory.isClosed();
	}

	public Cache getCache() {
		return sessionFactory.getCache();
	}

	public Set getDefinedFilterNames() {
		return sessionFactory.getDefinedFilterNames();
	}

	public FilterDefinition getFilterDefinition(String filterName) throws HibernateException {
		return sessionFactory.getFilterDefinition(filterName);
	}

	public boolean containsFetchProfileDefinition(String name) {
		return sessionFactory.containsFetchProfileDefinition(name);
	}

	public TypeHelper getTypeHelper() {
		return sessionFactory.getTypeHelper();
	}

	public T save(T model) throws SystemException {
		openSession().save(model);
		return model;
	}

	public T saveOrUpdate(T model) throws SystemException {
		openSession().saveOrUpdate(model);
		return model;
	}

	public T get(String entityName, T id) throws SystemException {
		return (T) openSession().get(entityName, id);
	}

	public T get(Class<T> clazz, T id) {
		return openSession().get(clazz, id);
	}

	public T update(T model) throws SystemException {
		openSession().update(model);
		return model;
	}

	public void delete(T model) throws SystemException {

		openSession().delete(model);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private SessionFactory sessionFactory;

	/**
	 * log to server
	 */
	private static final Log _log = LogFactory.getLog(BasePersistenceImpl.class.getName());

}
