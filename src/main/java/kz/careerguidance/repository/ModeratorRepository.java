package kz.careerguidance.repository;

import kz.careerguidance.entity.persons.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeratorRepository extends JpaRepository<Long, Moderator> {
}
