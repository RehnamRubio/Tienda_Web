/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Tienda;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Le dijo a SB que esto es un controller
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
        //Este mae va a ir a retornar lo que hay dentro de templates
    }
}