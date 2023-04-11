package com.codeclan.filelab.filelab.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;



    @JsonIgnoreProperties({"folders"})
    @OneToMany(mappedBy = "folder")
    private List<File> files;


    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = true)
    @JsonIgnoreProperties({"folders"})
    private Person person;

    public Folder() {
    }

    public Folder(String name, Person person){
        this.name = name;
        this.person = person;
        this.files = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
