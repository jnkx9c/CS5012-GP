package edu.umsl.cs5012.groupproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

	public final static String VIEW_BASE = "_base";
	
	
	
	@RequestMapping({"/",""})
	public RedirectView redirectToHomePage(Model model) {
		
		return new RedirectView("/homepage",true);
	}
	
	@RequestMapping("/homepage")
	public ModelAndView navToHomePage(Model model) {
		model.addAttribute("view","home.jsp");
		return new ModelAndView(VIEW_BASE);
	}
	
	
	@RequestMapping("/loginpage")
	public ModelAndView navToLoginPage(Model model) {
		model.addAttribute("view","login.jsp");
		return new ModelAndView(VIEW_BASE);
	}
	
	@RequestMapping("/orderhistorypage")
	public ModelAndView navToOrderHistoryPage(Model model) {
		model.addAttribute("view","order-history.jsp");
		return new ModelAndView(VIEW_BASE);
	}
	
	
	@RequestMapping("/orderhistorydetailpage")
	public ModelAndView navToOrderHistoryDetailPage(Model model) {
		model.addAttribute("view","order-history.jsp");
		return new ModelAndView(VIEW_BASE);
	}	
	
	@RequestMapping("/productlistingpage")
	public ModelAndView navToProductListingPage(Model model) {
		model.addAttribute("view","product-listing.jsp");
		return new ModelAndView(VIEW_BASE);
	}	
	
	@RequestMapping("/registerpage")
	public ModelAndView navToRegisterPage(Model model) {
		model.addAttribute("view","register.jsp");
		return new ModelAndView(VIEW_BASE);
	}
	
	@RequestMapping("/shoppingcartpage")
	public ModelAndView navToShoppingCartPage(Model model) {
		model.addAttribute("view","shopping-cart.jsp");
		return new ModelAndView(VIEW_BASE);
	}	
	
	
	
}
