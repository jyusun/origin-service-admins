package com.jyusun.origin.admin.comm.repository.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jyusun.origin.base.mybatis.CoreRepositoryImpl;
import com.jyusun.origin.base.mybatis.common.util.ConditionUtil;
import com.jyusun.origin.base.mybatis.common.util.PageUtil;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.admin.comm.repository.dal.dataobj.SysDistrictDO;
import com.jyusun.origin.admin.comm.repository.SysDistrictRepository;
import com.jyusun.origin.admin.comm.repository.dal.mapper.SysDistrictMapper;
import com.jyusun.origin.admin.comm.interfaces.model.dto.DistrictTreeDTO;
import com.jyusun.origin.admin.comm.interfaces.model.qry.SysDistrictQuery;
import org.springframework.stereotype.Repository;

/**
 * 作用描述： 民政部行政区管理仓储服务
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
@Repository
public class SysDistrictRepositoryImpl extends CoreRepositoryImpl<SysDistrictMapper, SysDistrictDO>
        implements SysDistrictRepository {

    @Override
    public PageObject<DistrictTreeDTO> pageTrees(PageQuery pageQuery, SysDistrictQuery query) {
        Page<DistrictTreeDTO> page = this.baseMapper.pageTrees(ConditionUtil.pageInfo(pageQuery), query);
        return PageUtil.dataInfo(page);
    }

}
