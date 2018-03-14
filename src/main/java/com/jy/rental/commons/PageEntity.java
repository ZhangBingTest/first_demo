package com.jy.rental.commons;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用于接收传来的分页信息在程序内中传值使用
 * Created by Saber on 2016/3/24.
 */
@ApiModel(value = "分页对象", description = "用于接收传来的分页信息在程序内中传值使用")
public class PageEntity {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页", dataType = "Integer", notes = "默认为0")
    private Integer pageNo;        //当前页
    /**
     * 每页大小 默认15条
     */
    @ApiModelProperty(value = "每页大小", dataType = "Integer", notes = "默认15")
    private Integer pageSize;       //每页大小
    /**
     * 排序字段
     */
    @ApiModelProperty(value = "排序字段", dataType = "String", notes = "可为空")
    private String sort;            //排序字段
    /**
     * 排序方式 （asc/desc）
     */
    @ApiModelProperty(value = "排序方式", dataType = "String", notes = "（asc/desc）可为空")
    private String order;           //排序方式 （asc/desc）
    /**
     * 搜索条件
     */
    @ApiModelProperty(value = "搜索条件", dataType = "String", notes = "（本字段仅为传值使用，不代表表字段）可为空")
    private String search;          //搜索条件

    public PageEntity() {
        this.pageNo = pageNo == null ? 1 : pageNo;
        this.pageSize = pageSize == null ? 15 : pageSize;
    }

    public PageEntity(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo == null || pageNo < 0 ? 1 : pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo == null || pageNo < 0 ? 1 : pageNo;
    }

    public Integer getPageSize() {
        return pageSize == null || pageSize < 0 ? 15 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize == null || pageSize < 0 ? 15 : pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "PageEntity{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                ", search='" + search + '\'' +
                '}';
    }
}
