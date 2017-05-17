package cz.slingshot.dao.model;


import lombok.Value;
import lombok.experimental.FieldDefaults;

@Value
@FieldDefaults(makeFinal = false)
public class User {

    private String userName;
    private String email;
    private String passwordHash;
    private String firstName;
    private String lastName;
    private String middleName;
    private Address adress;

}
