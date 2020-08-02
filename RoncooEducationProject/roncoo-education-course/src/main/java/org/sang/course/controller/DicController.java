package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.sang.course.service.DicService;
import org.sang.config.dto.Page;
import org.sang.config.pojo.course.Dic;
import org.sang.config.pojo.course.qo.DicQO;
import org.sang.config.pojo.course.vo.DicVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据字典(Dic)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("/course/dic")
@Api(tags = "数据字典(Dic)表控制层")
public class DicController {
    /**
     * 服务对象
     */
    @Resource
    private DicService dicService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dic selectOne(Long id) {
        return this.dicService.queryById(id);
    }

    @PostMapping(value = "/listForPage")
    Page<DicVO> listForPage(@RequestBody DicQO qo) {
        List<Dic> list = this.dicService.queryAllByLimit((qo.getPageCurrent() - 1) * qo.getPageSize(), qo.getPageSize());
        List<DicVO> dicVOS = new ArrayList<DicVO>();
        for (Dic dic : list) {
            DicVO vo = new DicVO();
            BeanUtils.copyProperties(dic, vo);
            dicVOS.add(vo);
        }
        Page<DicVO> page = new Page<DicVO>();
        BeanUtils.copyProperties(qo, page);
        page.setList(dicVOS);
        return page;
    }

    @PostMapping(value = "/save")
    Dic save(@RequestBody DicQO qo) {
        Dic dic = new Dic();
        BeanUtils.copyProperties(qo, dic);
        return this.dicService.insert(dic);
    }

    @DeleteMapping(value = "/deleteById")
    Boolean deleteById(Long id) {
        return this.dicService.deleteById(id);
    }

    @PutMapping(value = "/updateById")
    Dic updateById(@RequestBody DicQO qo) {
        Dic dic = new Dic();
        BeanUtils.copyProperties(qo, dic);
        return this.dicService.update(dic);
    }
}
