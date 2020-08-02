package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件存储表(FileStorage)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class FileStorage implements Serializable {
    private static final long serialVersionUID = -28835362717381538L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 文件编号
    */
    private Long fileNo;
    /**
    * 文件名称
    */
    private String fileName;
    /**
    * 文件地址
    */
    private String fileUrl;
    /**
    * 文件类型(1:附件;2;图片;3:视频)
    */
    private Integer fileType;
    /**
    * 文件大小
    */
    private Long fileSize;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getFileNo() {
        return fileNo;
    }

    public void setFileNo(Long fileNo) {
        this.fileNo = fileNo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

}