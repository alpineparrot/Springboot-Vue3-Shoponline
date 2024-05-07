package org.africalib.shoponline.backend.repository;

import org.africalib.shoponline.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
