package com.entity.model;

import com.entity.ZuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuoyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业编号
     */
    private String zuoyeUuidNumber;


    /**
     * 作业名称
     */
    private String zuoyeName;


    /**
     * 作业文件
     */
    private String zuoyeFile;


    /**
     * 作业类型
     */
    private Integer zuoyeTypes;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 作业详情
     */
    private String zuoyeContent;


    /**
     * 逻辑删除
     */
    private Integer zuoyeDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：作业编号
	 */
    public String getZuoyeUuidNumber() {
        return zuoyeUuidNumber;
    }


    /**
	 * 设置：作业编号
	 */
    public void setZuoyeUuidNumber(String zuoyeUuidNumber) {
        this.zuoyeUuidNumber = zuoyeUuidNumber;
    }
    /**
	 * 获取：作业名称
	 */
    public String getZuoyeName() {
        return zuoyeName;
    }


    /**
	 * 设置：作业名称
	 */
    public void setZuoyeName(String zuoyeName) {
        this.zuoyeName = zuoyeName;
    }
    /**
	 * 获取：作业文件
	 */
    public String getZuoyeFile() {
        return zuoyeFile;
    }


    /**
	 * 设置：作业文件
	 */
    public void setZuoyeFile(String zuoyeFile) {
        this.zuoyeFile = zuoyeFile;
    }
    /**
	 * 获取：作业类型
	 */
    public Integer getZuoyeTypes() {
        return zuoyeTypes;
    }


    /**
	 * 设置：作业类型
	 */
    public void setZuoyeTypes(Integer zuoyeTypes) {
        this.zuoyeTypes = zuoyeTypes;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：作业详情
	 */
    public String getZuoyeContent() {
        return zuoyeContent;
    }


    /**
	 * 设置：作业详情
	 */
    public void setZuoyeContent(String zuoyeContent) {
        this.zuoyeContent = zuoyeContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getZuoyeDelete() {
        return zuoyeDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setZuoyeDelete(Integer zuoyeDelete) {
        this.zuoyeDelete = zuoyeDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
