package com.jyusun.origin.admin.upms.repository.impl;


import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysPostDO;
import com.jyusun.origin.admin.upms.repository.SysPostRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysPostMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 岗位管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysPostRepositoryImpl extends CoreRepositoryImpl<SysPostMapper, SysPostDO>
        implements SysPostRepository {


}
