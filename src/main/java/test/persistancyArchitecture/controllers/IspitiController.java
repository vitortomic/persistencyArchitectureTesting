/**
 * 
 */
package test.persistancyArchitecture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.enums.Rok;
import test.persistancyArchitecture.services.IspitiService;

/**
 * @author vitor.tomic
 *
 */
@RestController
public class IspitiController {
	
	@Autowired
	private IspitiService ispitiService;
	
	@RequestMapping(value = "/ispitniRok", method = RequestMethod.GET)
	public IspitniRok getIspitniRok(@RequestParam(value="godina",required = true) String godina,
									@RequestParam(value="rok",required = true) String rok) {
		return ispitiService.findByGodinaAndRok(godina, Rok.valueOf(rok));
	}
}
