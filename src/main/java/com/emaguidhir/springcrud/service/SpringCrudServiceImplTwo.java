package com.emaguidhir.springcrud.service;

import com.emaguidhir.springcrud.model.SpringCrudContactDetails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;


/**
 * Implementation Two of the SpringCrudService - Placeholder
 */
@Qualifier("SpringCrudServiceImplementationTwo")
public class SpringCrudServiceImplTwo implements SpringCrudService {

    @Override
    public ResponseEntity<String> processModifyRequest(SpringCrudContactDetails[] input_text, String funct, HttpMethod method) {
        return null;
    }
}