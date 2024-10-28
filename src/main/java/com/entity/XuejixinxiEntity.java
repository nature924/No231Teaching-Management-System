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
 * 学籍信息
 *
 * @author 
 * @email
 */
@TableName("xuejixinxi")
public class XuejixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuejixinxiEntity() {

	}

	public XuejixinxiEntity(T t) {
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
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 学年
     */
    @ColumnInfo(comment="学年",type="varchar(200)")
    @TableField(value = "xuejixinxi_xuenian")

    private String xuejixinxiXuenian;


    /**
     * 学期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="学期",type="timestamp")
    @TableField(value = "xuejixinxi_xueqi")

    private Date xuejixinxiXueqi;


    /**
     * 年级
     */
    @ColumnInfo(comment="年级",type="varchar(200)")
    @TableField(value = "xuejixinxi_dizhi")

    private String xuejixinxiDizhi;


    /**
     * 学院
     */
    @ColumnInfo(comment="学院",type="varchar(200)")
    @TableField(value = "xuejixinxi_xueyuan")

    private String xuejixinxiXueyuan;


    /**
     * 专业
     */
    @ColumnInfo(comment="专业",type="varchar(200)")
    @TableField(value = "xuejixinxi_zhuanye")

    private String xuejixinxiZhuanye;


    /**
     * 学制
     */
    @ColumnInfo(comment="学制",type="varchar(200)")
    @TableField(value = "xuejixinxi_xuezhi")

    private String xuejixinxiXuezhi;


    /**
     * 班级
     */
    @ColumnInfo(comment="班级",type="varchar(200)")
    @TableField(value = "xuejixinxi_banji")

    private String xuejixinxiBanji;


    /**
     * 学历层次
     */
    @ColumnInfo(comment="学历层次",type="varchar(200)")
    @TableField(value = "xuejixinxi_xueli")

    private String xuejixinxiXueli;


    /**
     * 学籍状态
     */
    @ColumnInfo(comment="学籍状态",type="int(11)")
    @TableField(value = "zhuang_types")

    private Integer zhuangTypes;


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
	 * 获取：学年
	 */
    public String getXuejixinxiXuenian() {
        return xuejixinxiXuenian;
    }
    /**
	 * 设置：学年
	 */

    public void setXuejixinxiXuenian(String xuejixinxiXuenian) {
        this.xuejixinxiXuenian = xuejixinxiXuenian;
    }
    /**
	 * 获取：学期
	 */
    public Date getXuejixinxiXueqi() {
        return xuejixinxiXueqi;
    }
    /**
	 * 设置：学期
	 */

    public void setXuejixinxiXueqi(Date xuejixinxiXueqi) {
        this.xuejixinxiXueqi = xuejixinxiXueqi;
    }
    /**
	 * 获取：年级
	 */
    public String getXuejixinxiDizhi() {
        return xuejixinxiDizhi;
    }
    /**
	 * 设置：年级
	 */

    public void setXuejixinxiDizhi(String xuejixinxiDizhi) {
        this.xuejixinxiDizhi = xuejixinxiDizhi;
    }
    /**
	 * 获取：学院
	 */
    public String getXuejixinxiXueyuan() {
        return xuejixinxiXueyuan;
    }
    /**
	 * 设置：学院
	 */

    public void setXuejixinxiXueyuan(String xuejixinxiXueyuan) {
        this.xuejixinxiXueyuan = xuejixinxiXueyuan;
    }
    /**
	 * 获取：专业
	 */
    public String getXuejixinxiZhuanye() {
        return xuejixinxiZhuanye;
    }
    /**
	 * 设置：专业
	 */

    public void setXuejixinxiZhuanye(String xuejixinxiZhuanye) {
        this.xuejixinxiZhuanye = xuejixinxiZhuanye;
    }
    /**
	 * 获取：学制
	 */
    public String getXuejixinxiXuezhi() {
        return xuejixinxiXuezhi;
    }
    /**
	 * 设置：学制
	 */

    public void setXuejixinxiXuezhi(String xuejixinxiXuezhi) {
        this.xuejixinxiXuezhi = xuejixinxiXuezhi;
    }
    /**
	 * 获取：班级
	 */
    public String getXuejixinxiBanji() {
        return xuejixinxiBanji;
    }
    /**
	 * 设置：班级
	 */

    public void setXuejixinxiBanji(String xuejixinxiBanji) {
        this.xuejixinxiBanji = xuejixinxiBanji;
    }
    /**
	 * 获取：学历层次
	 */
    public String getXuejixinxiXueli() {
        return xuejixinxiXueli;
    }
    /**
	 * 设置：学历层次
	 */

    public void setXuejixinxiXueli(String xuejixinxiXueli) {
        this.xuejixinxiXueli = xuejixinxiXueli;
    }
    /**
	 * 获取：学籍状态
	 */
    public Integer getZhuangTypes() {
        return zhuangTypes;
    }
    /**
	 * 设置：学籍状态
	 */

    public void setZhuangTypes(Integer zhuangTypes) {
        this.zhuangTypes = zhuangTypes;
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
        return "Xuejixinxi{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xuejixinxiXuenian=" + xuejixinxiXuenian +
            ", xuejixinxiXueqi=" + DateUtil.convertString(xuejixinxiXueqi,"yyyy-MM-dd") +
            ", xuejixinxiDizhi=" + xuejixinxiDizhi +
            ", xuejixinxiXueyuan=" + xuejixinxiXueyuan +
            ", xuejixinxiZhuanye=" + xuejixinxiZhuanye +
            ", xuejixinxiXuezhi=" + xuejixinxiXuezhi +
            ", xuejixinxiBanji=" + xuejixinxiBanji +
            ", xuejixinxiXueli=" + xuejixinxiXueli +
            ", zhuangTypes=" + zhuangTypes +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
