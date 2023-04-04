package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository  extends JpaRepository<Photo, Long> {
}
