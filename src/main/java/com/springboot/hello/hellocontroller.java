package com.springboot.hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class hellocontroller {
    
    int currentId = 0;
     private Map<Long, Item> itemRepository = new HashMap<>();

    @GetMapping("hello")
    public String hello(){
        return "Momina";
    }
    @PostMapping("/items")
    public Item createItem(@RequestParam String name, @RequestParam String description, @RequestParam double price) {
        Item newItem = new Item(currentId++, name, description, price);
        itemRepository.put(newItem.getId(), newItem);
        System.out.println(itemRepository);
        return newItem;
    }
}
