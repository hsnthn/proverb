package com.hsnthn.service;

import com.hsnthn.model.Proverb;
import java.util.List;

public interface ProverbService {

    List<Proverb> findProverbService(String text) throws Exception;

}
