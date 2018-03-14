package com.jy.dingding.wangba.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "wechat_token")
public class WechatTokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * appid
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * accesstoken
     */
    @Column(name = "access_token")
    private String accessToken;

    /**
     * 过期时间
     */
    @Column(name = "expires_in")
    private Integer expiresIn;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取appid
     *
     * @return app_id - appid
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appid
     *
     * @param appId appid
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 获取accesstoken
     *
     * @return access_token - accesstoken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置accesstoken
     *
     * @param accessToken accesstoken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取过期时间
     *
     * @return expires_in - 过期时间
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 设置过期时间
     *
     * @param expiresIn 过期时间
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}