/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edifact.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author rgarcia
 */
@Controller
public class ProjectsController {
    
    @GetMapping({"/", "/projects"})
    public String index() {
        return "projects";
    }
}
