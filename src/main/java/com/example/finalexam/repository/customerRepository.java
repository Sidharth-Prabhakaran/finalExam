package com.example.finalexam.repository;

import com.example.finalexam.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface customerRepository extends JpaRepository<customer,Long> {
    List<customer> findcustomerById(int id);

    @Override
    List<customer> findAll();
}

