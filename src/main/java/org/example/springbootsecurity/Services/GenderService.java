package org.example.springbootsecurity.Services;

import org.example.springbootsecurity.DTOs.GenderDTO;
import org.example.springbootsecurity.Models.Gender;
import org.example.springbootsecurity.Models.GenderEnum;
import org.example.springbootsecurity.Repositories.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepo;

    public Gender saveGender(GenderDTO genderDTO) {
        Gender gender = new Gender();
        gender.setName(genderDTO.getName());

        if (genderDTO.getGender() == GenderEnum.MALE) {
            gender.setGender(GenderEnum.MALE);
        } else {
            gender.setGender(GenderEnum.FEMALE);
        }

        return genderRepo.save(gender);
    }
}
