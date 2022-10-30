package com.emaguidhir.springcrud.service;

import com.emaguidhir.springcrud.model.SpringCrudContactDetails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


/**
 * Service Implementation One of the SpringCrudService
 */
@Service
@Qualifier("SpringCrudServiceImplementationOne")
public class SpringCrudServiceImplOne implements SpringCrudService {

    @Override
    public ResponseEntity<String> processModifyRequest(SpringCrudContactDetails[] input_text, String funct, HttpMethod method) {
        return null;
    }
}
