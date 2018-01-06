package com.hsnthn.stub;

import com.hsnthn.model.Proverb;

import java.util.Arrays;
import java.util.List;

public class ProverbStub {

    public static List<Proverb> getList() {
        return Arrays.asList(firstProverb(), secondProverb());
    }

    public static Proverb firstProverb(){
        return new Proverb("Test1");
    }

    public static Proverb secondProverb(){
        return new Proverb("Test2");
    }
}
