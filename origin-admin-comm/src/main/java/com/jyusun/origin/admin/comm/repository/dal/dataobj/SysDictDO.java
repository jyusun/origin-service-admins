package com.jyusun.origin.admin.dict.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseData;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 数据对象
 * <p>
 * 作用描述： 持久化对象 字典值
 * </p>
 *
 * @author jyusun
 * @date 2020/1/29 13:08
 * @since 1.0.0
 */
@Data
@Schema(name = "数据对象：字典类型", description = "字典类型")
@TableName("t001_sys_dict")
public class SysDictDO extends BaseData {

    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;

    /**
     * 类型编号
     */
    @Schema(description = "类型编号")
    @TableField("dict_code")
    private String dictCode;

    /**
     * 类型名称
     */
    @Schema(description = "类型名称")
    @TableField("dict_name")
    private String dictName;

    /**
     * 类型排序
     */
    @Schema(description = "类型排序")
    @TableField("sort")
    private Integer sort;

}
