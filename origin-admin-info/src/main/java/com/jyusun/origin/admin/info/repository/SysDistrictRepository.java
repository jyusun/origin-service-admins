package com.jyusun.origin.admin.info.repository;


import com.jyusun.origin.admin.info.repository.dal.dataobj.SysDistrictDO;
import com.jyusun.origin.base.mybatis.CoreRepository;
import com.jyusun.origin.core.common.model.page.PageObject;
import com.jyusun.origin.core.common.model.page.PageQuery;
import com.jyusun.origin.admin.info.interfaces.model.dto.DistrictTreeDTO;
import com.jyusun.origin.admin.info.interfaces.model.qry.SysDistrictQuery;

/**
 * 作用描述：系统参数
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
public interface SysDistrictRepository extends CoreRepository<SysDistrictDO> {

    PageObject<DistrictTreeDTO> pageTrees(PageQuery pageQuery, SysDistrictQuery query);

}
