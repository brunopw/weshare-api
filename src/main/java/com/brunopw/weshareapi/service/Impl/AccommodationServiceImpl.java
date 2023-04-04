package com.brunopw.weshareapi.service.Impl;

import com.brunopw.weshareapi.model.Accommodation;
import com.brunopw.weshareapi.repository.AccommodationRepository;
import com.brunopw.weshareapi.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccommodationServiceImpl implements AccommodationService {

    final AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationServiceImpl(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    @Override
    public List<Accommodation> findAll() {
        return accommodationRepository.findAll();
    }

    @Override
    public Optional<Accommodation> findById(Long accommodationId) {
        return accommodationRepository.findById(accommodationId);
    }

    @Override
    public Optional<Accommodation> findByTenantId(Long tenantId) {
        return accommodationRepository.findByTenantId(tenantId);
    }

    @Override
    public Accommodation create(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    @Override
    public void delete(Long accommodationId) {
        accommodationRepository.deleteById(accommodationId);
    }

    @Override
    public Optional<Accommodation> update(Long id, Accommodation details) {
        return accommodationRepository.findById(id)
                .map(accommodation -> {
                    accommodation.setType(details.getType());
                    accommodation.setBedrooms(details.getBedrooms());
                    accommodation.setBathrooms(details.getBathrooms());
                    accommodation.setLocation(details.getLocation());
                    accommodation.setFacilities(details.getFacilities());
                    accommodation.setRules(details.getRules());
                    accommodation.setAdditionalRules(details.getAdditionalRules());
                    accommodation.setPhotos(details.getPhotos());
                    accommodation.setDescription(details.getDescription());
                    accommodation.setAvailability(details.getAvailability());
                    accommodation.setLandlord(details.getLandlord());
                    accommodation.setTenant(details.getTenant());

                    return accommodationRepository.save(accommodation);
                });
               // .orElseGet(() -> {
               //     details.setId(id);
               //     return accommodationRepository.save(details);
               // });
    }
}
