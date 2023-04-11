package com.codeclan.filelab.filelab.components;

import com.codeclan.filelab.filelab.models.File;
import com.codeclan.filelab.filelab.models.Folder;
import com.codeclan.filelab.filelab.models.Person;
import com.codeclan.filelab.filelab.repositories.FileRepository;
import com.codeclan.filelab.filelab.repositories.FolderRepository;
import com.codeclan.filelab.filelab.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!Test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

@Override
    public void run(ApplicationArguments args) throws Exception {
        Person person1 = new Person("Taylor");
        personRepository.save(person1);

        Folder folder1 = new Folder("Brian", person1);
        folderRepository.save(folder1);

        File file1 = new File("Word", "txt", 20, folder1);
        fileRepository.save(file1);






    }



}
