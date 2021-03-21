package com.serverside.module.servicebazarbd.repositories;

import com.serverside.module.servicebazarbd.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {
    List<Products> findBySlug(String slug);

    @Query("select distinct p from  Products p left join p.categories c where  c.type=?1")
    List<Products> findByProductType(String type);
}
