package com.Zotero.Zotero;


import com.Zotero.Zotero.JSONObjects.Collection;
import com.Zotero.Zotero.JSONObjects.Item;
import com.Zotero.Zotero.SQL.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;

@SpringBootApplication
public class ZoteroApplication {

	private ItemSQL itemSQL;
	private CollectionSQL collectionSQL;
	private LinkedList<ItemCollectionSQL> itemCollectionSQLList;
	private ItemTypeFieldsSQL itemTypeFieldsSQL;

	private static final Logger log = LoggerFactory.getLogger(ZoteroApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ZoteroApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Item item = restTemplate.getForObject(
					"https://api.zotero.org/users/6098055/items/DWU7JMWB?key=NNb41PLF2hKJBKbo3tCtEJuO", Item.class);

			Item itemBib = restTemplate.getForObject(
					"https://api.zotero.org/users/6098055/items/DWU7JMWB?include=bib&key=NNb41PLF2hKJBKbo3tCtEJuO", Item.class);


			Collection collection = restTemplate.getForObject(
					"https://api.zotero.org/users/6098055/collections/YPQC2LG5?key=NNb41PLF2hKJBKbo3tCtEJuO", Collection.class);

			itemSQL = new ItemSQL(item, itemBib);

			collectionSQL = new CollectionSQL(collection);
			itemCollectionSQLList = new LinkedList<ItemCollectionSQL>();
			for (int i = 0; i<item.getData().getCollections().size(); i++){
				itemCollectionSQLList.addFirst(new ItemCollectionSQL(item, i));
			}
			log.info(item.toString());

			itemTypeFieldsSQL = new ItemTypeFieldsSQL(item);


		};
	}


	@Bean
	public CommandLineRunner demo(ItemRepository itemRepo, CollectionRepository collectionRepo, ItemCollectionRepository itemCollectionRepo, ItemTypeFieldsRepository itemTypeFieldsRepo) {
		return (args) -> {
			itemRepo.save(itemSQL);
			collectionRepo.save(collectionSQL);
			for (int i = 0; i<itemCollectionSQLList.size(); i++) {
				itemCollectionRepo.save(itemCollectionSQLList.get(i));
			}
			itemTypeFieldsRepo.save(itemTypeFieldsSQL);
			log.info("");
		};
	}

}
