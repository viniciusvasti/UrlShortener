package com.vas.UrlShortener.repositories;

import com.vas.UrlShortener.models.ShortenedUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Vinicius
 */
@RepositoryRestResource(exported = false)
public interface ShortenedUrlRepository extends JpaRepository<ShortenedUrl, String> {
    
}
