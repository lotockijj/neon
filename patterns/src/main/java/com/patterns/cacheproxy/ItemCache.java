package com.patterns.cacheproxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class ItemCache {
	private final int Max_cache_size;
	private Vector<Item> cache;
	private Map<Item, Integer> counter;
	
	public ItemCache(int maxSize) {
		Max_cache_size = maxSize;
		cache = new Vector<>(Max_cache_size);
		counter = new HashMap<>();
	}
	
	public Item getItem(String code){
		Item item = null;
		int pos = -1;
		for (int i = 0; i < cache.size(); i++) {
			if(cache.get(i).getBarCode() == code){
				pos = i;
			}
		}
		if(pos != -1){
			item = cache.get(pos);
		}
		return item;
	}
	
	public void addItem(Item item){
		if(cache.size() >= Max_cache_size){
			cache.remove(getIndexOfItemWithLessFrequency());
		}
		cache.add(item);
	}
	
	public void countFrequency(Item item){
		if(counter.containsKey(item)){
			counter.put(item, counter.get(item) + 1);
		} else {
			counter.put(item, 1);
		}
	}
	
	public int getIndexOfItemWithLessFrequency(){
		int index = counter.get(cache.get(0));
		for (int i = 1; i < cache.size(); i++) {
			if(counter.get(cache.get(i)) < index){
				index = counter.get(cache.get(i));
			}
		}
		return index;
	}
	
	public void printFrequency(){
		for (Item item : counter.keySet()) {
			System.out.print(item.getBarCode() + " " + counter.get(item) + " ");
		}
	}
	
	public void printCache(){
		System.out.println("\nItems: ");
		for(int i = 0; i < cache.size(); i++){
			System.out.println(cache.get(i).getBarCode() + " frequency: " +  counter.get(cache.get(i)));
		}
	}
	
	public Vector<Item> getCache() {
		return cache;
	}

	public void setCache(Vector<Item> cache) {
		this.cache = cache;
	}
	
	
}
