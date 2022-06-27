/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unu.jogja.Ktp.coba;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Unang
 */
@Controller
public class DummyController {

    DummyJpaController dummyController = new DummyJpaController();
    List<Dummy> data = new ArrayList<>();

    @RequestMapping("/create ")
    @ResponseBody
    public List<Dummy> getDummy(){
        try {
        data = dummyController.findDummyEntities();
    }
    catch (Exception e){}
        return data;
    }
     
}
