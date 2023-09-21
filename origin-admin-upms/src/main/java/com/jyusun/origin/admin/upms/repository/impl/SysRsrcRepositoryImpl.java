package com.jyusun.origin.admin.upms.repository.impl;

import com.jyusun.origin.admin.upms.repository.SysRsrcRepository;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRsrcDO;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysRsrcMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 资源管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysRsrcRepositoryImpl extends CoreRepositoryImpl<SysRsrcMapper, SysRsrcDO> implements SysRsrcRepository {

}
