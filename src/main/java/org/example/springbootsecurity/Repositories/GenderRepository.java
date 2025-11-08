package org.example.springbootsecurity.Repositories;

import org.example.springbootsecurity.Models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Integer> {
}
