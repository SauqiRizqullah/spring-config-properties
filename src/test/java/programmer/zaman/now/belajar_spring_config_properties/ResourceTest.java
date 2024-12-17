package programmer.zaman.now.belajar_spring_config_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ResourceTest {

    @Test
    void testResource() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("/text/sample.txt");

        Assertions.assertNotNull(classPathResource);
        Assertions.assertTrue(classPathResource.exists());
        Assertions.assertNotNull(classPathResource.getFile());
    }

}
