package com.filiphagno.jobservice.repository;

import com.filiphagno.jobservice.entity.Job;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Set;

@Repository
public interface JobRepository extends ReactiveCrudRepository<Job, String> {
    Flux<Job> findBySkillsIn(Set<String> skills);
}
