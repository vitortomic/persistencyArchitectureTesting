/**
 * 
 */
package test.persistancyArchitecture.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.error.exception.ResourceNotFoundException;
import test.persistancyArchitecture.services.PrijavaIspitaService;
import test.persistancyArchitecture.services.StudentService;

/**
 * @author vitor.tomic
 *
 */
@RestController
public class PrijavaIspitaController {
	
	@Autowired
	private PrijavaIspitaService prijavaIspitaService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student/{brojIndexa}/prijave", method=RequestMethod.GET)
	public List<PrijavaIspita> findByStudent(@PathVariable String brojIndexa, HttpServletRequest request){
		Student student = studentService.findByIndex(brojIndexa).orElseThrow(()-> new ResourceNotFoundException("Student not found"));
		return prijavaIspitaService.getPrijaveForStudent(student);
	}
}
