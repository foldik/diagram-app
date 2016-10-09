package com.foldik.controller;

import com.foldik.domain.request.DiagramRequest;
import com.foldik.domain.response.DiagramResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagramController {

    @RequestMapping(path="/diagram", method = RequestMethod.POST)
    public DiagramResponse getDiagram(@RequestBody DiagramRequest diagramRequest) {
        DiagramResponse diagramResponse = new DiagramResponse();
        diagramResponse.setSvg("svg");
        return diagramResponse;
    }

}
