package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysUserGroupDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.UserGroupQuery;
import com.jyusun.origin.admin.upms.repository.SysUserGroupRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserGroupDO;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysUserGroupMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作用描述：用户分组
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysUserGroupRepositoryImpl extends CoreRepositoryImpl<SysUserGroupMapper, SysUserGroupDO>
        implements SysUserGroupRepository {

    @Override
    public List<SysUserGroupDTO> listTree(UserGroupQuery query) {
        return this.baseMapper.listTree(query);
    }

    @Override
    public List<SysUserGroupDTO> listGroup(UserGroupQuery query) {
        return this.baseMapper.listGroup(query);
    }

}
