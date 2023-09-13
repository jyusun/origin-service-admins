package com.jyusun.origin.admin.upms.interfaces.facade.model.dto;

import com.jyusun.origin.core.common.model.BaseDTO;
import com.jyusun.origin.core.common.model.BaseTreeDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户分组
 *
 * @author jyusun at 2021-12-19 15:12:57
 */
@Schema(description = "数据传输对象：用户分组")
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserGroupDTO extends BaseTreeDTO<SysUserGroupDTO> implements BaseDTO {

    private static final long serialVersionUID = 1L;

    @Schema(description = "分组编号")
    private Long sid;

    /**
     * 名称
     */
    @Schema(description = "名称")
    private String oname;

    /**
     * 编码
     */
    @Schema(description = "编码")
    private String ocode;

    /**
     * 父级编号
     */
    @Schema(description = "父级编号")
    private String parentId;

}
