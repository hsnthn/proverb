package com.hsnthn.service;

import com.hsnthn.model.Proverb;
import com.hsnthn.repository.ProverbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProverbServiceImpl implements ProverbService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProverbServiceImpl.class);

    @Autowired
    private ProverbRepository proverbRepository;

    @Override
    public List<Proverb> findProverbService(final String text) throws Exception{
        return proverbRepository.findByTextRegex("^"+text);
    }

}