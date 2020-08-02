package org.sang.course.controller.swaggercontroller;

import io.swagger.annotations.*;
import com.alibaba.fastjson.JSONArray;
import org.sang.config.pojo.course.Course;
import org.sang.config.pojo.course.CourseAudit;
import org.sang.config.pojo.course.CourseCategory;
import org.sang.course.service.CourseAuditService;
import org.sang.course.service.CourseCategoryService;
import org.sang.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
@Api(description = "课程管理")
public class CourseManagementController {

    @Autowired
    CourseService courseService;

    @Autowired
    CourseCategoryService courseCategoryService;

    @Autowired
    CourseAuditService courseAuditService;

    @ApiOperation(value = "分页查询全部课程列表",notes = "分页查询全部课程列表")
    @RequestMapping(value = "/selCourseAllOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selCourseAllOL(@RequestParam int offset, @RequestParam int limit){
        List<Course> courseArrayList = new ArrayList<>();
        try {
            courseArrayList = courseService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseArrayList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询课程信息列表", notes = "多条件查询课程信息列表")
    @RequestMapping(value="/queryAllCourseConditions",method=RequestMethod.POST)
    public Object queryAllCourseConditions(
            @ApiParam(name="course",value="课程信息",required=true)
            @RequestBody Course course){
        List<Course> courseArrayList = new ArrayList<>();
        try {
            courseArrayList = courseService.queryAll(course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseArrayList);
        return jsonString;
    }

    @ApiOperation(value = "修改课程信息与状态和上下架", notes = "修改课程信息与状态")
    @RequestMapping(value="/modifyCourse",method=RequestMethod.POST)
    public Object modifyCourse(
            @ApiParam(name="course",value="课程信息",required=true)
            @RequestBody Course course){
        Course course1 = new Course();
        try {
            course1 = courseService.update(course);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course1;
    }

    @ApiOperation(value = "分页查询全部课程列表-审核",notes = "分页查询全部课程列表-审核")
    @RequestMapping(value = "/selCourseAuditAllOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selCourseAuditAllOL(@RequestParam int offset, @RequestParam int limit){
        List<CourseAudit> courseArrayList = new ArrayList<>();
        try {
            courseArrayList = courseAuditService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseArrayList);
        return jsonString;
    }

    @ApiOperation(value = "修改课程信息与状态和上下架-审核", notes = "修改课程信息与状态和上下架-审核")
    @RequestMapping(value="/modifyCourseAudit",method=RequestMethod.POST)
    public Object modifyCourse(
            @ApiParam(name="courseAudit",value="课程信息-审核",required=true)
            @RequestBody CourseAudit courseAudit){
        CourseAudit courseAudit1 = new CourseAudit();
        try {
            courseAudit1 = courseAuditService.update(courseAudit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseAudit1;
    }

    @ApiOperation(value = "多条件查询课程信息-审核", notes = "多条件查询课程信息-审核")
    @RequestMapping(value="/queryAllCourseAuditConditions",method=RequestMethod.POST)
    public Object queryAllCourseAuditConditions(
            @ApiParam(name="courseAudit",value="课程信息-审核",required=true)
            @RequestBody CourseAudit courseAudit){
        List<CourseAudit> courseArrayList = new ArrayList<>();
        try {
            courseArrayList = courseAuditService.queryAll(courseAudit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseArrayList);
        return jsonString;
    }

    @ApiOperation(value = "分页查询全部分类列表",notes = "分页查询全部分类列表")
    @RequestMapping(value = "/selCourseCategoryAllOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selCourseCategoryAllOL(@RequestParam int offset, @RequestParam int limit){
        List<CourseCategory> courseCategoryList = new ArrayList<>();
        try {
            courseCategoryList = courseCategoryService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseCategoryList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询分类列表信息", notes = "多条件查询分类列表信息")
    @RequestMapping(value="/queryAllCourseCategoryConditions",method=RequestMethod.POST)
    public Object queryAllCourseCategoryConditions(
            @ApiParam(name="courseCategory",value="分类列表信息",required=true)
            @RequestBody CourseCategory courseCategory){
        List<CourseCategory> courseCategoryList = new ArrayList<>();
        try {
            courseCategoryList = courseCategoryService.queryAll(courseCategory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(courseCategoryList);
        return jsonString;
    }

    @ApiOperation(value = "修改分类列表信息与状态", notes = "修改分类列表信息与状态")
    @RequestMapping(value="/modifyCourseCategory",method=RequestMethod.POST)
    public Object modifyCourseCategory(
            @ApiParam(name="courseCategory",value="分类列表信息",required=true)
            @RequestBody CourseCategory courseCategory){
        CourseCategory courseCategory1 = new CourseCategory();
        try {
            courseCategory1 = courseCategoryService.update(courseCategory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseCategory1;
    }

    @ApiOperation(value = "新增分类列表信息", notes = "新增分类列表信息")
    @RequestMapping(value="/insertCourseCategory",method=RequestMethod.POST)
    public Object insertCourseCategory(
            @ApiParam(name="courseCategory",value="分类列表信息",required=true)
            @RequestBody CourseCategory courseCategory){
        CourseCategory courseCategory1 = new CourseCategory();
        try {
            courseCategory1 = courseCategoryService.insert(courseCategory);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseCategory1;
    }

}
