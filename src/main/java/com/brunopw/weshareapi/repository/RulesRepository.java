package com.brunopw.weshareapi.repository;

import com.brunopw.weshareapi.model.Rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepository  extends JpaRepository<Rules, Long> {
}
