package com.etc.class0905.entity;

import javax.persistence.*;

/**
 * ProductList goods item
 */
@Entity
@Table(name = "t_product")
public class MyProduct {

    @Id
    @Column(name = "p_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "p_name")
    private String name;

    @Column(name = "p_price")
    private Double price;

    @Column(name = "p_iconUrl")
    private String iconUrl;

    @Column(name = "p_commentCount")
    private Integer commentCount;

    @Column(name = "p_falconRate")
    private Integer falconRate;

    @Column(name = "p_productCount")
    private Integer productCount;

    @Column(name = "p_iconId")
    private Integer iconId;

    public MyProduct() {
        super();
    }

    public MyProduct(String name, double price, int commentCount) {
        this.name = name;
        this.price = price;
        this.commentCount = commentCount;
    }
    public MyProduct(String name, double price, int commentCount, int iconId) {
        this.name = name;
        this.price = price;
        this.commentCount = commentCount;
        this.iconId = iconId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getFalconRate() {
        return falconRate;
    }

    public void setFalconRate(Integer falconRate) {
        this.falconRate = falconRate;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

}