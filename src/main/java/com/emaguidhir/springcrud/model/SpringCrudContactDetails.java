package com.emaguidhir.springcrud.model;

import lombok.*;

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
