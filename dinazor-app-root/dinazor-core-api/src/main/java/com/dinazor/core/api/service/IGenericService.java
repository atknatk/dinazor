package com.dinazor.core.api.service;

import java.util.List;

/**
 * Created by atakan on 01.02.2017.
 */
public interface IGenericService<E, K> {

    void saveOrUpdate(E entity);

    List<E> getAll();

    E get(K id);

    void add(E entity);

    void update(E entity);

    void remove(E entity);
}