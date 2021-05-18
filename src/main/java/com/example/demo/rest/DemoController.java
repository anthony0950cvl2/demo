package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.CharacterBDO;

@RestController
@RequestMapping("/bdo")
public class DemoController {

    @GetMapping(produces = { "application/json" })
    public CharacterBDO getCharacterBDO(String id) {
	CharacterBDO character = new CharacterBDO();
	character.setId(id);
	character.setName("FulmineV");
	character.setClassname("Kunoichi");
	character.setLevel(62);
	return character;
    }

}
