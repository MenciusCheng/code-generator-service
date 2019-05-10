package com.menga.codegeneratorservice.controller;

import com.menga.codegeneratorservice.domain.CodeParser;
import com.menga.codegeneratorservice.service.CodeParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 代码生成器模块
 *
 * Created by Marvel on 19/05/10.
 */
@RestController
@RequestMapping("/api/code")
public class CodeController {
    private final CodeParserService codeParserService;

    @Autowired
    public CodeController(CodeParserService codeParserService) {
        this.codeParserService = codeParserService;
    }

    @PostMapping("/codeParsers")
    public CodeParser saveCodeParser(CodeParser codeParser) {
        return codeParserService.saveCodeParser(codeParser);
    }

    @GetMapping("/codeParsers/{id}")
    public CodeParser findCodeParserById(@PathVariable Integer id) {
        return codeParserService.findCodeParserById(id);
    }

    @GetMapping("/codeParsers")
    public List<CodeParser> findAllCodeParsers() {
        return codeParserService.findAllCodeParsers();
    }
}
