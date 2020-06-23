package com.bob.eval.models.solr;

import java.util.List;

import com.bob.eval.models.solr.definitions.ISearchableCustomerDefinition;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.geo.Point;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Author: Ibrahim Bou Ncoula
 * TODO: Evolve this model to have stored values and not just indexed values
 * so we can split data between solr and database and evaluate
 */

@SolrDocument(collection = "customers")
public class Customer implements ISearchableCustomerDefinition {
    @Id @Indexed
    private String Id;

    @Indexed(NAME_FIELD_NAME)
    private String name;

    @Indexed(GENDER_FIELD_NAME)
    private String gender;

    @Indexed(LOCATION_FIELD_NAME)
    private Point location;

    @Indexed(CERTIFICATIONS_FIELD_NAME)
    private  List<String> certifications;

    @Indexed(AGE_FIELD_NAME)
    private int age;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
