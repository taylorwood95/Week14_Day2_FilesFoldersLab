package com.codeclan.filelab.filelab;

import com.codeclan.filelab.filelab.models.Person;
import com.codeclan.filelab.filelab.repositories.FolderRepository;
import com.codeclan.filelab.filelab.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileLabApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createperson(){
		Person person = new Person("taylor");
		personRepository.save(person);
	}

}
