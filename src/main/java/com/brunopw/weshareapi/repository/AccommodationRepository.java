package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    Optional<Accommodation> findByTenantId(Long tenantId);
}
