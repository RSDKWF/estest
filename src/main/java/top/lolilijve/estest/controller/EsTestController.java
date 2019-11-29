package top.lolilijve.estest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lolilijve.estest.service.Main2;
import top.lolilijve.estest.service.TestCRUD;
import top.lolilijve.estest.service.TestIndex;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lolilijve
 * @since 2019-11-29
 */
@RestController
@RequestMapping("/es-test")
@AllArgsConstructor
public class EsTestController {

    private TestIndex testIndex;
    private TestCRUD testCRUD;

    @PostMapping("indexTest")
    public void index() {
        try {
            testIndex.testIndex();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("saveTest")
    public void saveTest() {
        try {
            testCRUD.testsave();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("testSearch")
    public List<Main2> testSearch() {
        try {
            return testCRUD.testSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
