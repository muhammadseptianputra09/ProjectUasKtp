/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unu.jogja.Ktp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Unang
 */
@Controller
public class DataController {
    
    DataJpaController datactrl = new DataJpaController();
    List<Data> newdata = new ArrayList<>();
    
    @RequestMapping("/main")
    @ResponseBody
    public String getMain(){
        return"menu";
    }
    
    @RequestMapping("/data")
    public String getDataKTP(Model model){
        
        try 
        {newdata = datactrl.findDataEntities(0, 1);
        }
        catch (Exception e){}
        model.addAttribute("goData", newdata);
        return "database";
        
    }
    
    @RequestMapping("/edit")
    public String doEdit(){
        return "editktp";
    }
}
