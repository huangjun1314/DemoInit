package org.sang.config.pojo.user;

import java.io.Serializable;

/**
 * 行政区域表(Region)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:38:19
 */
public class Region implements Serializable {
    private static final long serialVersionUID = 956335696742943260L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 父id
    */
    private Long parentId;
    /**
    * 级别
    */
    private Integer level;
    /**
    * 区域编码（国标）
    */
    private String provinceCode;
    /**
    * 中心经度
    */
    private Double centerLng;
    /**
    * 中心维度
    */
    private Double centerLat;
    /**
    * 省Id
    */
    private Integer provinceId;
    /**
    * 省名称
    */
    private String provinceName;
    /**
    * 市Id
    */
    private Integer cityId;
    /**
    * 城市编码
    */
    private String cityCode;
    /**
    * 市名称
    */
    private String cityName;
    /**
    * 区域名称
    */
    private String regionName;
    /**
    * 区名称
    */
    private String districtName;
    /**
    * 全路径名称
    */
    private String mergerName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Double getCenterLng() {
        return centerLng;
    }

    public void setCenterLng(Double centerLng) {
        this.centerLng = centerLng;
    }

    public Double getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

}