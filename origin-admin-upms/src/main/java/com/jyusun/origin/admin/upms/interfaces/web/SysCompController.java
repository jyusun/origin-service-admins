package com.jyusun.origin.admin.upms.interfaces.web;

import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysCompDO;
import com.jyusun.origin.admin.upms.repository.SysCompRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公司管理
 * <p>
 * 作用描述：公司管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name= "公司管理")
@RequestMapping("comps")
public class SysCompController extends BaseController<SysCompRepository, SysCompDO> {

    public SysCompController(SysCompRepository originRepository) {
        super(originRepository);
    }
}
