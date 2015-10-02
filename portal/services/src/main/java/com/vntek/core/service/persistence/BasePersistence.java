/**
 * 
 */
package com.vntek.core.service.persistence;

import com.vntek.core.exception.SystemException;
import com.vntek.core.model.BaseModel;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:20:30 PM
 */
public interface BasePersistence<T extends BaseModel<T>> {

	public T save(T model) throws SystemException;

	public T saveOrUpdate(T model) throws SystemException;

	public T update(T model) throws SystemException;

	public void delete(T model) throws SystemException;

	public T get(String entityName, T id) throws SystemException;

	public T get(Class<T> clazz, T id);
}
