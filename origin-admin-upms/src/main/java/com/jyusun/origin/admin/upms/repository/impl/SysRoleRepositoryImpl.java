package com.jyusun.origin.admin.upms.repository.impl;


import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRoleDO;
import com.jyusun.origin.admin.upms.repository.SysRoleRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysRoleMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 角色管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysRoleRepositoryImpl extends CoreRepositoryImpl<SysRoleMapper, SysRoleDO>
        implements SysRoleRepository {


}
