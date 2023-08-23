package com.jyusun.origin.admin.comm.repository.impl;


import com.jyusun.origin.admin.comm.repository.SysDictRepository;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictDO;
import com.jyusun.origin.admin.dict.repository.dal.mapper.SysDictMapper;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 字典类型仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysDictRepositoryImpl extends CoreRepositoryImpl<SysDictMapper, SysDictDO>
        implements SysDictRepository {


}
