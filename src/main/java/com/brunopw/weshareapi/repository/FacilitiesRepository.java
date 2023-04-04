package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository<Facilities, Long> {
}
