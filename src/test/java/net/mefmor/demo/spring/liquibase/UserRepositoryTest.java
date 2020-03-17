package net.mefmor.demo.spring.liquibase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    void readData() {
        assertThat(repository.findAll()).isEqualTo(Arrays.asList(
                User.builder().id(1L).userName("admin").password("admin").email("admin@server.com").build(),
                User.builder().id(2L).userName("guest").password("guest").email("guest@server.com").build()));
    }
}
