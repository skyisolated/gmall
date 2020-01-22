package com.sky.gmall.user.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UmsMemberLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增长
    private String id;
    private String name;
    private String growth_point;
    private String default_status;
    private String free_freight_point;
    private String comment_growth_point;
    private String priviledge_free_freight;
    private String priviledge_sign_in;
    private String priviledge_comment;
    private String priviledge_promotion;
    private String priviledge_member_price;
    private String priviledge_birthday;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrowth_point() {
        return growth_point;
    }

    public void setGrowth_point(String growth_point) {
        this.growth_point = growth_point;
    }

    public String getDefault_status() {
        return default_status;
    }

    public void setDefault_status(String default_status) {
        this.default_status = default_status;
    }

    public String getFree_freight_point() {
        return free_freight_point;
    }

    public void setFree_freight_point(String free_freight_point) {
        this.free_freight_point = free_freight_point;
    }

    public String getComment_growth_point() {
        return comment_growth_point;
    }

    public void setComment_growth_point(String comment_growth_point) {
        this.comment_growth_point = comment_growth_point;
    }

    public String getPriviledge_free_freight() {
        return priviledge_free_freight;
    }

    public void setPriviledge_free_freight(String priviledge_free_freight) {
        this.priviledge_free_freight = priviledge_free_freight;
    }

    public String getPriviledge_sign_in() {
        return priviledge_sign_in;
    }

    public void setPriviledge_sign_in(String priviledge_sign_in) {
        this.priviledge_sign_in = priviledge_sign_in;
    }

    public String getPriviledge_comment() {
        return priviledge_comment;
    }

    public void setPriviledge_comment(String priviledge_comment) {
        this.priviledge_comment = priviledge_comment;
    }

    public String getPriviledge_promotion() {
        return priviledge_promotion;
    }

    public void setPriviledge_promotion(String priviledge_promotion) {
        this.priviledge_promotion = priviledge_promotion;
    }

    public String getPriviledge_member_price() {
        return priviledge_member_price;
    }

    public void setPriviledge_member_price(String priviledge_member_price) {
        this.priviledge_member_price = priviledge_member_price;
    }

    public String getPriviledge_birthday() {
        return priviledge_birthday;
    }

    public void setPriviledge_birthday(String priviledge_birthday) {
        this.priviledge_birthday = priviledge_birthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
