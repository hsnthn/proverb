//package com.hsnthn.service;
//
//import com.hsnthn.model.Proverb;
//import org.hamcrest.Matchers;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.runners.MockitoJUnitRunner;
//import java.util.List;
//
//@RunWith(MockitoJUnitRunner.class)
//public class ProverbServiceImplTest {
//
//    @InjectMocks
//    private ProverbServiceImpl proverbService;
//
//    @Test
//    public void testFindProverb() {
//        final List<Proverb> proverbList = proverbService.findProverb("Sakla samani gelir zamani");
//        Assert.assertThat(proverbList, Matchers.hasSize(0));
//    }
//
//}