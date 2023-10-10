package oleg.sichev.dao.controller;

import lombok.AllArgsConstructor;
import oleg.sichev.dao.repository.Repository;
import oleg.sichev.dao.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {
    private Service service;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name", required = false) String name){
        return service.getProductName(name);
    }
}
