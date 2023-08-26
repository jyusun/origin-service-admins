package com.jyusun.origin.admin.comm.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据对象
 * <p>
 * 作用描述： 系统参数
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@Schema(name = "数据对象：系统参数", description = "系统参数")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t001_sys_param")
public class SysParamDO extends BaseData {

	/**
	 * 主键ID
	 */
	@Schema(description = "主键编号")
	@TableId(value = "sid", type = IdType.ASSIGN_ID)
	private Long sid;

	/**
	 * 服务编号
	 */
	@Schema(description = "服务编号")
	@TableField("service_code")
	private String serviceCode;

	/**
	 * 参数类型
	 */
	@Schema(description = "参数类型")
	@TableField("param_type")
	private String paramType;

	/**
	 * 参数名称
	 */
	@Schema(description = "参数名称")
	@TableField("param_name")
	private String paramName;

	/**
	 * 参数键
	 */
	@Schema(description = "参数键")
	@TableField("param_code")
	private String paramCode;

	/**
	 * 参数值
	 */
	@Schema(description = "参数值")
	@TableField("param_value")
	private String paramValue;

	/**
	 * 排序
	 */
	@Schema(description = "参数排序")
	@TableField("sort")
	private Integer sort;

	/**
	 * 状态（0-false 停用 1-true 正常）
	 */
	@Schema(description = "启用状态")
	@TableField("enabled")
	private Boolean enabled;

}
