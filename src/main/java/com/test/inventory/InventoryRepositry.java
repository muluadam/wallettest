package com.test.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepositry extends JpaRepository<Inventory,Long> {
}
