package com.Zotero.Zotero.API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.util.LinkedList;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {


    private String key;
    private int version;
    private String itemType;
    private String title;
    private LinkedList<Creators> creators;
    private String abstractNote;
    private String publicationTitle;
    private int volume;
    private int issue;
    private String pages;
    private String date;
    private String series;
    private String seriesTitle;
    private String seriesText;
    private String journalAbbreviation;
    private String language;
    private String DOI;
    private String ISSN;
    private String shortTitle;
    private String url;
    private LocalDateTime accessDate;
    private String archive;
    private String archiveLocation;
    private String libraryCatalog;
    private String callNumber;
    private String rights;
    private String extra;
    private LinkedList <String> tags;
    private LinkedList <String> collections;
    private Relation relations;
    private LocalDateTime dateAdded;
    private LocalDateTime dateModified;

    public String getKey() {
        return key;
    }

    public int getVersion() {
        return version;
    }

    public LinkedList<Creators> getCreators() {
        return creators;
    }

    public String getAbstractNote() {
        return abstractNote;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public int getVolume() {
        return volume;
    }

    public int getIssue() {
        return issue;
    }

    public String getPages() {
        return pages;
    }

    public String getDate()  {
        return date;
    }

    public String getSeries() {
        return series;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public String getSeriesText() {
        return seriesText;
    }

    public String getJournalAbbreviation() {
        return journalAbbreviation;
    }

    public String getLanguage() {
        return language;
    }

    public String getDOI() {
        return DOI;
    }

    public String getISSN() {
        return ISSN;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getAccessDate() {
        return accessDate;
    }

    public String getArchive() {
        return archive;
    }

    public String getArchiveLocation() {
        return archiveLocation;
    }

    public String getLibraryCatalog() {
        return libraryCatalog;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getRights() {
        return rights;
    }

    public String getExtra() {
        return extra;
    }

    public LinkedList<String> getTags() {
        return tags;
    }

    public LinkedList<String> getCollections() {
        return collections;
    }

    public Relation getRelations() {
        return relations;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }


    public String getItemType() {
        return this.itemType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Data{" +
                "title= " + "\"" + title + "\"" +
                ", itemtype='" + itemType + '\'' +
                '}';
    }
}