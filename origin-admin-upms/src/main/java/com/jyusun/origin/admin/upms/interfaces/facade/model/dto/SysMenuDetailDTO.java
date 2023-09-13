package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 菜单明细
 *
 * @author jyusun at 2022-07-01 19:58:57
 */
@Data
@Schema(description = "数据传输对象：菜单明细")
public class SysMenuDetailDTO implements BaseDTO {

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
     * 备注
     */
    @Schema(description = "备注")
    private String remarks;

    /**
     * 父级编号
     */
    @Schema(description = "父级编号")
    private String parentCode;

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

    @Schema(description = "跟随权限")
    private String followAuth;

    private Boolean canTo;

}
