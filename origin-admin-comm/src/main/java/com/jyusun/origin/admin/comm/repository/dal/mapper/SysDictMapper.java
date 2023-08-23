package com.jyusun.origin.admin.dict.repository.dal.mapper;

import com.jyusun.origin.base.mybatis.CoreMapper;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 作用描述： - 字典类型映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
@Mapper
public interface SysDictMapper extends CoreMapper<SysDictDO> {

}
