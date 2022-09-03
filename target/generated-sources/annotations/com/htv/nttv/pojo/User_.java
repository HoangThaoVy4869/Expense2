package com.htv.nttv.pojo;

import com.htv.nttv.pojo.Details;
import com.htv.nttv.pojo.Incomedetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-03T17:39:46")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile CollectionAttribute<User, Details> detailsCollection;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> gender;
    public static volatile SingularAttribute<User, Integer> phone;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile CollectionAttribute<User, Incomedetails> incomedetailsCollection;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}