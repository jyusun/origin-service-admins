package com.jyusun.origin.admin.info.repository.impl;


import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.info.repository.dal.dataobj.SysParamDO;
import com.jyusun.origin.admin.info.repository.SysParamRepository;
import com.jyusun.origin.admin.info.repository.dal.mapper.SysParamMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 系统参数仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysParamRepositoryImpl extends CoreRepositoryImpl<SysParamMapper, SysParamDO>
        implements SysParamRepository {


}
