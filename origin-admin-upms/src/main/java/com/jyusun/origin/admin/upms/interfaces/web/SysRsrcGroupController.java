package com.jyusun.origin.admin.upms.interfaces.web;


import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRsrcGroupDO;
import com.jyusun.origin.admin.upms.repository.SysRsrcGroupRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资源分组
 * <p>
 * 作用描述：资源分组
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-资源分组")
@RequestMapping("rgroups")
public class SysRsrcGroupController extends BaseController<SysRsrcGroupRepository, SysRsrcGroupDO> {
    public SysRsrcGroupController(SysRsrcGroupRepository originRepository) {
        super(originRepository);
    }
}
