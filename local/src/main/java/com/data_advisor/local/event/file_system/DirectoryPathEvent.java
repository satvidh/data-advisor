package com.data_advisor.local.event.file_system;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * PathEvent instance for directory paths.
 */
public class DirectoryPathEvent extends PathEvent {
    public DirectoryPathEvent(Path path, BasicFileAttributes basicFileAttributes) {
        super(path, basicFileAttributes);
    }
}
