package com.example.springjpa.one_to_one.two_way;

import com.example.springjpa.one_to_one.Person;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * House(1) <-> Person(1)
 *
 *     create table house (
 *        id bigint generated by default as identity,
 *         address varchar(255),
 *         person_person_id bigint,
 *         primary key (id)
 *     )
 */

@Getter
@Setter
@Entity
@ToString
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "house_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "person_id")
    private Person person;
}
