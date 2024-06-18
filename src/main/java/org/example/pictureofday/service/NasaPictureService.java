package org.example.pictureofday.service;


import org.example.pictureofday.model.NasaPicture;

import java.util.List;

public interface NasaPictureService {
    List<NasaPicture> findAll();

    void save(NasaPicture t);

    NasaPicture findById(int id);

    void update(NasaPicture t);

    void remove(int id);
}