package com.serverside.module.servicebazarbd.repositories;

import com.serverside.module.servicebazarbd.entities.Categories;
import com.serverside.module.servicebazarbd.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
    Optional<Categories> findById(Long id);
    @Query("select distinct c from  Categories c where c.type=?1")
    List<Categories> findByType(String type);
}
