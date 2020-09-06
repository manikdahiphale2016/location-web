package com.manikit.locationweb.locationweb.services;

import java.util.List;

import com.manikit.locationweb.locationweb.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(Long id);

	List<Location> getAllLocation();

}
