package com.jyusun.origin.admin.upms.interfaces.web;

import com.jyusun.origin.base.mybatis.BaseController;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRoleDO;
import com.jyusun.origin.admin.upms.repository.SysRoleRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色管理
 * <p>
 * 作用描述：角色管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-角色管理")
@RequestMapping("roles")
public class SysRoleController extends BaseController<SysRoleRepository, SysRoleDO> {

    public SysRoleController(SysRoleRepository originRepository) {
        super(originRepository);
    }

}
