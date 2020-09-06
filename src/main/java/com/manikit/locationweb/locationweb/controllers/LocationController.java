package com.manikit.locationweb.locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manikit.locationweb.locationweb.entities.Location;
import com.manikit.locationweb.locationweb.services.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
		Location savedLocation = service.saveLocation(location);
		String msg = "Location saved with id: "+ savedLocation.getId();
		modelMap.addAttribute("msg", msg);
		
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		
		List<Location> allLocation = service.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation{id}")
	public String deleteLocation(@RequestParam("id") Long id,ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		// delete the Location
		service.deleteLocation(location);
		
		// After deleted getAllLocations
		List<Location> allLocation = service.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		
		return "displayLocations";
	}
	
	@RequestMapping("/updateLocation{id}")
	public String showUpdate(@RequestParam("id") Long id,ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
			// update location
		service.updateLocation(location);
		
			// get all Locations
		List<Location> allLocations = service.getAllLocation();
		modelMap.addAttribute("locations", allLocations);
			
		return "displayLocations";
	}
}
