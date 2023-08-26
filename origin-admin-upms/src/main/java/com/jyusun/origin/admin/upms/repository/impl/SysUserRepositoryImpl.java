package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserDO;
import com.jyusun.origin.admin.upms.repository.SysUserRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysUserMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述：用户账户
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysUserRepositoryImpl extends CoreRepositoryImpl<SysUserMapper, SysUserDO>
		implements SysUserRepository {

}
