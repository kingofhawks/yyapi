package cn.yycoin.entity;

import java.util.Date;

public class THgPriceconfig {
    private Integer id;

    private String category;    //品类

    private Integer year;       //年份

    private String standard;    //规格

    private String condition1;   //实物品相

    private String packaged;    //包装品相

    private String certificate; //证书品相

    private String price;       //价格

    private Date createtime;    //时间

    private String creater;     //创建人


    public THgPriceconfig(Integer id, String category, Integer year, String standard, String condition, String packaged, String certificate, String price, Date createtime, String creater) {
        this.id = id;
        this.category = category;
        this.year = year;
        this.standard = standard;
        this.condition1 = condition;
        this.packaged = packaged;
        this.certificate = certificate;
        this.price = price;
        this.createtime = createtime;
        this.creater = creater;
    }

    public THgPriceconfig() {

    }

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

    public String getCondition1() {
        return condition1;
    }

    public void setCondition1(String condition1) {
        this.condition1 = condition1;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    @Override
    public String toString() {
        return "THgPriceconfig{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", year=" + year +
                ", standard='" + standard + '\'' +
                ", condition1='" + condition1 + '\'' +
                ", packaged='" + packaged + '\'' +
                ", certificate='" + certificate + '\'' +
                ", price='" + price + '\'' +
                ", createtime=" + createtime +
                ", creater='" + creater + '\'' +
                '}';
    }
}