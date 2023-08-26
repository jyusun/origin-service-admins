package com.jyusun.origin.admin.upms.infra.common.enums;

import com.jyusun.origin.core.common.model.BaseKvEnum;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * 用户状态
 *
 * @author jyusun 2023-02-09 16:28:40
 */
@AllArgsConstructor
public enum UserStateEnum implements BaseKvEnum {

    /**
     * 未激活的用户
     */
    NOT_ACTIVE("0", "未激活"),
    /**
     * 常规用户
     */
    NORMAL("1", "正常"),
    /**
     * 某些行为异常被锁定的用户
     */
    LOCK("2", "锁定"),
    /**
     * 违反规定被冻结的用户
     */
    FROZEN("3", "冻结"),
    /**
     * 自主注销的用户
     */
    LOGOFF("9", "注销");

    private final String code;

    private final String desc;

    @Override
    public String code() {
        return this.code;
    }

    @Override
    public String desc() {
        return this.desc;
    }

}
