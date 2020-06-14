package com.anwesys.milestone3demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApiTests extends AbstractRestTest {

    @Autowired
    private GermanRepository germanRepository;
    @Autowired
    private EnglishRepository englishRepository;

    @Before
    public void init() {
        German de = new German();
        de.setWord("Hilfe");
        germanRepository.save(de);

        English en = new English();
        en.setWord("help");
        en.setGerman(de);
        englishRepository.save(en);
    }

    @Ignore
    @Test
    public void getWordList() throws Exception {
        String uri = "/dict";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        German[] germanList = super.mapFromJson(content, German[].class);
        assertTrue(germanList.length > 0);
    }

}
