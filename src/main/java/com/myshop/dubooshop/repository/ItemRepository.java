package com.myshop.dubooshop.repository;

import com.myshop.dubooshop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
