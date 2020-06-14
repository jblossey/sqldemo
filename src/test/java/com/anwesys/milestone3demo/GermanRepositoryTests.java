package com.anwesys.milestone3demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GermanRepositoryTests {

    @Autowired
    private GermanRepository germanRepository;
    @Autowired
    private EnglishRepository englishRepository;

    @Test
    public void saveTest() {
        German word = new German();
        word.setWord("Haus");
        germanRepository.save(word);
        Assert.assertNotNull(germanRepository.findByWord("Haus"));
    }

    @Test
    public void whenFindByEnglish_thenReturnGerman() {
        // given
        German de = new German();
        de.setWord("Hilfe");
        germanRepository.save(de);

        English en = new English();
        en.setWord("help");
        en.setGerman(de);
        englishRepository.save(en);

        // when
        German found = germanRepository.findGermanByEnglish(en);

        // then
        assertThat(found.getWord()).isEqualTo("Hilfe");
    }

}
