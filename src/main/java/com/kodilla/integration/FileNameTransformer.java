package com.kodilla.integration;

import java.io.IOException;

public class FileNameTransformer {

    public String transformFile(String fileName) throws IOException {
        try {
            return fileName.substring(fileName.lastIndexOf("\\") + 1);
        } catch (RuntimeException re) {
            return fileName;
        }
    }

}