package com.manikit.locationweb.locationweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikit.locationweb.locationweb.entities.Location;
import com.manikit.locationweb.locationweb.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		Location savedLocation = getRepository().save(location);	
		return savedLocation;
	}
	
	
	@Override
	public Location updateLocation(Location location) {
		Location updatedLocation = getRepository().save(location);	
		return updatedLocation;
	}

	@Override
	public void deleteLocation(Location location) {
			getRepository().delete(location);
	}

	@Override
	public Location getLocationById(Long id) {
		return getRepository().findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return getRepository().findAll();
	}


	public LocationRepository getRepository() {
		return repository;
	}


	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
