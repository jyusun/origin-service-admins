package com.jyusun.origin.admin.upms.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseTenant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 部门信息
 *
 * @author jyusun at 15:59:51
 */
@Data
@Schema(name = "数据对象：部门管理", description = "部门管理")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("t002_sys_debt")
public class SysDebtDO extends BaseTenant {

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;

    @Schema(description = "名称")
    @TableField("oname")
    private String oname;

    @Schema(description = "编码")
    @TableField("ocode")
    private String ocode;

    @Schema(description = "简称")
    @TableField("sname")
    private String sname;

    @Schema(description = "排序")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "父级编号")
    @TableField("parent_id")
    private Long parentId;

}
