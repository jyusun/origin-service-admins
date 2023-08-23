package com.jyusun.origin.admin.comm.repository.dal.dataobj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jyusun.origin.base.mybatis.data.BaseCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 民政部行政区管理
 *
 * @author jyusun at 2022-03-14 23:07:10
 */
@Data
@ToString
@Schema(name = "数据对象：行政区划",description = "行政区划")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t001_sys_district")
public class SysDistrictDO extends BaseCreate {
    /**
     * 主键ID
     */
    @Schema(description = "主键编号")
    @TableId(value = "sid", type = IdType.ASSIGN_ID)
    private Long sid;
    /**
     * 编号
     */
    @Schema(description = "区域编号")
    @TableField("district_code")
    private String districtCode;

    /**
     * 编号
     */
    @Schema(description = "区域名称")
    @TableField("district_name")
    private String districtName;

    /**
     * 编号
     */
    @Schema(description = "区域类型", example = "1-省/直辖市|2-地市|3-区县")
    @TableField("district_type")
    private String districtType;

    /**
     * 父级编号
     */
    @Schema(description = "父级编号")
    @TableField("parent_code")
    private String parentCode;

    /**
     * 排序
     */
    @Schema(description = "参数排序")
    @TableField("sort")
    private Integer sort;

}
