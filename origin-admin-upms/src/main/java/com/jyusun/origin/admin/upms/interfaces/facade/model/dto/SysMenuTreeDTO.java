package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import com.jyusun.origin.core.common.model.BaseTreeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 菜单管理
 *
 * @author jyusun at 2021-12-19 15:12:57
 */
@Schema(description = "数据传输对象：菜单管理")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysMenuTreeDTO extends BaseTreeDTO<SysMenuTreeDTO> implements BaseDTO {

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
	 * 规则类型;1-目录|2-菜单|3-按钮
	 */
	@Schema(description = "规则类型")
	private String ruleType;

	/**
	 * 路由地址
	 */
	@Schema(description = "菜单路由")
	private String router;

	/**
	 * 组件路径
	 */
	@Schema(description = "组件路径")
	private String component;

	/**
	 * 权限标识
	 */
	@Schema(description = "权限标识")
	private String permission;

	/**
	 * 权限标识
	 */
	@Schema(description = "菜单元数据")
	private MenuMetaValue meta;

	/**
	 * 启用关闭
	 */
	@Schema(description = "启用关闭")
	private Boolean enabled;

	/**
	 * 排序
	 */
	@Schema(description = "菜单排序")
	private Integer sort;

	/**
	 * 菜单编号
	 */
	@Schema(description = "菜单编号")
	private String menuCode;

	/**
	 * 父级编号
	 */
	@Schema(description = "父级编号")
	private String parentCode;

	/**
	 * 备注
	 */
	@Schema(description = "备注")
	private String remarks;

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

}
