package cn.yycoin.entity;

import java.util.Date;

public class THgEstimate {
    private Integer id;

    private String category;    //品类

    private Integer year;       //年份

    private String standard;    //规格

    private String condition;   //实物品相

    private String packaged;    //包装品相

    private String certificate; //证书品相

    private String amount;      //数量

    private Double price;       //价格

    private String estimateid;  //预估流程单号

    private Date createtime;    //生成时间



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public String getPackaged() {
        return packaged;
    }

    public void setPackaged(String packaged) {
        this.packaged = packaged == null ? null : packaged.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getAmount() { return amount; }

    public void setAmount(String amount) { this.amount = amount; }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(String estimateid) {
        this.estimateid = estimateid == null ? null : estimateid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}