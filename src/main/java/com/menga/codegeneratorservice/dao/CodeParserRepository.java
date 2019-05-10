package com.menga.codegeneratorservice.dao;

import com.menga.codegeneratorservice.domain.CodeParser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marvel on 19/05/10.
 */
public interface CodeParserRepository extends JpaRepository<CodeParser, Integer> {
}
