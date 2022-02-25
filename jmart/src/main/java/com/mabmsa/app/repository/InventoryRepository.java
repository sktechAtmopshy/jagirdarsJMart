package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mabmsa.app.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
