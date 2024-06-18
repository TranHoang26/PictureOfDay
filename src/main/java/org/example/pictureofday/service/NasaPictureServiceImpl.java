package org.example.pictureofday.service;


import org.example.pictureofday.model.NasaPicture;
import org.example.pictureofday.repository.NasaPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class NasaPictureServiceImpl implements NasaPictureService {
    @Autowired
    NasaPictureRepository nasaPictureRepository;
    @Override
    public List<NasaPicture> findAll() {
        return nasaPictureRepository.findAll();
    }

    @Override
    public void save(NasaPicture t) {
        nasaPictureRepository.save(t);
    }

    @Override
    public NasaPicture findById(int id) {
        return nasaPictureRepository.findById(id);
    }

    @Override
    public void update(NasaPicture t) {
        nasaPictureRepository.update(t);
    }

    @Override
    public void remove(int id) {
        nasaPictureRepository.remove(id);
    }
}
