package com.jyusun.origin.admin.comm.repository.impl;

import com.jyusun.origin.admin.comm.repository.SysDictItemRepository;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictItemDO;
import com.jyusun.origin.admin.dict.repository.dal.mapper.SysDictItemMapper;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 字典项仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysDictItemRepositoryImpl extends CoreRepositoryImpl<SysDictItemMapper, SysDictItemDO>
        implements SysDictItemRepository {

}
