package cn.true123.hg.dto.item;



import cn.true123.hg.dto.EntityDto;

import java.io.Serializable;


public class ItemDetailDto extends EntityDto implements Serializable {


    private static final long serialVersionUID = -3239033250538818428L;
    /**
     * id
     */
    private long id;

    /**
     * item_id
     */
    private long itemId;

    /**
     * 内容详情
     */
    private String contentDetail;


    /**
     * getitem_id
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * setitem_id
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
    /**
     * get内容详情
     */
    public String getContentDetail() {
        return contentDetail;
    }

    /**
     * set内容详情
     */
    public void setContentDetail(String contentDetail) {
        this.contentDetail = contentDetail;
    }
}