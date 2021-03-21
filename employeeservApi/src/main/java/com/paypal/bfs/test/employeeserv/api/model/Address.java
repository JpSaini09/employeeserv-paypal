package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * employee address
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonPropertyOrder({
        "id",
        "line_1",
        "line_2",
        "city",
        "state",
        "country",
        "zipcode"
})
@Table
@Entity(name = "address")
public class Address {

    /**
     * address id
     *
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonProperty("id")
    @JsonPropertyDescription("address id")
    private Integer id;
    /**
     * address line 1
     * (Required)
     *
     */
    @NotEmpty(message = "address line1 cannnot be empty")
    @JsonProperty("line_1")
    @JsonPropertyDescription("address line 1")
    private String line1;
    /**
     * address line 2
     *
     */
    @JsonProperty("line_2")
    @JsonPropertyDescription("address line 2")
    private String line2;
    /**
     * city
     * (Required)
     *
     */
    @NotEmpty(message = "city cannnot be empty")
    @JsonProperty("city")
    @JsonPropertyDescription("city")
    private String city;
    /**
     * state
     * (Required)
     *
     */
    @NotEmpty(message = "state cannnot be empty")
    @JsonProperty("state")
    @JsonPropertyDescription("state")
    private String state;
    /**
     * country
     * (Required)
     *
     */
    @NotEmpty(message = "country cannnot be null/empty")
    @JsonProperty("country")
    @JsonPropertyDescription("country")
    private String country;
    /**
     * zip code
     * (Required)
     *
     */
    @NotNull(message = "zipcode cannnot be empty")
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip code")
    private Integer zipcode;

    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * address id
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * address id
     *
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * address line 1
     * (Required)
     *
     */
    @JsonProperty("line_1")
    public String getLine1() {
        return line1;
    }

    /**
     * address line 1
     * (Required)
     *
     */
    @JsonProperty("line_1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * address line 2
     *
     */
    @JsonProperty("line_2")
    public String getLine2() {
        return line2;
    }

    /**
     * address line 2
     *
     */
    @JsonProperty("line_2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * city
     * (Required)
     *
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * city
     * (Required)
     *
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * (Required)
     *
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * state
     * (Required)
     *
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * (Required)
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * (Required)
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip code
     * (Required)
     *
     */
    @JsonProperty("zipcode")
    public Integer getZipcode() {
        return zipcode;
    }

    /**
     * zip code
     * (Required)
     *
     */
    @JsonProperty("zipcode")
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipcode");
        sb.append('=');
        sb.append(((this.zipcode == null)?"<null>":this.zipcode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
