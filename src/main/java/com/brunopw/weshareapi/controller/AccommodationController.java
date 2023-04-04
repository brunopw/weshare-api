package com.brunopw.weshareapi.controller;

import com.brunopw.weshareapi.exception.ElementNotFoundException;
import com.brunopw.weshareapi.model.Accommodation;
import com.brunopw.weshareapi.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/accommodations")
public class AccommodationController {

    final AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Accommodation> findAll() {
        System.out.println("FindAll");
        return accommodationService.findAll();
    }

    @GetMapping(value ="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Accommodation findById(@PathVariable Long id) {
        return accommodationService.findById(id)
                .orElseThrow(() -> new ElementNotFoundException(id.toString()));
    }

    @GetMapping(value ="/tenant/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Accommodation findByTenantId(@PathVariable Long id) {
        return accommodationService.findByTenantId(id)
                .orElseThrow(() -> new ElementNotFoundException(id.toString()));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Accommodation create(@RequestBody Accommodation accommodation) {
        System.out.println(accommodation);
        return accommodationService.create(accommodation);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        accommodationService.delete(id);
    }

}
