package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 作业
 *
 * @author 
 * @email
 */
@TableName("zuoye")
public class ZuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuoyeEntity() {

	}

	public ZuoyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 作业编号
     */
    @ColumnInfo(comment="作业编号",type="varchar(200)")
    @TableField(value = "zuoye_uuid_number")

    private String zuoyeUuidNumber;


    /**
     * 作业名称
     */
    @ColumnInfo(comment="作业名称",type="varchar(200)")
    @TableField(value = "zuoye_name")

    private String zuoyeName;


    /**
     * 作业文件
     */
    @ColumnInfo(comment="作业文件",type="varchar(200)")
    @TableField(value = "zuoye_file")

    private String zuoyeFile;


    /**
     * 作业类型
     */
    @ColumnInfo(comment="作业类型",type="int(11)")
    @TableField(value = "zuoye_types")

    private Integer zuoyeTypes;


    /**
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 作业详情
     */
    @ColumnInfo(comment="作业详情",type="longtext")
    @TableField(value = "zuoye_content")

    private String zuoyeContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "zuoye_delete")

    private Integer zuoyeDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zuoye{" +
            ", id=" + id +
            ", zuoyeUuidNumber=" + zuoyeUuidNumber +
            ", zuoyeName=" + zuoyeName +
            ", zuoyeFile=" + zuoyeFile +
            ", zuoyeTypes=" + zuoyeTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", zuoyeContent=" + zuoyeContent +
            ", zuoyeDelete=" + zuoyeDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
