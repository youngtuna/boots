package com.tominsivu.boots.controller;

import com.tominsivu.boots.entity.RaikanKynat;
import com.tominsivu.boots.service.RaikanKynatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by ttoiviainen on 19/04/17.
 */

@RestController
@RequestMapping("/kynat")
public class RaikanKynatController {

    @Autowired
    private RaikanKynatService raikanKynatService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<RaikanKynat> getAllRaikanKynat() {
        return this.raikanKynatService.getAllRaikanKynat();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RaikanKynat getRaikanKynaById(@PathVariable("id") int id) {
        return this.raikanKynatService.getRaikanKynaById(id);
    }


}
