package com.borjankorunoski.mojachitalnabackend.repository;

import com.borjankorunoski.mojachitalnabackend.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
}
