package dev.imy.project3_studentmanagementupgrades.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findByID(int id);
    T save(T object);
    T update(T object);
    void deleteByID(int id);

}
