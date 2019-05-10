package com.menga.codegeneratorservice.service;

import com.menga.codegeneratorservice.domain.CodeParser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * Created by Marvel on 19/05/10.
 */
public interface CodeParserService {

    CodeParser saveCodeParser(CodeParser codeParser);

    CodeParser findCodeParserById(Integer id);

    List<CodeParser> findAllCodeParsers();
}
