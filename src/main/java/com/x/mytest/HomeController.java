package com.x.mytest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);

System.out.println("hi.......xxxxxxxxxxxxxxxxxx");
System.out.println("swarga bera ---------------ddddddddddd");
System.out.println("swarga bera ---------------       876787868");

System.out.println("hi.......111111121212211");







		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home111111(Locale locale, Model model,HttpServletRequest request,HttpSession session1) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String value = request.getParameter("x");
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("VALUE", value );
		
		
		System.out.println("x------------>"+value);
		
		return "home_1";
	}

	@RequestMapping(value = "/home2/xxx", method = RequestMethod.GET)
	public String home1(Locale locale, Model model,HttpServletRequest request) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "home_2";
	}

	@RequestMapping(value = "/home2/test", method = RequestMethod.GET)
	public String home3(Locale locale, Model model,HttpServletRequest request) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "test/home_3";
	}
}
