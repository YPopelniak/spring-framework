package com.app.repository;

import com.app.entity.Genre;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
