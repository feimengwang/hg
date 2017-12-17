package cn.true123.hg.domain.item;

import cn.true123.hg.domain.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class Item extends BaseEntity implements Serializable {


    private static final long serialVersionUID = -2947240333051180392L;

    public Item() {
    }


    /**
     * title
     */
    private String title;

    /**
     * url
     */
    private String url;

    /**
     * origin_site
     */
    private String originSite;

    /**
     * content
     */
    private String content;

    /**
     * title_img_url
     */
    private String titleImgUrl;

    /**
     * category_id
     */
    private int categoryId;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * create_user
     */
    private String createUser;

    /**
     * update_user
     */
    private String updateUser;

    /**
     * update_time
     */
    private String updateTime;

    /**
     * tags
     */
    private String tags;

    /**
     * visit_times
     */
    private int visitTimes;


    /**
     * gettitle
     */
    public String getTitle() {
        return title;
    }

    /**
     * settitle
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * geturl
     */
    public String getUrl() {
        return url;
    }

    /**
     * seturl
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * getorigin_site
     */
    public String getOriginSite() {
        return originSite;
    }

    /**
     * setorigin_site
     */
    public void setOriginSite(String originSite) {
        this.originSite = originSite;
    }
    /**
     * getcontent
     */
    public String getContent() {
        return content;
    }

    /**
     * setcontent
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * gettitle_img_url
     */
    public String getTitleImgUrl() {
        return titleImgUrl;
    }

    /**
     * settitle_img_url
     */
    public void setTitleImgUrl(String titleImgUrl) {
        this.titleImgUrl = titleImgUrl;
    }
    /**
     * getcategory_id
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * setcategory_id
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    /**
     * getcreate_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * setcreate_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * getcreate_user
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * setcreate_user
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    /**
     * getupdate_user
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * setupdate_user
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    /**
     * getupdate_time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * setupdate_time
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * gettags
     */
    public String getTags() {
        return tags;
    }

    /**
     * settags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }
    /**
     * getvisit_times
     */
    public int getVisitTimes() {
        return visitTimes;
    }

    /**
     * setvisit_times
     */
    public void setVisitTimes(int visitTimes) {
        this.visitTimes = visitTimes;
    }
}