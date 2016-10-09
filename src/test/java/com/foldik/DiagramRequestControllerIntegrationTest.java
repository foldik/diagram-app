package com.foldik;

import com.foldik.domain.request.DiagramRequest;
import com.foldik.domain.request.Label;
import com.foldik.domain.request.Point;
import com.foldik.domain.response.DiagramResponse;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:test.properties")
public class DiagramRequestControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnSvgObject_when_invoked() {
        //GIVEN
        DiagramRequest diagramRequest = new DiagramRequest();
        Label label = new Label();
        label.setxLabel("time[s]");
        label.setyLabel("Value[-]");

        Point point = new Point();
        point.setX(BigDecimal.valueOf(1));
        point.setY(BigDecimal.valueOf(2));

        Point point2 = new Point();
        point2.setX(BigDecimal.valueOf(1));
        point2.setY(BigDecimal.valueOf(2));
        diagramRequest.setLabel(label);
        diagramRequest.setData(Arrays.asList(point, point2));

        //WHEN
        DiagramResponse result = testRestTemplate.postForObject("/diagram", diagramRequest, DiagramResponse.class);

        //THEN
        assertThat(result.getSvg(), equalTo("svg"));
    }

}
