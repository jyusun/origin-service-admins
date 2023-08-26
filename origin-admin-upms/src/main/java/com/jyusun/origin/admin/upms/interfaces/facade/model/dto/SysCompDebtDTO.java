package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 部门管理
 *
 * @author jyusun at 2021-12-19 15:12:57
 */
@Data
@Schema(description = "数据传输对象：公司部门")
public class SysCompDebtDTO implements BaseDTO {

	private static final long serialVersionUID = 1L;

	@Schema(description = "公司编号")
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

	@Schema(description = "简称")
	private String sname;

	@Schema(description = "排序")
	private Integer sort;

	@Schema(description = "类型", example = "1-公司|2-部门")
	private String treeType;

	private List<SysDebtTreeValue> children;

}
