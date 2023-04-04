package com.brunopw.weshareapi.service;

import com.brunopw.weshareapi.model.Accommodation;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {

    List<Accommodation> findAll();

    Optional<Accommodation> findById(Long accommodationId);

    Optional<Accommodation> findByTenantId(Long tenantId);

    Accommodation create(Accommodation accommodation);

    void delete(Long accommodationId);

    Optional<Accommodation> update(Long id, Accommodation details);
}
