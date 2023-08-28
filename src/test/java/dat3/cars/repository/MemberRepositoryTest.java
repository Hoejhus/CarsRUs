package dat3.cars.repository;

import dat3.cars.entity.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    boolean isInitialized = false;

    @BeforeEach
    public void setUp(){
        memberRepository.deleteAll();
        memberRepository.save(new Member("user1", "password1", "user1@example.com", "Alice", "Smith", "123 Main St", "New York", "ZIP1"));
        memberRepository.save(new Member("user2", "password2", "user2@example.com", "Bob", "Johnson", "456 Elm St", "Los Angeles", "ZIP2"));
        isInitialized = true;
    }


    @Test
    public void testAll(){
        assertEquals(2, memberRepository.count());
    }

    @Test
    public void deleteAll(){
        memberRepository.deleteAll();
        assertEquals(0, memberRepository.count());
    }
}