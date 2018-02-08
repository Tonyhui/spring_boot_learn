package com.best.elaticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 *  indexName --> 数据库
 *  type -> table
 *
 */
@Document(indexName = "com", type = "employee")
public class Employee extends BaseModel implements Serializable {

    @Field(type = FieldType.String)
    private String firstName;

    @Field(type = FieldType.String)
    private String lastName;

    @Field(type = FieldType.Integer)
    private int age;

    @Field(type = FieldType.String)
    private String about;

    @Field(type = FieldType.String)
    private String interests;

    @Id
    private long id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //     "first_name" : "John",
//             "last_name" :  "Smith",
//             "age" :        25,
//             "about" :      "I love to go rock climbing",
//             "interests": [ "sports", "music" ]
}
