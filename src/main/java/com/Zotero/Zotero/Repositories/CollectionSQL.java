package com.Zotero.Zotero.Repositories;

import com.Zotero.Zotero.JSONObjects.Collection;
import javax.persistence.*;


@Entity (name="collection")
public class CollectionSQL  {


    @Id
    private String collectionKey;
    private int libraryId;
    private int version;
    private String linksSelfHref;
    private int numItems;
    private int numCollections;
    private String name;
    private String parentCollectionKey;

    public String getCollectionKey() {
        return collectionKey;
    }

    public String getLinksSelfHref() {
        return linksSelfHref;
    }

    public int getNumItems() {
        return numItems;
    }

    public int getNumCollections() {
        return numCollections;
    }

    public String getName() {
        return name;
    }

    public String getParentCollectionKey() {
        return parentCollectionKey;
    }


    public int getVersion() {
        return version;
    }

    public int getLibraryId() {
        return libraryId;
    }

    protected CollectionSQL() {}

    public CollectionSQL(Collection collection) {

            this.collectionKey = collection.getCollectionKey();
            this.version = collection.getVersion();
            this.libraryId = collection.getLibrary().getId();
            this.linksSelfHref = collection.getLinks().getSelf().getHref();
            this.numItems = collection.getMeta().getNumItems();
            this.numCollections = collection.getMeta().getNumCollections();
            this.name = collection.getData().getName();
            this.parentCollectionKey = collection.getData().getParentCollection();
    }
}
