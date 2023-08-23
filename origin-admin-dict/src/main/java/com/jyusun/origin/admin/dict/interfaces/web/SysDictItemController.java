package com.jyusun.origin.admin.dict.interfaces.web;


import com.jyusun.origin.admin.dict.repository.SysDictItemRepository;
import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictItemDO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据字典
 * <p>
 * 作用描述：字典数据维护
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("dict/items")
@Tag(name = "数据字典-类目管理")
public class SysDictItemController extends BaseController<SysDictItemRepository, SysDictItemDO> {
    public SysDictItemController(SysDictItemRepository originRepository) {
        super(originRepository);
    }
}
