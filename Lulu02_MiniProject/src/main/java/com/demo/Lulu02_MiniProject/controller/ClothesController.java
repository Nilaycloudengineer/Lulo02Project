package com.demo.Lulu02_MiniProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Lulu02_MiniProject.Entity.Clothes;
import com.demo.Lulu02_MiniProject.Repo.ClothesRepository;

@RestController
@RequestMapping("/clo")
public class ClothesController {
	@Autowired
	ClothesRepository clothesRepository;

	// Endpoint to create a new clothes item
	@PostMapping("/create")
	public Clothes createClothes(@RequestBody Clothes clothes) {
		return clothesRepository.save(clothes);
	}

	// Endpoint to get all clothes items
	@GetMapping("/all")
	public List<Clothes> getAllClothes() {
		return clothesRepository.findAll();
	}

	// Endpoint to get clothes item by ID
	@GetMapping("/{id}")
	public Clothes getClothesById(@PathVariable Long id) {
		return clothesRepository.findById(id).orElse(null);
	}

	// Endpoint to update a clothes item
	@PutMapping("/update/{id}")
	public Clothes updateClothes(@PathVariable Long id, @RequestBody Clothes updatedClothes) {
		return clothesRepository.findById(id).map(clothes -> {
			clothes.setName(updatedClothes.getName());
			clothes.setCost(updatedClothes.getCost());
			clothes.setFeedback(updatedClothes.getFeedback());
			return clothesRepository.save(clothes);
		}).orElse(null);
	}

	// Endpoint to delete a clothes item by ID
	@DeleteMapping("/delete/{id}")
	public void deleteClothes(@PathVariable Long id) {
		clothesRepository.deleteById(id);
	}
}
