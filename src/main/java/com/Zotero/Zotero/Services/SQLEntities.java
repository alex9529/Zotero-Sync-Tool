package com.Zotero.Zotero.Services;

import com.Zotero.Zotero.JSONObjects.Item;
import com.Zotero.Zotero.Repositories.*;

import java.util.LinkedList;

public class SQLEntities {

    LinkedList<Item> itemList = new LinkedList<>();
    LinkedList<ItemSQL> itemSQLList = new LinkedList<>();
    LinkedList<ItemCollectionSQL> itemCollectionSQLList = new LinkedList<>();
    LinkedList<ItemAuthorSQL> itemAuthorSQLList = new LinkedList<>();
    LinkedList<ItemTypeFieldsSQL> itemTypeFieldsSQL = new LinkedList<>();
    CollectionSQL collectionSQL;
    UserSQL userSQL = new UserSQL();
    LibrarySQL librarySQL = new LibrarySQL();


    public SQLEntities(LinkedList<Item> itemList, LinkedList<ItemSQL> itemSQLList, CollectionSQL collectionSQL,
                       LinkedList<ItemCollectionSQL> itemCollectionSQLList, LinkedList<ItemAuthorSQL> itemAuthorSQLList,
                       LinkedList<ItemTypeFieldsSQL> itemTypeFieldsSQL, UserSQL userSQL, LibrarySQL librarySQL) {
        this.itemList = itemList;
        this.itemSQLList = itemSQLList;
        this.collectionSQL = collectionSQL;
        this.itemCollectionSQLList = itemCollectionSQLList;
        this.itemAuthorSQLList = itemAuthorSQLList;
        this.itemTypeFieldsSQL = itemTypeFieldsSQL;
        this.userSQL = userSQL;
        this.librarySQL = librarySQL;
    }

    public LinkedList<Item> getItemList() {
        return itemList;
    }

    public LinkedList<ItemSQL> getItemSQLList() {
        return itemSQLList;
    }

    public CollectionSQL getCollectionSQL() {
        return collectionSQL;
    }

    public LinkedList<ItemCollectionSQL> getItemCollectionSQLList() {
        return itemCollectionSQLList;
    }

    public LinkedList<ItemAuthorSQL> getItemAuthorSQLList() {
        return itemAuthorSQLList;
    }

    public LinkedList<ItemTypeFieldsSQL> getItemTypeFieldsSQL() {
        return itemTypeFieldsSQL;
    }

    public UserSQL getUserSQL() {
        return userSQL;
    }

    public LibrarySQL getLibrarySQL() {
        return librarySQL;
    }
}
