package com.jyusun.origin.admin.upms.infra.common.enums;

import com.jyusun.origin.core.common.model.BaseKvEnum;
import lombok.AllArgsConstructor;

/**
 * 菜单类型;1-目录|2-菜单|3-按钮
 *
 * @author jyusun 2023-02-09 16:28:40
 */
@AllArgsConstructor
public enum MenuTypeEnum implements BaseKvEnum {

    /**
     * 目录
     */
    DIRECTORY("1", "目录"),
    /**
     * 菜单
     */
    MENU("2", "菜单"),
    /**
     * 按钮
     */
    BUTTON("3", "按钮");

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
