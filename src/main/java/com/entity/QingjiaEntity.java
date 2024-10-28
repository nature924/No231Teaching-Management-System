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
 * 学生请假
 *
 * @author 
 * @email
 */
@TableName("qingjia")
public class QingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiaEntity() {

	}

	public QingjiaEntity(T t) {
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
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(200)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 请假标题
     */
    @ColumnInfo(comment="请假标题",type="varchar(200)")
    @TableField(value = "qingjia_name")

    private String qingjiaName;


    /**
     * 请假缘由
     */
    @ColumnInfo(comment="请假缘由",type="longtext")
    @TableField(value = "qingjia_text")

    private String qingjiaText;


    /**
     * 请假类型
     */
    @ColumnInfo(comment="请假类型",type="int(11)")
    @TableField(value = "qingjia_types")

    private Integer qingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="请假时间",type="timestamp")
    @TableField(value = "qingjia_time")

    private Date qingjiaTime;


    /**
     * 请假天数
     */
    @ColumnInfo(comment="请假天数",type="int(200)")
    @TableField(value = "qingjia_number")

    private Integer qingjiaNumber;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "qingjia_yesno_types")

    private Integer qingjiaYesnoTypes;


    /**
     * 处理意见
     */
    @ColumnInfo(comment="处理意见",type="longtext")
    @TableField(value = "qingjia_yesno_text")

    private String qingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "qingjia_shenhe_time")

    private Date qingjiaShenheTime;


    /**
     * 创建时间  listShow
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
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：请假标题
	 */
    public String getQingjiaName() {
        return qingjiaName;
    }
    /**
	 * 设置：请假标题
	 */

    public void setQingjiaName(String qingjiaName) {
        this.qingjiaName = qingjiaName;
    }
    /**
	 * 获取：请假缘由
	 */
    public String getQingjiaText() {
        return qingjiaText;
    }
    /**
	 * 设置：请假缘由
	 */

    public void setQingjiaText(String qingjiaText) {
        this.qingjiaText = qingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }
    /**
	 * 设置：请假类型
	 */

    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getQingjiaTime() {
        return qingjiaTime;
    }
    /**
	 * 设置：请假时间
	 */

    public void setQingjiaTime(Date qingjiaTime) {
        this.qingjiaTime = qingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getQingjiaNumber() {
        return qingjiaNumber;
    }
    /**
	 * 设置：请假天数
	 */

    public void setQingjiaNumber(Integer qingjiaNumber) {
        this.qingjiaNumber = qingjiaNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }
    /**
	 * 设置：处理意见
	 */

    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getQingjiaShenheTime() {
        return qingjiaShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setQingjiaShenheTime(Date qingjiaShenheTime) {
        this.qingjiaShenheTime = qingjiaShenheTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qingjia{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", qingjiaName=" + qingjiaName +
            ", qingjiaText=" + qingjiaText +
            ", qingjiaTypes=" + qingjiaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", qingjiaTime=" + DateUtil.convertString(qingjiaTime,"yyyy-MM-dd") +
            ", qingjiaNumber=" + qingjiaNumber +
            ", qingjiaYesnoTypes=" + qingjiaYesnoTypes +
            ", qingjiaYesnoText=" + qingjiaYesnoText +
            ", qingjiaShenheTime=" + DateUtil.convertString(qingjiaShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
