package com.capgemini.cc.demos.docker.itemservice.service;

import com.capgemini.cc.demos.docker.itemservice.model.Item;
import com.capgemini.cc.demos.docker.itemservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Transactional
    @PostConstruct
    public void init() {
        //itemRepository.save(new Item(1, "A"));
        //itemRepository.save(new Item(2, "B"));
        //itemRepository.save(new Item(3, "C"));
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}