package org.sang.systemController.swaggercontroller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.*;
import org.sang.systementity.NavBar;
import org.sang.systementity.WebsiteLink;
import org.sang.systementity.WebsiteNav;
import org.sang.systementity.WebsiteNavArticle;
import org.sang.systemservice.NavBarService;
import org.sang.systemservice.WebsiteLinkService;
import org.sang.systemservice.WebsiteNavArticleService;
import org.sang.systemservice.WebsiteNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/site")
@Api(description = "站点管理")
public class SiteManagementController {

    @Autowired
    private NavBarService navBarService;

    @Autowired
    private WebsiteNavService websiteNavService;

    @Autowired
    private WebsiteNavArticleService websiteNavArticleService;

    @Autowired
    private WebsiteLinkService websiteLinkService;

    @ApiOperation(value = "分页查询头部导航",notes = "分页查询头部导航")
    @RequestMapping(value = "/selNavBarAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selNavBarAlOL(@RequestParam int offset, @RequestParam int limit){
        List<NavBar> navBarList = new ArrayList<>();
        try {
            navBarList = navBarService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(navBarList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询头部导航信息列表", notes = "多条件查询头部导航信息列表")
    @RequestMapping(value="/queryAllNavBarConditions",method=RequestMethod.POST)
    public Object queryAllNavBarConditions(
            @ApiParam(name="navBar",value="头部导航信息",required=true)
            @RequestBody NavBar navBar){
        List<NavBar> zoneList = new ArrayList<>();
        try {
            zoneList = navBarService.queryAll(navBar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(zoneList);
        return jsonString;
    }

    @ApiOperation(value = "修改头部导航信息", notes = "修改头部导航信息")
    @RequestMapping(value="/modifyNavBar",method=RequestMethod.POST)
    public Object modifyNavBar(
            @ApiParam(name="navBar",value="头部导航信息",required=true)
            @RequestBody NavBar navBar){
        NavBar navBar1 = new NavBar();
        try {
            navBar1 = navBarService.update(navBar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return navBar1;
    }

    @ApiOperation(value = "新增头部导航信息", notes = "新增头部导航信息")
    @RequestMapping(value="/insertNavBar",method=RequestMethod.POST)
    public Object insertNavBar(
            @ApiParam(name="navBar",value="头部导航信息",required=true)
            @RequestBody NavBar navBar){
        NavBar navBar1 = new NavBar();
        try {
            navBar1 = navBarService.insert(navBar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return navBar1;
    }

    @ApiOperation(value = "根据ID删除头部导航信息",notes = "根据ID删除头部导航信息")
    @ApiImplicitParam(paramType = "query",required = true,value = "ID",name = "id")
    @RequestMapping(value = "/delNavBarById",produces = "application/json",method = RequestMethod.POST)
    public Object delNavBarById(@RequestParam String id){
        Boolean flag = false;
        try {
            flag = navBarService.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @ApiOperation(value = "分页查询底部导航",notes = "分页查询底部导航")
    @RequestMapping(value = "/selWebsiteNavAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selWebsiteNavAlOL(@RequestParam int offset, @RequestParam int limit){
        List<WebsiteNav> navBarList = new ArrayList<>();
        try {
            navBarList = websiteNavService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(navBarList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询底部导航信息列表", notes = "多条件查询底部导航信息列表")
    @RequestMapping(value="/queryAllWebsiteNavConditions",method=RequestMethod.POST)
    public Object queryAllWebsiteNavConditions(
            @ApiParam(name="websiteNav",value="底部导航信息",required=true)
            @RequestBody WebsiteNav websiteNav){
        List<WebsiteNav> navBarList = new ArrayList<>();
        try {
            navBarList = websiteNavService.queryAll(websiteNav);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(navBarList);
        return jsonString;
    }

    @ApiOperation(value = "新增底部导航信息", notes = "新增底部导航信息")
    @RequestMapping(value="/insertWebsiteNav",method=RequestMethod.POST)
    public Object insertWebsiteNav(
            @ApiParam(name="websiteNav",value="底部导航信息",required=true)
            @RequestBody WebsiteNav websiteNav){
        WebsiteNav websiteNav1 = new WebsiteNav();
        try {
            websiteNav1 = websiteNavService.insert(websiteNav);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteNav1;
    }

    @ApiOperation(value = "修改底部导航信息", notes = "修改底部导航信息")
    @RequestMapping(value="/updateWebsiteNav",method=RequestMethod.POST)
    public Object updateWebsiteNav(
            @ApiParam(name="websiteNav",value="底部导航信息",required=true)
            @RequestBody WebsiteNav websiteNav){
        WebsiteNav websiteNav1 = new WebsiteNav();
        try {
            websiteNav1 = websiteNavService.update(websiteNav);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteNav1;
    }

    @ApiOperation(value = "根据ID删除底部导航信息",notes = "根据ID删除底部导航信息")
    @ApiImplicitParam(paramType = "query",required = true,value = "ID",name = "id")
    @RequestMapping(value = "/delWebsiteNavById",produces = "application/json",method = RequestMethod.POST)
    public Object delWebsiteNavById(@RequestParam String id){
        Boolean flag = false;
        try {
            flag = websiteNavService.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @ApiOperation(value = "底部导航根据navId查询文章管理", notes = "底部导航根据navId查询文章管理")
    @ApiImplicitParam(paramType = "query",required = true,value = "nav_id",name = "navId")
    @RequestMapping(value="/queryWebsiteNavArticleConditions",method=RequestMethod.POST)
    public Object queryWebsiteNavArticleConditions(@RequestParam String navId){
        WebsiteNavArticle websiteNavArticle = new WebsiteNavArticle();
        try {
            WebsiteNavArticle websiteNavArticle1 = new WebsiteNavArticle();
            websiteNavArticle1.setNavId(Long.valueOf(navId));
            websiteNavArticle = websiteNavArticleService.queryAll(websiteNavArticle1).get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(websiteNavArticle.toString());
    }

    @ApiOperation(value = "修改底部导航文章管理", notes = "修改底部导航文章管理")
    @RequestMapping(value="/updateWebsiteNavArticle",method=RequestMethod.POST)
    public Object updateWebsiteNavArticle(
            @ApiParam(name="websiteNav",value="文章管理",required=true)
            @RequestBody WebsiteNavArticle websiteNavArticle){
        WebsiteNavArticle websiteNavArticle1 = new WebsiteNavArticle();
        try {
            websiteNavArticle1 = websiteNavArticleService.update(websiteNavArticle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteNavArticle1;
    }

    @ApiOperation(value = "添加底部导航文章管理", notes = "添加底部导航文章管理")
    @RequestMapping(value="/insertWebsiteNavArticle",method=RequestMethod.POST)
    public Object insertWebsiteNavArticle(
            @ApiParam(name="websiteNav",value="文章管理",required=true)
            @RequestBody WebsiteNavArticle websiteNavArticle){
        WebsiteNavArticle websiteNavArticle1 = new WebsiteNavArticle();
        try {
            websiteNavArticle1 = websiteNavArticleService.insert(websiteNavArticle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteNavArticle1;
    }

    @ApiOperation(value = "分页查询友情链接",notes = "分页查询友情链接")
    @RequestMapping(value = "/selWebsiteLinkAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selWebsiteLinkAlOL(@RequestParam int offset, @RequestParam int limit){
        List<WebsiteLink> websiteLinkList = new ArrayList<>();
        try {
            websiteLinkList = websiteLinkService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(websiteLinkList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询友情链接", notes = "多条件查询友情链接")
    @RequestMapping(value="/queryAllWebsiteLinkConditions",method=RequestMethod.POST)
    public Object queryAllWebsiteLinkConditions(
            @ApiParam(name="websiteLink",value="头部导航信息",required=true)
            @RequestBody WebsiteLink websiteLink){
        List<WebsiteLink> websiteLinkList = new ArrayList<>();
        try {
            websiteLinkList = websiteLinkService.queryAll(websiteLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(websiteLinkList);
        return jsonString;
    }

    @ApiOperation(value = "修改友情链接信息", notes = "修改友情链接信息")
    @RequestMapping(value="/updateWebsiteLink",method=RequestMethod.POST)
    public Object updateWebsiteLink(
            @ApiParam(name="websiteLink",value="友情链接信息",required=true)
            @RequestBody WebsiteLink websiteLink){
        WebsiteLink websiteLink1 = new WebsiteLink();
        try {
            websiteLink1 = websiteLinkService.update(websiteLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteLink1;
    }

    @ApiOperation(value = "新增友情链接信息", notes = "新增友情链接信息")
    @RequestMapping(value="/insertWebsiteLink",method=RequestMethod.POST)
    public Object insertWebsiteLink(
            @ApiParam(name="websiteLink",value="友情链接信息",required=true)
            @RequestBody WebsiteLink websiteLink){
        WebsiteLink websiteLink1 = new WebsiteLink();
        try {
            websiteLink1 = websiteLinkService.insert(websiteLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return websiteLink1;
    }

    @ApiOperation(value = "根据ID删除友情链接信息",notes = "根据ID删除友情链接信息")
    @ApiImplicitParam(paramType = "query",required = true,value = "ID",name = "id")
    @RequestMapping(value = "/delWebsiteLinkById",produces = "application/json",method = RequestMethod.POST)
    public Object delWebsiteLinkById(@RequestParam String id){
        Boolean flag = false;
        try {
            flag = websiteLinkService.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


}
