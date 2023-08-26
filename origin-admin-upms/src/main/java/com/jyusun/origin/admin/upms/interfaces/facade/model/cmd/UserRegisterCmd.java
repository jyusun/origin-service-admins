package com.jyusun.origin.admin.upms.interfaces.facade.model.cmd;

import lombok.Data;

/**
 * 作用描述：
 *
 * @author jyusun at 2023/2/13 17:39
 * @since 1.0.0
 */
@Data
public class UserRegisterCmd {

	private String username;

	private String password;

}
