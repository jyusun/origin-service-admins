package com.jyusun.origin.admin.dict.repository.dal.dataobj;

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
 * 数据对象：
 * <p>
 * 作用描述： 持久化对象 字典值
 *
 * @author jyusun
 * @date 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@Schema(name = "数据对象：字典项目", description = "字典项目")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t001_sys_dict_item")
public class SysDictItemDO extends BaseData {

    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;
    /**
     * 字典编号
     */
    @Schema(description = "字典编号")
    @TableField("dict_code")
    private String dictCode;

    /**
     * 字典键值
     */
    @Schema(description = "字典键值")
    @TableField("dict_value")
    private String dictValue;

    /**
     * 字典标签
     */
    @Schema(description = "字典描述")
    @TableField("dict_desc")
    private String dictDesc;

    /**
     * 默认展示（0-false 否 1-true 是）
     */
    @Schema(description = "默认标识")
    @TableField("def_mark")
    private Boolean defMark;

    /**
     * 字典排序
     */
    @Schema(description = "字典排序")
    @TableField("sort")
    private Integer sort;

    /**
     * 状态（0-false 停用 1-true 正常）
     */
    @Schema(description = "是否启用",example = "0-关闭|1-启用")
    @TableField("enabled")
    private Boolean enabled;

}
