package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedroomRepository extends JpaRepository<Bedroom, Long> {
}
