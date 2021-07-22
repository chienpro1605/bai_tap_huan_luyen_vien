package com.codegym.repository;

import com.codegym.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
    Iterable<Province> findAllByName(String name);
    Iterable<Province> findAllByNameOrderByName(String name);

}