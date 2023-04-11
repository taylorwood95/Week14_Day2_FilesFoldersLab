package com.codeclan.filelab.filelab.repositories;

import com.codeclan.filelab.filelab.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
