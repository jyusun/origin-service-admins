package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.domain.valueobject.BaseValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 菜单元数据值对象
 *
 * @author jyusun at 2022-06-14 18:50:40
 */
@Data
@Schema(description = "值对象：菜单元数据")
public class MenuMetaValue implements BaseValue<MenuMetaValue> {

	@Schema(description = "属性隐藏")
	private Boolean hidden;

	@Schema(description = "始终显示")
	private Boolean alwaysShow;

	@Schema(description = "标题标识")
	private String title;

	@Schema(description = "图标")
	private String icon;

	@Schema(description = "缓存")
	private Boolean noCache;

	@Schema(description = "面包屑")
	private Boolean breadcrumb;

	@Schema(description = "固钉")
	private Boolean affix;

	@Schema(description = "激活菜单")
	private String activeMenu;

	@Schema(description = "无标签视图")
	private Boolean noTagsView;

	private String followAuth;

	private Boolean canTo;

	/**
	 * 值对象通过属性比较，没有唯一ID
	 * @param other 另外的值对象
	 * @return <code>true</code> 属性比较一致时返回true
	 */
	@Override
	public boolean sameValueAs(MenuMetaValue other) {
		return false;
	}

}
