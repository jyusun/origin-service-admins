package com.jyusun.origin.admin.comm.interfaces.remote.provider;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.collect.Lists;
import com.jyusun.origin.admin.client.info.api.SysDictApi;
import com.jyusun.origin.admin.comm.repository.SysDictItemRepository;
import com.jyusun.origin.admin.dict.repository.dal.dataobj.SysDictItemDO;
import com.jyusun.origin.core.common.model.DictDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 提供者
 * <p>
 * 作用描述：日志请求处理
 *
 * @author jyusun
 * @date 2021/3/3 20:49
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(SysDictApi.API_PREFIX)
public class SysDictProvider implements SysDictApi {

    private final SysDictItemRepository sysDictItemRepository;

    /**
     * 查询字典标签
     * @param dictCode {@code String} 类型编号
     * @param dictValue {@code String} 字典键值
     * @return
     */
    @Override
    @GetMapping("{dictCode}/{dictValue}")
    public DictDTO findDict(@PathVariable("dictCode") String dictCode, @PathVariable("dictValue") String dictValue) {
        LambdaQueryWrapper<SysDictItemDO> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(SysDictItemDO::getDictCode, dictCode).eq(SysDictItemDO::getDictValue, dictValue);
        SysDictItemDO one = sysDictItemRepository.getOne(wrapper);
        return new DictDTO().setDictCode(one.getDictCode())
            .setDictValue(one.getDictValue())
            .setDictDesc(one.getDictDesc());
    }

    /**
     * 查询字典项集合
     * @param dictCode {@code String} 类型编号
     * @return
     */
    @Override
    @GetMapping("{dictCode}")
    public List<DictDTO> findItems(@PathVariable("dictCode") String dictCode) {
        LambdaQueryWrapper<SysDictItemDO> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(SysDictItemDO::getDictCode, dictCode);
        List<SysDictItemDO> dictItems = sysDictItemRepository.list(wrapper);
        return Optional.ofNullable(dictItems)
            .orElse(Lists.newArrayList())
            .stream()
            .map(obj -> new DictDTO().setDictCode(obj.getDictCode())
                .setDictDesc(obj.getDictCode())
                .setDictValue(obj.getDictCode())
                .setSort(obj.getSort())
                .setDefMark(obj.getDefMark()))
            .collect(Collectors.toList());
    }

}
