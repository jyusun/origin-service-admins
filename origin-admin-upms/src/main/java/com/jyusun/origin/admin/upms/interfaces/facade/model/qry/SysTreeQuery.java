package com.jyusun.origin.admin.upms.interfaces.facade.model.qry;

import com.jyusun.origin.core.common.model.BaseQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 树结构查询
 *
 * @author jyusun at 2022-04-14 17:26:28
 */
@Schema(description = "查询对象：树")
@Data
public class SysTreeQuery implements BaseQuery {

    /**
     * 租户编号
     */
    @Schema(description = "租户编号")
    private Long compId;

    /**
     * 父级编号
     */
    @Schema(description = "父级编号")
    private Long parentId;

    public SysTreeQuery() {
        this.init();
    }

    private void init() {
        this.compId = 0L;
        this.parentId = 0L;
    }

}
