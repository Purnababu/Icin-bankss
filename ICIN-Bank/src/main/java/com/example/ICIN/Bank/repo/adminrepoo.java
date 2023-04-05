package com.example.ICIN.Bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ICIN.Bank.model.Admin;
 @Repository
public interface adminrepoo  extends JpaRepository<Admin,Integer>{

}
