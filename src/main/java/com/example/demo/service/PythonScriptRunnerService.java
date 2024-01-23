package com.example.demo.service;

import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service("pythonScriptRunnerService")
public class PythonScriptRunnerService {
	
	public String executePythonScript(){

        try {
        	PythonInterpreter interpreter = new PythonInterpreter();
			interpreter.execfile("python\\sample.py"); 
			interpreter.close();
            return "Script successfully executed.";
        } catch (Exception e) {
            //e.printStackTrace();
            return e.getMessage().toString();
        } 
	}
	
	public String executePythonScriptFromAPI(@RequestBody String pythonScript){

        try {
        	PythonInterpreter interpreter = new PythonInterpreter();
			interpreter.exec(pythonScript); 
			interpreter.close();
		    return "Script successfully executed.";
        } catch (Exception e) {
            //e.printStackTrace();
            return e.getMessage().toString();
        }
	}
	
	public String executeHelloWorldScript() {
		try {
			
			PythonInterpreter interpreter = new PythonInterpreter();
			interpreter.execfile("python\\HelloWorld.py"); 
			interpreter.close();
			return "Script successfully executed.";
        } catch (Exception e) {
            //e.printStackTrace();
            return e.getMessage().toString();
        }
			
	}
}
