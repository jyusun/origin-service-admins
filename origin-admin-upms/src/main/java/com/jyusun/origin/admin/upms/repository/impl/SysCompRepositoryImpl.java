package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.admin.upms.repository.SysCompRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysCompDO;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysCompMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * 作用描述：租户管理
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysCompRepositoryImpl extends CoreRepositoryImpl<SysCompMapper, SysCompDO> implements SysCompRepository {

}
