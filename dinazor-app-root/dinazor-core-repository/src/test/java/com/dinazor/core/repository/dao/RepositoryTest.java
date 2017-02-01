package com.dinazor.core.repository.dao;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;


/**
 * Created by atakan on 01.02.2017.
 */

//@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private GenericDao<String,Long> repository;

    @Test
    public void testExample() throws Exception {
        int a = 1;
//        this.entityManager.persist(new User("sboot", "1234"));
//        User user = this.repository.findByUsername("sboot");
//        assertThat(user.getUsername()).isEqualTo("sboot");
//        assertThat(user.getVin()).isEqualTo("1234");
    }
}
