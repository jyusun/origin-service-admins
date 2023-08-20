package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.jyusun.origin.base.mybatis.data.BaseData;
import com.jyusun.origin.admin.upms.interfaces.facade.model.dto.MenuMetaValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据对象
 * <p>
 * 作用描述： 资源菜单
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "t002_sys_menu", autoResultMap = true)
public class SysMenuDO extends BaseData {

    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;

    /**
     * 菜单类型;1-目录|2-菜单|3-按钮
     */
    @Schema(description ="规则类型")
    @TableField("rule_type")
    private String ruleType;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;

    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;

    /**
     * 路由地址
     */
    @Schema(description ="菜单路由")
    @TableField("router")
    private String router;

    /**
     * 组件路径
     */
    @Schema(description ="组件路径")
    @TableField("component")
    private String component;

    /**
     * 元数据
     */
    @Schema(description ="元数据")
    @TableField(value = "meta", typeHandler = FastjsonTypeHandler.class)
    private MenuMetaValue meta;

    /**
     * 启用关闭
     */
    @Schema(description ="启用关闭")
    @TableField("enabled")
    private Boolean enabled;

    /**
     * 权限标识
     */
    @Schema(description ="权限标识")
    @TableField("permission")
    private String permission;

    /**
     * 排序
     */
    @Schema(description ="菜单排序")
    @TableField("sort")
    private Integer sort;
    /**
     * 菜单编号
     */
    @Schema(description ="菜单编号")
    @TableField("menu_code")
    private String menuCode;
    /**
     * 父级编号
     */
    @Schema(description ="父级编号")
    @TableField("parent_code")
    private String parentCode;
}
