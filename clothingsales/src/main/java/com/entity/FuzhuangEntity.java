package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 服装
 *
 */
@TableName("fuzhuang")
public class FuzhuangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuzhuangEntity() {

	}

	public FuzhuangEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 服装名称
     */
    @TableField(value = "fuzhuang_name")

    private String fuzhuangName;


    /**
     * 服装照片
     */
    @TableField(value = "fuzhuang_photo")

    private String fuzhuangPhoto;


    /**
     * 服装类型
     */
    @TableField(value = "fuzhuang_types")

    private Integer fuzhuangTypes;


    /**
     * 服装库存
     */
    @TableField(value = "fuzhuang_kucun_number")

    private Integer fuzhuangKucunNumber;


    /**
     * 购买获得积分
     */
    @TableField(value = "fuzhuang_price")

    private Integer fuzhuangPrice;


    /**
     * 服装原价
     */
    @TableField(value = "fuzhuang_old_money")

    private Double fuzhuangOldMoney;


    /**
     * 现价/积分
     */
    @TableField(value = "fuzhuang_new_money")

    private Double fuzhuangNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "fuzhuang_clicknum")

    private Integer fuzhuangClicknum;


    /**
     * 服装简介
     */
    @TableField(value = "fuzhuang_content")

    private String fuzhuangContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "fuzhuang_delete")

    private Integer fuzhuangDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：服装名称
	 */
    public String getFuzhuangName() {
        return fuzhuangName;
    }


    /**
	 * 获取：服装名称
	 */

    public void setFuzhuangName(String fuzhuangName) {
        this.fuzhuangName = fuzhuangName;
    }
    /**
	 * 设置：服装照片
	 */
    public String getFuzhuangPhoto() {
        return fuzhuangPhoto;
    }


    /**
	 * 获取：服装照片
	 */

    public void setFuzhuangPhoto(String fuzhuangPhoto) {
        this.fuzhuangPhoto = fuzhuangPhoto;
    }
    /**
	 * 设置：服装类型
	 */
    public Integer getFuzhuangTypes() {
        return fuzhuangTypes;
    }


    /**
	 * 获取：服装类型
	 */

    public void setFuzhuangTypes(Integer fuzhuangTypes) {
        this.fuzhuangTypes = fuzhuangTypes;
    }
    /**
	 * 设置：服装库存
	 */
    public Integer getFuzhuangKucunNumber() {
        return fuzhuangKucunNumber;
    }


    /**
	 * 获取：服装库存
	 */

    public void setFuzhuangKucunNumber(Integer fuzhuangKucunNumber) {
        this.fuzhuangKucunNumber = fuzhuangKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getFuzhuangPrice() {
        return fuzhuangPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setFuzhuangPrice(Integer fuzhuangPrice) {
        this.fuzhuangPrice = fuzhuangPrice;
    }
    /**
	 * 设置：服装原价
	 */
    public Double getFuzhuangOldMoney() {
        return fuzhuangOldMoney;
    }


    /**
	 * 获取：服装原价
	 */

    public void setFuzhuangOldMoney(Double fuzhuangOldMoney) {
        this.fuzhuangOldMoney = fuzhuangOldMoney;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getFuzhuangNewMoney() {
        return fuzhuangNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setFuzhuangNewMoney(Double fuzhuangNewMoney) {
        this.fuzhuangNewMoney = fuzhuangNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getFuzhuangClicknum() {
        return fuzhuangClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setFuzhuangClicknum(Integer fuzhuangClicknum) {
        this.fuzhuangClicknum = fuzhuangClicknum;
    }
    /**
	 * 设置：服装简介
	 */
    public String getFuzhuangContent() {
        return fuzhuangContent;
    }


    /**
	 * 获取：服装简介
	 */

    public void setFuzhuangContent(String fuzhuangContent) {
        this.fuzhuangContent = fuzhuangContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFuzhuangDelete() {
        return fuzhuangDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setFuzhuangDelete(Integer fuzhuangDelete) {
        this.fuzhuangDelete = fuzhuangDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fuzhuang{" +
            "id=" + id +
            ", fuzhuangName=" + fuzhuangName +
            ", fuzhuangPhoto=" + fuzhuangPhoto +
            ", fuzhuangTypes=" + fuzhuangTypes +
            ", fuzhuangKucunNumber=" + fuzhuangKucunNumber +
            ", fuzhuangPrice=" + fuzhuangPrice +
            ", fuzhuangOldMoney=" + fuzhuangOldMoney +
            ", fuzhuangNewMoney=" + fuzhuangNewMoney +
            ", fuzhuangClicknum=" + fuzhuangClicknum +
            ", fuzhuangContent=" + fuzhuangContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", fuzhuangDelete=" + fuzhuangDelete +
            ", createTime=" + createTime +
        "}";
    }
}
