package com.codeclan.filelab.filelab.repositories;

import com.codeclan.filelab.filelab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
