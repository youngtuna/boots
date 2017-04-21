package com.tominsivu.boots.service;

import com.tominsivu.boots.dao.RaikanKynatDao;
import com.tominsivu.boots.entity.RaikanKynat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by ttoiviainen on 19/04/17.
 */

@Service
public class RaikanKynatService {

    @Autowired
    private RaikanKynatDao raikanKynatDao;

    public Collection<RaikanKynat> getAllRaikanKynat() {
        return this.raikanKynatDao.getAllRaikanKynat();
    }

    public RaikanKynat getRaikanKynaById(int id) {
        return this.raikanKynatDao.getRaikanKynaById(id);
    }
}
