package com.patterns.cacheproxy;
/**
 * Design an application to query the features of different items. Maintain the 
 * details of a set of recently read items in a cache. When a client object 
 * requests the details of an item that are already available in the cache, 
 * they can be sent back to the client without retrieving details from the database.
 * Implement the purge criteria based on the frequency of access, i.e., each object 
 * in the cache is associated with a counter. When a cache object is returned to a client,
 * its counter is incremented. When the maximum cache limit is reached and a new item 
 * needs to be added to the cache, one of the existing cached items needs to be purged. 
 * Using the access frequency as the criteria, the item in the cache with the least value 
 * for its frequency counter can be deleted. If there is more than one item with 
 * the same lower frequency counter value, then one of them can be chosen at random.
 */
public class ItemManager {
	ItemCache cache;
	AppProperties appProp;
	
	public ItemManager() {
		cache = new ItemCache(3);
		appProp = new AppProperties();
	}
	
	public void activate(Item item){
		cache.countFrequency(item);
		String code = item.getBarCode();
		if(cache.getItem(code) != null){
			System.out.println("Item already activated - cache.");
		} else {
			if(appProp.getProperties(code) != null){
				System.out.println("Item already activated - Properties access.");
			} else {
				cache.addItem(item);
				appProp.insertIntoProperties(cache.getCache());
				System.out.println("Item successfully activated. ");
			}
		}
	}

	public ItemCache getCache() {
		return cache;
	}

	public void setCache(ItemCache cache) {
		this.cache = cache;
	}

	public AppProperties getAppProp() {
		return appProp;
	}

	public void setAppProp(AppProperties appProp) {
		this.appProp = appProp;
	}
	
}
