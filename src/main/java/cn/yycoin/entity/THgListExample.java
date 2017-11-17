package cn.yycoin.entity;

import java.util.ArrayList;
import java.util.List;

public class THgListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THgListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNull() {
            addCriterion("transportno is null");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNotNull() {
            addCriterion("transportno is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnoEqualTo(String value) {
            addCriterion("transportno =", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotEqualTo(String value) {
            addCriterion("transportno <>", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThan(String value) {
            addCriterion("transportno >", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThanOrEqualTo(String value) {
            addCriterion("transportno >=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThan(String value) {
            addCriterion("transportno <", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThanOrEqualTo(String value) {
            addCriterion("transportno <=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLike(String value) {
            addCriterion("transportno like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotLike(String value) {
            addCriterion("transportno not like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoIn(List<String> values) {
            addCriterion("transportno in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotIn(List<String> values) {
            addCriterion("transportno not in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoBetween(String value1, String value2) {
            addCriterion("transportno between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotBetween(String value1, String value2) {
            addCriterion("transportno not between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFromerIsNull() {
            addCriterion("fromer is null");
            return (Criteria) this;
        }

        public Criteria andFromerIsNotNull() {
            addCriterion("fromer is not null");
            return (Criteria) this;
        }

        public Criteria andFromerEqualTo(String value) {
            addCriterion("fromer =", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotEqualTo(String value) {
            addCriterion("fromer <>", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerGreaterThan(String value) {
            addCriterion("fromer >", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerGreaterThanOrEqualTo(String value) {
            addCriterion("fromer >=", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLessThan(String value) {
            addCriterion("fromer <", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLessThanOrEqualTo(String value) {
            addCriterion("fromer <=", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerLike(String value) {
            addCriterion("fromer like", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotLike(String value) {
            addCriterion("fromer not like", value, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerIn(List<String> values) {
            addCriterion("fromer in", values, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotIn(List<String> values) {
            addCriterion("fromer not in", values, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerBetween(String value1, String value2) {
            addCriterion("fromer between", value1, value2, "fromer");
            return (Criteria) this;
        }

        public Criteria andFromerNotBetween(String value1, String value2) {
            addCriterion("fromer not between", value1, value2, "fromer");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNull() {
            addCriterion("discription is null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNotNull() {
            addCriterion("discription is not null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionEqualTo(String value) {
            addCriterion("discription =", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotEqualTo(String value) {
            addCriterion("discription <>", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThan(String value) {
            addCriterion("discription >", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("discription >=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThan(String value) {
            addCriterion("discription <", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("discription <=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLike(String value) {
            addCriterion("discription like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotLike(String value) {
            addCriterion("discription not like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIn(List<String> values) {
            addCriterion("discription in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotIn(List<String> values) {
            addCriterion("discription not in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionBetween(String value1, String value2) {
            addCriterion("discription between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotBetween(String value1, String value2) {
            addCriterion("discription not between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNull() {
            addCriterion("estimateid is null");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNotNull() {
            addCriterion("estimateid is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateidEqualTo(Integer value) {
            addCriterion("estimateid =", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotEqualTo(Integer value) {
            addCriterion("estimateid <>", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThan(Integer value) {
            addCriterion("estimateid >", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("estimateid >=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThan(Integer value) {
            addCriterion("estimateid <", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThanOrEqualTo(Integer value) {
            addCriterion("estimateid <=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidIn(List<Integer> values) {
            addCriterion("estimateid in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotIn(List<Integer> values) {
            addCriterion("estimateid not in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidBetween(Integer value1, Integer value2) {
            addCriterion("estimateid between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotBetween(Integer value1, Integer value2) {
            addCriterion("estimateid not between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andProductdisIsNull() {
            addCriterion("productdis is null");
            return (Criteria) this;
        }

        public Criteria andProductdisIsNotNull() {
            addCriterion("productdis is not null");
            return (Criteria) this;
        }

        public Criteria andProductdisEqualTo(String value) {
            addCriterion("productdis =", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotEqualTo(String value) {
            addCriterion("productdis <>", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisGreaterThan(String value) {
            addCriterion("productdis >", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisGreaterThanOrEqualTo(String value) {
            addCriterion("productdis >=", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLessThan(String value) {
            addCriterion("productdis <", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLessThanOrEqualTo(String value) {
            addCriterion("productdis <=", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisLike(String value) {
            addCriterion("productdis like", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotLike(String value) {
            addCriterion("productdis not like", value, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisIn(List<String> values) {
            addCriterion("productdis in", values, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotIn(List<String> values) {
            addCriterion("productdis not in", values, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisBetween(String value1, String value2) {
            addCriterion("productdis between", value1, value2, "productdis");
            return (Criteria) this;
        }

        public Criteria andProductdisNotBetween(String value1, String value2) {
            addCriterion("productdis not between", value1, value2, "productdis");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}