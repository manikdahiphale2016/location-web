package com.manikit.locationweb.locationweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikit.locationweb.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
