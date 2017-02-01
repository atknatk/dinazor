package com.dinazor.core.api.dao;

import java.util.List;

/**
 * Created by atakan on 01.02.2017.
 */
public interface IGenericDao<E,K> {
    void add(E entity) ;
    void saveOrUpdate(E entity) ;
    void update(E entity) ;
    void remove(E entity);
    E find(K key);
    List<E> getAll() ;
}
