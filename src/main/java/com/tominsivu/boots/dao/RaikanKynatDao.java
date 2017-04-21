package com.tominsivu.boots.dao;

import com.tominsivu.boots.entity.RaikanKynat;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ttoiviainen on 19/04/17.
 */

@Repository
public class RaikanKynatDao {

    private static Map<Integer,RaikanKynat> raikanKynat;

    static {

        raikanKynat = new HashMap<Integer,RaikanKynat>() {

            {
                put(1,new RaikanKynat(1,"Stabilo","Punainen"));
                put(2,new RaikanKynat(2,"Kuulakarkikyna","Punainen"));
                put(3,new RaikanKynat(3,"Tussi","Oranssi"));
                put(4,new RaikanKynat(4,"Stabilo","Sininen"));
            }
        };
    }

    public Collection<RaikanKynat> getAllRaikanKynat() {
        return this.raikanKynat.values();
    }

    public RaikanKynat getRaikanKynaById(int id) {
        return this.raikanKynat.get(id);
    }

}
