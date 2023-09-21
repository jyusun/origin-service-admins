package com.jyusun.origin.admin.upms.interfaces.web;

import com.jyusun.origin.admin.upms.repository.SysRsrcRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRsrcDO;
import com.jyusun.origin.base.mybatis.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资源管理
 * <p>
 * 作用描述：资源管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-资源管理")
@RequestMapping("auth/rsrcs")
public class SysRsrcController extends BaseController<SysRsrcRepository, SysRsrcDO> {

    public SysRsrcController(SysRsrcRepository originRepository) {
        super(originRepository);
    }

}
