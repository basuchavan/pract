package mongodemo.example1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mongodemo.example1.dto.student;
import mongodemo.example1.repo.bookrepo;

@RestController
public class studcontroller {

	@Autowired
	private bookrepo repo;
	
	/*@GetMapping("/getda")
	public ResponseEntity<?> getallbook(){
		
		List<student> l= repo.findAll();
		if(l.size()>0) {
			return new ResponseEntity<List<student>>(l,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("database not found",HttpStatus.NOT_FOUND);
		}
	}*/
		
		@PostMapping("/createdata")
		public ResponseEntity<?> createdata(@RequestBody student st){
			
			repo.save(st);
			
			return new ResponseEntity<String>("data added",HttpStatus.OK);
			
		
		
	}
}
