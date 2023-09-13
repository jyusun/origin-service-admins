package com.jyusun.origin.admin.upms.repository.dal.mapper;

import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRoleDO;
import com.jyusun.origin.base.mybatis.CoreMapper;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysRoleTreeDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.SysTreeQuery;

import java.util.List;

/**
 * 作用描述： - 角色管理映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysRoleMapper extends CoreMapper<SysRoleDO> {

    /**
     * 树查询
     * @param query 查询参数
     * @return {@link List <SysRoleTreeDTO>}
     */
    List<SysRoleTreeDTO> listTree(SysTreeQuery query);

}
