package com.example.demo.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Numbers;
import com.example.demo.repositories.NumbersRepository;

@RestController
public class NumbersController {
	@Autowired
	public NumbersRepository numbersRepository;
	
	@GetMapping("/all")
	public List<Numbers> getAllNumbers(){
		return numbersRepository.findAll();
	}
	
	//////////////
	@GetMapping("/average")
	public double getaverage(){
		double sum =0;
		int i =0;
		double avg;
		for(Numbers num:numbersRepository.findAll()) {
			sum += num.getNum();
			i++;
		}
		avg = sum/i;
		return avg;
	}
	
	///////////////
	
	@PostMapping(value = "/create")
	public String createNumbers(@RequestBody Numbers numbers){
		Numbers insertedNumbers = numbersRepository.insert(numbers);
		return  "Number " + insertedNumbers.getNum() + " "+ " added";
	}
}
