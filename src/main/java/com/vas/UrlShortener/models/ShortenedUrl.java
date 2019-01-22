/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vas.UrlShortener.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vinicius
 */
@Entity
public class ShortenedUrl implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String originalUrl;
    @Column(nullable = false, unique = true)
    private String shortenedUrl;
    @Column(nullable = false)
    private int shorteningRequestsCounter = 0;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortenedUrl() {
        return shortenedUrl;
    }

    public void setShortenedUrl(String shortenedUrl) {
        this.shortenedUrl = shortenedUrl;
    }

    public int getShorteningRequestsCounter() {
        return shorteningRequestsCounter;
    }

    public void setShorteningRequestsCounter(int shorteningRequestsCounter) {
        this.shorteningRequestsCounter = shorteningRequestsCounter;
    }

    public void incrementRequestsCounter() {
        shorteningRequestsCounter++;
    }

}
