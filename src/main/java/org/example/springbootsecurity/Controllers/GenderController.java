package org.example.springbootsecurity.Controllers;

import org.example.springbootsecurity.DTOs.GenderDTO;
import org.example.springbootsecurity.Models.Gender;
import org.example.springbootsecurity.Services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {
    @Autowired
    private GenderService genderService;

    @PostMapping("/enum")
    public Gender saveGender(@RequestBody GenderDTO genderDTO){
        return genderService.saveGender(genderDTO);
    }

    @GetMapping("/enum")
    public String getGender(){
        return "You can access  this page successfully";
    }
}
