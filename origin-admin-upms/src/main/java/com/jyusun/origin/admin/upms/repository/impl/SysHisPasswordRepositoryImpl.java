package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.admin.upms.repository.SysHisPasswordRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserPwdHisDO;
import com.jyusun.origin.admin.upms.repository.dal.mapper.HisPasswordMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * 密码历史
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysHisPasswordRepositoryImpl extends CoreRepositoryImpl<HisPasswordMapper, SysUserPwdHisDO>
        implements SysHisPasswordRepository {

}
