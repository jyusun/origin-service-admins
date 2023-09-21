package com.jyusun.origin.admin.upms.repository.dal.mapper;

import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysUserGroupDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.UserGroupQuery;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserGroupDO;
import com.jyusun.origin.base.mybatis.CoreMapper;

import java.util.List;

/**
 * 作用描述： - 用户分组映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
public interface SysUserGroupMapper extends CoreMapper<SysUserGroupDO> {

    /**
     * 树查询
     * @param query 查询参数
     * @return {@link List< SysUserGroupDTO >}
     */
    List<SysUserGroupDTO> listTree(UserGroupQuery query);

    /**
     * 列表查询
     * @param query 查询参数
     * @return {@link List< SysUserGroupDTO >}
     */
    List<SysUserGroupDTO> listGroup(UserGroupQuery query);

}
