package com.example.testcontainer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class VariablesTests {
    @Value("${embedded.postgresql.host}")
    String host;

    @Test
    public void test() {
        log.info(host);
    }
}
