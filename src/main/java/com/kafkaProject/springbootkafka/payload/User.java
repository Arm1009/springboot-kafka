package com.kafkaProject.springbootkafka.payload;

import jakarta.persistence.*;

/**
 * Entity class representing a user.
 */
@Entity
@Table(name = "json_format")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String firstName;

    @Lob
    private String lastName;

    /**
     * Getter method for retrieving the user's ID.
     *
     * @return The user's ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for setting the user's ID.
     *
     * @param id The user's ID.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for retrieving the user's first name.
     *
     * @return The user's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for setting the user's first name.
     *
     * @param firstName The user's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter method for retrieving the user's last name.
     *
     * @return The user's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for setting the user's last name.
     *
     * @param lastName The user's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Override of the toString() method to provide a string representation of the User object.
     *
     * @return A string representation of the User object.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
