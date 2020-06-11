package com.abhisek.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abhisek.gateway.object.ItemUpc;

@Repository
public interface ItemUpcRepository extends JpaRepository<ItemUpc, String> {

}
