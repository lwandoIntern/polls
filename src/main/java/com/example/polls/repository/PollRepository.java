package com.example.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import com.example.polls.model.Poll;
import java.util.List;
import java.util.Optional;


@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
    Optional<Poll> findById(Long pollId);
    Page<Poll> findByCreatedBy(Long userId, Pageable Pageable);
    long countByCreatedBy(Long userId);
    List<Poll> findByIdIn(List<Long> pollsIds);
    List<Poll> findByIdIn(List<Long> pollsIds, Sort sort);
}
