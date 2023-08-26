package com.jyusun.origin.admin.upms.interfaces.facade.model.qry;

import com.jyusun.origin.core.common.model.BaseQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 菜单查询
 *
 * @author jyusun at 2022-04-14 17:26:28
 */
@Schema(name = "查询对象：系统菜单", description = "查询对象：系统菜单")
@Data
public class SysMenuQuery implements BaseQuery {

	@Schema(description = "名称")
	private String oname;

	/**
	 * 父级编号
	 */
	@Schema(description = "父级编号")
	private String parentCode;

	/**
	 * 启用关闭
	 */
	@Schema(description = "启用关闭")
	private Boolean enabled;

	public SysMenuQuery() {
		this.init();
	}

	private void init() {
		this.enabled = true;
		this.parentCode = "-1";
	}

}
