package zxw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zxw.VO.BaseQueryParam;
import zxw.service.IndexService;

/**
 * @author zxw
 * @date 2019/11/25 20:41
 */
@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping("/indexCaca")
    public Page Indexcaca(BaseQueryParam baseQueryParam) {
        return indexService.cacaIndex(baseQueryParam);
    }
}
