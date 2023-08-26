package com.jyusun.origin.admin.comm.repository.dal.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jyusun.origin.admin.comm.repository.dal.dataobj.SysDistrictDO;
import com.jyusun.origin.base.mybatis.CoreMapper;
import com.jyusun.origin.admin.comm.interfaces.model.dto.DistrictTreeDTO;
import com.jyusun.origin.admin.comm.interfaces.model.qry.SysDistrictQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 作用描述： - 民政部行政区管理映射器
 *
 * @author jyusun at 2020/1/29 13:13
 * @since 1.0.0
 */
@Mapper
public interface SysDistrictMapper extends CoreMapper<SysDistrictDO> {

    /**
     * 树形结构
     * @param page
     * @param query
     * @return
     */
    Page<DistrictTreeDTO> pageTrees(@Param("page") Page page, @Param("query") SysDistrictQuery query);

}
