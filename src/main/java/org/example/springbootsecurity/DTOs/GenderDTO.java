package org.example.springbootsecurity.DTOs;

import lombok.Data;
import org.example.springbootsecurity.Models.GenderEnum;

@Data
public class GenderDTO {
    private String name;
    private GenderEnum gender;
}
