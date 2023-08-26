package com.jyusun.origin.admin.upms.repository;

import com.jyusun.origin.admin.upms.repository.dal.dataobj.SysUserGroupDO;
import com.jyusun.origin.base.mybatis.CoreRepository;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysUserGroupDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.UserGroupQuery;

import java.util.List;

/**
 * 作用描述：用户分组
 *
 * @author jyusun at 2020/3/13 14:55
 * @since 1.0.0
 */
public interface SysUserGroupRepository extends CoreRepository<SysUserGroupDO> {

	/**
	 * 树查询
	 * @param query 分组查询
	 * @return {@link List< SysUserGroupDTO >}
	 */
	List<SysUserGroupDTO> listTree(UserGroupQuery query);

	/**
	 * 列表查询
	 * @param query 分组查询
	 * @return {@link List< SysUserGroupDTO >}
	 */
	List<SysUserGroupDTO> listGroup(UserGroupQuery query);

}
