package com.example.calculateSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/sum")
    public String getCalculate(WebRequest webRequest){
        Map<String, String[]> params = webRequest.getParameterMap();
        String[] n = params.get("n");
        MathService mathService = new MathService();

        return mathService.getSum(n);
    }

    @RequestMapping(value = "/calculate", method = GET)
    public String getAll(WebRequest webRequest){
        Map<String, String[]> params = webRequest.getParameterMap();
        String operation;
        try {
           operation  = params.get("operation")[0];
        } catch (NullPointerException e) {
            operation = "add";
        }

        int xValue = Integer.parseInt(params.get("x")[0]);
        int yValue = Integer.parseInt(params.get("y")[0]);

        MathService mathService = new MathService();
        return mathService.CalculateInfo(operation, xValue,yValue);
    }
    
    @RequestMapping(value = "/volume/{x}/{y}/{z}")
    public String getVolume(MathVolume volume){
        return volume.buildVolume();
    }

}
