package com.randap.imgurclient.Models;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Lovleen on 25/10/16.
 */


public class GalleryModel {

    private List<ImageDetailModel> data = new ArrayList<ImageDetailModel>();
    private Boolean success;
    private Integer status;

    /**
     *
     * @return
     * The data
     */
    public List<ImageDetailModel> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<ImageDetailModel> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
