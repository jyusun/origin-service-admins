package com.jyusun.origin.admin.upms.interfaces.web;

import com.jyusun.origin.base.logger.annotation.SysLogger;
import com.jyusun.origin.base.logger.common.enums.OperTypeEnum;
import com.jyusun.origin.core.common.model.result.AbstractResult;
import com.jyusun.origin.admin.upms.repository.SysUserGroupRepository;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.SysUserGroupDTO;
import com.jyusun.origin.admin.upms.interfaces.facade.model.qry.UserGroupQuery;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 分组管理
 * <p>
 * 作用描述：分组管理
 *
 * @author jyusun at 2020/5/19 17:00
 * @since 1.0.0
 */
@RestController
@Tag(name = "权限管理-用户分组")
@RequestMapping("ugroups")
@RequiredArgsConstructor
public class SysUserGroupController {

	private final SysUserGroupRepository sysUserGroupRepository;

	/**
	 * 列表分页查询
	 * @param query {@link UserGroupQuery} 查询对象
	 * @return {@link AbstractResult} 响应结果
	 */
	@Operation(summary = "列表查询")
	@GetMapping("query")
	@SysLogger(operType = OperTypeEnum.DETAIL)
	public List<SysUserGroupDTO> queryGroup(UserGroupQuery query) {
		return this.sysUserGroupRepository.listGroup(query);
	}

}
