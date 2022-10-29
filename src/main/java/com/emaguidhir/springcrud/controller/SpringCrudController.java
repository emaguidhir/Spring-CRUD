package com.emaguidhir.springcrud.controller;

import com.emaguidhir.springcrud.model.SpringCrudContactDetails;
import com.emaguidhir.springcrud.service.SpringCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Controller class to establish end points for client access
 */
@RestController
public class SpringCrudController {

    private final SpringCrudService myCrudService;

    /**
     * Enabling the ability to reuse a single interface rather than Autowiring the individual class
     * @param myCrudService
     *        The SpringCrudServiceInterface
     */
    @Autowired
    public SpringCrudController(@Qualifier("SpringCrudServiceImplementationOne")  SpringCrudService myCrudService) {
        this.myCrudService = myCrudService;
    }

    /**
     * Controller to handle incoming requests to modify Contact details
     * @param contactDetails
     *        Details that will be provided by the client for processing
     * @param modification
     *        What type of modification does the client request - Create/Read/Update/Delete
     * @param httpMethod
     *        Is the request sent through Get/Post/Put
     * @return ResponseEntity<String>
     *     Returning the responseEntity for processing
     */
    @RequestMapping("/contact")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<String> modifyContactDetails(@RequestBody SpringCrudContactDetails[] contactDetails, @RequestParam String modification,
                                                       HttpMethod httpMethod) {
        return myCrudService.processModifyRequest(contactDetails,modification, httpMethod);
    }

}