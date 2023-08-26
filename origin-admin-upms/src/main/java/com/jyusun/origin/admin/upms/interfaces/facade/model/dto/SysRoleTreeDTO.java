package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import com.jyusun.origin.core.common.model.BaseTreeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 角色管理
 *
 * @author jyusun at 2021-12-19 15:12:57
 */
@Schema(description = "数据传输对象：角色管理")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysRoleTreeDTO extends BaseTreeDTO<SysRoleTreeDTO> implements BaseDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键编号
	 */
	@Schema(description = "主键编号")
	private Long sid;

	/**
	 * 名称
	 */
	@Schema(description = "名称")
	private String oname;

	/**
	 *
	 * 编码
	 */
	@Schema(description = "编码")
	private String ocode;

	/**
	 * 排序
	 */
	@Schema(description = "排序")
	private String sort;

	/**
	 * 父级编号
	 */
	@Schema(description = "父级编号")
	private Long parentId;

	/**
	 * 更新人
	 */
	@Schema(description = "更新人ID")
	private Long updateBy;

	/**
	 * 父级编号
	 */
	@Schema(description = "更新日期")
	private LocalDateTime updateTime;

	/**
	 * 租户编号
	 */
	@Schema(description = "租户编号")
	private Long tenantId;

}
