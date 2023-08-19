package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseTenant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 数据对象
 * <p>
 * 作用描述： 角色管理
 *
 * @author jyusun at 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t002_sys_role")
public class SysRoleDO extends BaseTenant {

    private static final long serialVersionUID = 1L;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;
    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;

    @Schema(description = "排序")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "子集权限", example = "0-不包含|1-包含")
    @TableField("is_include_sub")
    private Boolean includeSub;

    @Schema(description = "启用状态", example = "0-禁用|1-启用")
    @TableField("enabled")
    private Boolean enabled;
}
