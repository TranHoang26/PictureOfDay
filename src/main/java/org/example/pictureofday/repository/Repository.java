package org.example.pictureofday.repository;

import org.example.pictureofday.model.NasaPicture;

import java.util.List;

public interface Repository<T> {
    List<NasaPicture> findAll();

    void save(T t);

    T findById(int id);

    void update(T t);

    void remove(int id);
}
