package com.demo.Lulu02_MiniProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Lulu02_MiniProject.Entity.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
