


package com.mycompany.vendingmachinev2.dao;

import com.mycompany.vendingmachinev2.model.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VendingDaoImpl implements VendingDao {

    private Map<String, Item> itemMap = new HashMap<>();
    
    public VendingDaoImpl() {
//        itemMap.put("A1", new Item("Big REd", 0.50, 10, "A1"));
//        itemMap.put("A2", new Item("Juicy Fruit", 0.50, 10, "A2"));
        
    }
    
    @Override
    public Item findItemByCode(String itemCode) {
        for (Item a : itemMap.values()) {
            if (itemCode.equalsIgnoreCase(a.getCode())) {
               return a; 
            }
        }
        return null;
    }

    @Override
    public void lowerItemCount(Item name) {
        name.setCount();
    }

    @Override
    public void removeItem(String code) {
        itemMap.remove(code);
    }

    @Override
    public int returnItemInventory(Item name) {
        return name.getCount();
    }

    @Override
    public void addItem(Item item) {
        itemMap.put(item.getCode(), item);
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> list = new ArrayList<Item>(itemMap.values());
        return list;
    }
    
    @Override
    public void updateItem(Item item) {
        itemMap.put(item.getCode(), item);
    }

}
