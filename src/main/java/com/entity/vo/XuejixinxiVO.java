package com.entity.vo;

import com.entity.XuejixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学籍信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuejixinxi")
public class XuejixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 学年
     */

    @TableField(value = "xuejixinxi_xuenian")
    private String xuejixinxiXuenian;


    /**
     * 学期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xuejixinxi_xueqi")
    private Date xuejixinxiXueqi;


    /**
     * 年级
     */

    @TableField(value = "xuejixinxi_dizhi")
    private String xuejixinxiDizhi;


    /**
     * 学院
     */

    @TableField(value = "xuejixinxi_xueyuan")
    private String xuejixinxiXueyuan;


    /**
     * 专业
     */

    @TableField(value = "xuejixinxi_zhuanye")
    private String xuejixinxiZhuanye;


    /**
     * 学制
     */

    @TableField(value = "xuejixinxi_xuezhi")
    private String xuejixinxiXuezhi;


    /**
     * 班级
     */

    @TableField(value = "xuejixinxi_banji")
    private String xuejixinxiBanji;


    /**
     * 学历层次
     */

    @TableField(value = "xuejixinxi_xueli")
    private String xuejixinxiXueli;


    /**
     * 学籍状态
     */

    @TableField(value = "zhuang_types")
    private Integer zhuangTypes;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：学年
	 */
    public String getXuejixinxiXuenian() {
        return xuejixinxiXuenian;
    }


    /**
	 * 获取：学年
	 */

    public void setXuejixinxiXuenian(String xuejixinxiXuenian) {
        this.xuejixinxiXuenian = xuejixinxiXuenian;
    }
    /**
	 * 设置：学期
	 */
    public Date getXuejixinxiXueqi() {
        return xuejixinxiXueqi;
    }


    /**
	 * 获取：学期
	 */

    public void setXuejixinxiXueqi(Date xuejixinxiXueqi) {
        this.xuejixinxiXueqi = xuejixinxiXueqi;
    }
    /**
	 * 设置：年级
	 */
    public String getXuejixinxiDizhi() {
        return xuejixinxiDizhi;
    }


    /**
	 * 获取：年级
	 */

    public void setXuejixinxiDizhi(String xuejixinxiDizhi) {
        this.xuejixinxiDizhi = xuejixinxiDizhi;
    }
    /**
	 * 设置：学院
	 */
    public String getXuejixinxiXueyuan() {
        return xuejixinxiXueyuan;
    }


    /**
	 * 获取：学院
	 */

    public void setXuejixinxiXueyuan(String xuejixinxiXueyuan) {
        this.xuejixinxiXueyuan = xuejixinxiXueyuan;
    }
    /**
	 * 设置：专业
	 */
    public String getXuejixinxiZhuanye() {
        return xuejixinxiZhuanye;
    }


    /**
	 * 获取：专业
	 */

    public void setXuejixinxiZhuanye(String xuejixinxiZhuanye) {
        this.xuejixinxiZhuanye = xuejixinxiZhuanye;
    }
    /**
	 * 设置：学制
	 */
    public String getXuejixinxiXuezhi() {
        return xuejixinxiXuezhi;
    }


    /**
	 * 获取：学制
	 */

    public void setXuejixinxiXuezhi(String xuejixinxiXuezhi) {
        this.xuejixinxiXuezhi = xuejixinxiXuezhi;
    }
    /**
	 * 设置：班级
	 */
    public String getXuejixinxiBanji() {
        return xuejixinxiBanji;
    }


    /**
	 * 获取：班级
	 */

    public void setXuejixinxiBanji(String xuejixinxiBanji) {
        this.xuejixinxiBanji = xuejixinxiBanji;
    }
    /**
	 * 设置：学历层次
	 */
    public String getXuejixinxiXueli() {
        return xuejixinxiXueli;
    }


    /**
	 * 获取：学历层次
	 */

    public void setXuejixinxiXueli(String xuejixinxiXueli) {
        this.xuejixinxiXueli = xuejixinxiXueli;
    }
    /**
	 * 设置：学籍状态
	 */
    public Integer getZhuangTypes() {
        return zhuangTypes;
    }


    /**
	 * 获取：学籍状态
	 */

    public void setZhuangTypes(Integer zhuangTypes) {
        this.zhuangTypes = zhuangTypes;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
