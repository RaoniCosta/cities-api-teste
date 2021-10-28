package com.github.raonicosta.diocitiesapi.countries.repository;

import com.github.raonicosta.diocitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
