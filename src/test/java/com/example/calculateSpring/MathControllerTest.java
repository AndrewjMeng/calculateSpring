package com.example.calculateSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void SumEndpoint() throws Exception {
        this.mvc.perform(get("/math/sum?n=4&n=5&n=6").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("4 + 5 + 6 = 15"));
    }

    @Test
    public void CalculateEndpoint() throws Exception {
        this.mvc.perform(get("/math/calculate?operation=add&x=4&y=6").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("4 + 6 = 10"));
    }

    @Test
    public void CalculateCatchEndpoint() throws Exception {
        this.mvc.perform(get("/math/calculate?x=30&y=5").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("30 + 5 = 35"));
    }

    @Test
    public void VolumePostEndpoint() throws Exception {
        this.mvc.perform(post("/math/volume/3/4/5").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 3x4x5 rectangle is 60"));
    }

    @Test
    public void VolumePatchEndpoint() throws Exception {
        this.mvc.perform(post("/math/volume/6/7/8").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 6x7x8 rectangle is 336"));
    }
    @Test
    public void VolumeGetEndpoint() throws Exception {
        this.mvc.perform(get("/math/volume/6/7/8").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("The volume of a 6x7x8 rectangle is 336"));
    }

    @Test
    public void CircleAreaPostEndpoint() throws Exception {
        this.mvc.perform(post("/math/area").accept(MediaType.APPLICATION_FORM_URLENCODED).param("type", "circle").param("radius", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string("Area of a circle with a radius of 4 is 50.26548"));
    }

    @Test
    public void RectangleAreaPostEndpoint() throws Exception {
        this.mvc.perform(post("/math/area").accept(MediaType.APPLICATION_FORM_URLENCODED).param("type", "rectangle").param("width", "4").param("height", "7"))
                .andExpect(status().isOk())
                .andExpect(content().string("Area of a 4x7 rectangle is 28"));
    }

    @Test
    public void InvalidRectangleAreaPostEndpoint() throws Exception {
        this.mvc.perform(post("/math/area").accept(MediaType.APPLICATION_FORM_URLENCODED).param("type", "rectangle").param("radius", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("Invalid"));
    }

    @Test
    public void InvalidCircleAreaPostEndpoint() throws Exception {
        this.mvc.perform(post("/math/area").accept(MediaType.APPLICATION_FORM_URLENCODED).param("type", "Circle").param("radius", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("Invalid"));
    }

    @Test
    public void AreaGetEndpoint404() throws Exception {
        this.mvc.perform(get("/math/area").accept(MediaType.APPLICATION_FORM_URLENCODED).param("type", "Circle").param("radius", "5"))
                .andExpect(status().is4xxClientError());
    }

}