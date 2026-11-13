package com.student;

import java.nio.file.Path;

public class App {
    public Path buildInputPath() {
        return Path.of("data", "input.txt");
    }

    public String buildPortableRelativePath(String folder, String fileName) {
        return folder + "\\" + fileName;
    }
}
