package cn.true123.hg.domain.category;

import cn.true123.hg.domain.BaseEntity;

import java.io.Serializable;


public class Category extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -2366503124545573253L;


    /**
     * 类别ID
     */
    private int categoryId;

    /**
     * 类别名称
     */
    private String categoryName;


    /**
     * get类别ID
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * set类别ID
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    /**
     * get类别名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * set类别名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}