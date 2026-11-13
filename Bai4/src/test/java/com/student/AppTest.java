package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void buildsPortablePath() {
        App app = new App();
        assertEquals(Path.of("data", "input.txt"), app.buildInputPath());
        assertEquals("data" + File.separator + "input.txt",
                app.buildPortableRelativePath("data", "input.txt"));
    }
}
