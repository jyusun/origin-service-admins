package com.jyusun.origin.admin.info.interfaces.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import com.jyusun.origin.core.common.model.BaseTreeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 行政区域
 *
 * @author jyusun at 2021-12-19 15:12:57
 */
@Data
@Schema(description = "数据传输对象：行政区域")
public class DistrictTreeDTO extends BaseTreeDTO<DistrictTreeDTO> implements BaseDTO {

    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @Schema(description ="主键编号")
    protected Long sid;

    /**
     * 编号
     */
    @Schema(description ="区域编号")
    private String districtCode;

    /**
     * 编号
     */
    @Schema(description ="区域名称")
    private String districtName;

    /**
     * 编号
     */
    @Schema(description  = "区域类型", example = "1-省/直辖市|2-地市|3-区县")
    private String districtType;

    /**
     * 父级编号
     */
    @Schema(description ="父级编号")
    private String parentCode;

    /**
     * 排序
     */
    @Schema(description ="排序")
    private Integer sort;

    /**
     * 创建人ID
     */
    @Schema(description ="创建人ID")
    protected Long createBy;

    /**
     * 创建时间
     */
    @Schema(description ="创建时间")
    protected LocalDateTime createTime;
}

