package com.example.demo.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PythonScriptRunnerService;

@RestController()
@RequestMapping("/api")
public class PythonScriptRunnerRestController {
	
	@Autowired
	PythonScriptRunnerService pythonScriptRunnerService;
	
	@GetMapping("/python/script")
	public ResponseEntity<?> executePythonScript(){
		
		return new ResponseEntity<>(pythonScriptRunnerService.executePythonScript(),HttpStatus.OK);
	}
	
	@PostMapping("/python/scriptFromAPI")
	public ResponseEntity<?> executePythonScriptFromAPI(@RequestBody String pythonScript){

		return new ResponseEntity<>(pythonScriptRunnerService.executePythonScriptFromAPI(pythonScript),HttpStatus.OK);
	}
	
	@GetMapping("/python/helloWorld")
	public ResponseEntity<?> executePythonScript3() {
		
		return new ResponseEntity<>(pythonScriptRunnerService.executeHelloWorldScript(),HttpStatus.OK);
			
	}
}
