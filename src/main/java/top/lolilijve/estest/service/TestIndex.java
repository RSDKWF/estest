package top.lolilijve.estest.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.zxp.esclientrhl.index.ElasticsearchIndex;

/**
 * @program: esdemo
 * @description: ${description}
 * @author: X-Pacific zhang
 * @create: 2019-02-25 14:13
 **/
@Service
public class TestIndex {

    @Autowired
    ElasticsearchIndex<Main2> elasticsearchIndex;

    @Test
    public void testIndex() throws Exception {
//        if (!elasticsearchIndex.exists(Main2.class)) {
            elasticsearchIndex.dropIndex(Main2.class);
            elasticsearchIndex.createIndex(Main2.class);
//        }
    }

}
