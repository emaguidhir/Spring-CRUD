package com.emaguidhir.springcrud.service;

import com.emaguidhir.springcrud.model.SpringCrudContactDetails;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

/**
 * Interface for the SpringCrudService
 */
public interface SpringCrudService {

    /**
     *
     * @param contactDetails
     *        Details that will be provided by the client for processing
     * @param modification
     *        What type of modification does the client request - Create/Read/Update/Delete
     * @param httpMethod
     *        Is the request sent through Get/Post/Put
     * @return ResponseEntity<String>
     *     Returning the responseEntity for processing
     */
    ResponseEntity<String> processModifyRequest(SpringCrudContactDetails[] contactDetails, String modification, HttpMethod httpMethod);
}
