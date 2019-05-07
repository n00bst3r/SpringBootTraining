package de.rajic.springboot.training.repository;

import de.rajic.springboot.training.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findByTitle(String title);

    List<Link> findAllByTitleLikeOrOrderByCreationDateDesc(String title);


}
