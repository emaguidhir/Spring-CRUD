package com.emaguidhir.springcrud.model;

import lombok.*;

/**
 * Model for SpringCrudContactDetails
 */
@Getter
@Setter
@NonNull
@RequiredArgsConstructor
@ToString
public class SpringCrudContactDetails {

    private Long id;
    private String firstName;
    private String secondName;
    private int age;
}