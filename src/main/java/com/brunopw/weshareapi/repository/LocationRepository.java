package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository  extends JpaRepository<Location, Long> {
}
