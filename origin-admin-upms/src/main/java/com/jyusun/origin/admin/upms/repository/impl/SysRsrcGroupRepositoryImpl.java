package com.jyusun.origin.admin.upms.repository.impl;


import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysRsrcGroupDO;
import com.jyusun.origin.admin.upms.repository.SysRsrcGroupRepository;
import com.jyusun.origin.admin.upms.repository.dal.mapper.SysRsrcGroupMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 资源分组
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysRsrcGroupRepositoryImpl extends CoreRepositoryImpl<SysRsrcGroupMapper, SysRsrcGroupDO>
        implements SysRsrcGroupRepository {

}
