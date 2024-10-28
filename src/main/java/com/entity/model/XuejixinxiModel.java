package com.entity.model;

import com.entity.XuejixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学籍信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuejixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 学年
     */
    private String xuejixinxiXuenian;


    /**
     * 学期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xuejixinxiXueqi;


    /**
     * 年级
     */
    private String xuejixinxiDizhi;


    /**
     * 学院
     */
    private String xuejixinxiXueyuan;


    /**
     * 专业
     */
    private String xuejixinxiZhuanye;


    /**
     * 学制
     */
    private String xuejixinxiXuezhi;


    /**
     * 班级
     */
    private String xuejixinxiBanji;


    /**
     * 学历层次
     */
    private String xuejixinxiXueli;


    /**
     * 学籍状态
     */
    private Integer zhuangTypes;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
