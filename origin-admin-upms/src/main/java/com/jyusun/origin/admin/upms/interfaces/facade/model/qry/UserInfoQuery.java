package com.jyusun.origin.admin.upms.interfaces.facade.model.qry;

import com.jyusun.origin.core.common.model.BaseQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 用户账户查询
 *
 * @author jyusun
 */
@Data
public class UserInfoQuery implements BaseQuery {

    @Schema(description = "登录名")
    private String username;

    @Schema(description = "用户昵称")
    private String nickname;

}
