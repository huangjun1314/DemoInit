package org.sang.config.pojo;

import java.util.Date;

//字典表
public class SysDic {
    private int id;//id
    private String  dic_code;//编码
    private String   dic_name;//名称
    private int  code_index;//值
    private String   index_name_cn;//中文名称
    private String   index_name_en;//英文名称
    private Date create_time;//创建时间

    @Override
    public String toString() {
        return "SysDic{" +
                "id=" + id +
                ", dic_code='" + dic_code + '\'' +
                ", dic_name='" + dic_name + '\'' +
                ", code_index=" + code_index +
                ", index_name_cn='" + index_name_cn + '\'' +
                ", index_name_en='" + index_name_en + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDic_code() {
        return dic_code;
    }

    public void setDic_code(String dic_code) {
        this.dic_code = dic_code;
    }

    public String getDic_name() {
        return dic_name;
    }

    public void setDic_name(String dic_name) {
        this.dic_name = dic_name;
    }

    public int getCode_index() {
        return code_index;
    }

    public void setCode_index(int code_index) {
        this.code_index = code_index;
    }

    public String getIndex_name_cn() {
        return index_name_cn;
    }

    public void setIndex_name_cn(String index_name_cn) {
        this.index_name_cn = index_name_cn;
    }

    public String getIndex_name_en() {
        return index_name_en;
    }

    public void setIndex_name_en(String index_name_en) {
        this.index_name_en = index_name_en;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
