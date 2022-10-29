package com.emaguidhir.springcrud.model;

import lombok.*;

@Getter
@Setter
@NonNull
@RequiredArgsConstructor
@ToString
public class SpringCrudUserDetails extends SpringCrudContactDetails {

    private String username;
    private String password;
    private String emailAddress;
    private String confirmationEmailAddress;

}
