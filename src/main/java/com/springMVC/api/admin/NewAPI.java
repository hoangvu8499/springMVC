package com.springMVC.api.admin;

import com.springMVC.dto.NewDto;
import org.springframework.web.bind.annotation.*;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

    @PostMapping("/new")
    public NewDto createNew(@RequestBody NewDto newDto) {
        return newDto;
    }

    @PutMapping("/new")
    public NewDto updateNew(@RequestBody NewDto newDto) {

        return null;
    }

    @DeleteMapping("/new")
    public void deleteNew(@RequestBody long[] ids) {

    }

}
