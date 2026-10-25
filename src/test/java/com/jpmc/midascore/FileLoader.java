package com.jpmc.midascore;

import org.springframework.stereotype.Component;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Component
public class FileLoader {
    public String[] loadStrings(String path) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(path);
            String fileText = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            return fileText.split(System.lineSeparator());
        } catch (Exception e) {
            return null;
        }
    }
}
