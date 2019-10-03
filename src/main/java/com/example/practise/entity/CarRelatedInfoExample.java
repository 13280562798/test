package com.example.practise.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRelatedInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarRelatedInfoExample() {
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

        public Criteria andCheckCarNumberIsNull() {
            addCriterion("check_car_number is null");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberIsNotNull() {
            addCriterion("check_car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberEqualTo(String value) {
            addCriterion("check_car_number =", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberNotEqualTo(String value) {
            addCriterion("check_car_number <>", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberGreaterThan(String value) {
            addCriterion("check_car_number >", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("check_car_number >=", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberLessThan(String value) {
            addCriterion("check_car_number <", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberLessThanOrEqualTo(String value) {
            addCriterion("check_car_number <=", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberLike(String value) {
            addCriterion("check_car_number like", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberNotLike(String value) {
            addCriterion("check_car_number not like", value, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberIn(List<String> values) {
            addCriterion("check_car_number in", values, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberNotIn(List<String> values) {
            addCriterion("check_car_number not in", values, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberBetween(String value1, String value2) {
            addCriterion("check_car_number between", value1, value2, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCarNumberNotBetween(String value1, String value2) {
            addCriterion("check_car_number not between", value1, value2, "checkCarNumber");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNull() {
            addCriterion("car_owner is null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNotNull() {
            addCriterion("car_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerEqualTo(String value) {
            addCriterion("car_owner =", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotEqualTo(String value) {
            addCriterion("car_owner <>", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThan(String value) {
            addCriterion("car_owner >", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("car_owner >=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThan(String value) {
            addCriterion("car_owner <", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThanOrEqualTo(String value) {
            addCriterion("car_owner <=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLike(String value) {
            addCriterion("car_owner like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotLike(String value) {
            addCriterion("car_owner not like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIn(List<String> values) {
            addCriterion("car_owner in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotIn(List<String> values) {
            addCriterion("car_owner not in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerBetween(String value1, String value2) {
            addCriterion("car_owner between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotBetween(String value1, String value2) {
            addCriterion("car_owner not between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andVinNumberIsNull() {
            addCriterion("vin_number is null");
            return (Criteria) this;
        }

        public Criteria andVinNumberIsNotNull() {
            addCriterion("vin_number is not null");
            return (Criteria) this;
        }

        public Criteria andVinNumberEqualTo(String value) {
            addCriterion("vin_number =", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotEqualTo(String value) {
            addCriterion("vin_number <>", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberGreaterThan(String value) {
            addCriterion("vin_number >", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vin_number >=", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLessThan(String value) {
            addCriterion("vin_number <", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLessThanOrEqualTo(String value) {
            addCriterion("vin_number <=", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberLike(String value) {
            addCriterion("vin_number like", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotLike(String value) {
            addCriterion("vin_number not like", value, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberIn(List<String> values) {
            addCriterion("vin_number in", values, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotIn(List<String> values) {
            addCriterion("vin_number not in", values, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberBetween(String value1, String value2) {
            addCriterion("vin_number between", value1, value2, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andVinNumberNotBetween(String value1, String value2) {
            addCriterion("vin_number not between", value1, value2, "vinNumber");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrIsNull() {
            addCriterion("has_car_number_or is null");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrIsNotNull() {
            addCriterion("has_car_number_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrEqualTo(Integer value) {
            addCriterion("has_car_number_or =", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrNotEqualTo(Integer value) {
            addCriterion("has_car_number_or <>", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrGreaterThan(Integer value) {
            addCriterion("has_car_number_or >", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_car_number_or >=", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrLessThan(Integer value) {
            addCriterion("has_car_number_or <", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_car_number_or <=", value, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrIn(List<Integer> values) {
            addCriterion("has_car_number_or in", values, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrNotIn(List<Integer> values) {
            addCriterion("has_car_number_or not in", values, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrBetween(Integer value1, Integer value2) {
            addCriterion("has_car_number_or between", value1, value2, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andHasCarNumberOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_car_number_or not between", value1, value2, "hasCarNumberOr");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoIsNull() {
            addCriterion("employee_photo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoIsNotNull() {
            addCriterion("employee_photo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoEqualTo(String value) {
            addCriterion("employee_photo =", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoNotEqualTo(String value) {
            addCriterion("employee_photo <>", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoGreaterThan(String value) {
            addCriterion("employee_photo >", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_photo >=", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoLessThan(String value) {
            addCriterion("employee_photo <", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoLessThanOrEqualTo(String value) {
            addCriterion("employee_photo <=", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoLike(String value) {
            addCriterion("employee_photo like", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoNotLike(String value) {
            addCriterion("employee_photo not like", value, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoIn(List<String> values) {
            addCriterion("employee_photo in", values, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoNotIn(List<String> values) {
            addCriterion("employee_photo not in", values, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoBetween(String value1, String value2) {
            addCriterion("employee_photo between", value1, value2, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeePhotoNotBetween(String value1, String value2) {
            addCriterion("employee_photo not between", value1, value2, "employeePhoto");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("employee_number is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("employee_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("employee_number =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("employee_number <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("employee_number >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("employee_number >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("employee_number <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("employee_number <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("employee_number like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("employee_number not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("employee_number in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("employee_number not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("employee_number between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("employee_number not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrIsNull() {
            addCriterion("has_scratch_or is null");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrIsNotNull() {
            addCriterion("has_scratch_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrEqualTo(Integer value) {
            addCriterion("has_scratch_or =", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrNotEqualTo(Integer value) {
            addCriterion("has_scratch_or <>", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrGreaterThan(Integer value) {
            addCriterion("has_scratch_or >", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_scratch_or >=", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrLessThan(Integer value) {
            addCriterion("has_scratch_or <", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_scratch_or <=", value, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrIn(List<Integer> values) {
            addCriterion("has_scratch_or in", values, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrNotIn(List<Integer> values) {
            addCriterion("has_scratch_or not in", values, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrBetween(Integer value1, Integer value2) {
            addCriterion("has_scratch_or between", value1, value2, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasScratchOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_scratch_or not between", value1, value2, "hasScratchOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrIsNull() {
            addCriterion("has_glass_or is null");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrIsNotNull() {
            addCriterion("has_glass_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrEqualTo(Integer value) {
            addCriterion("has_glass_or =", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrNotEqualTo(Integer value) {
            addCriterion("has_glass_or <>", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrGreaterThan(Integer value) {
            addCriterion("has_glass_or >", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_glass_or >=", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrLessThan(Integer value) {
            addCriterion("has_glass_or <", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_glass_or <=", value, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrIn(List<Integer> values) {
            addCriterion("has_glass_or in", values, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrNotIn(List<Integer> values) {
            addCriterion("has_glass_or not in", values, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrBetween(Integer value1, Integer value2) {
            addCriterion("has_glass_or between", value1, value2, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasGlassOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_glass_or not between", value1, value2, "hasGlassOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrIsNull() {
            addCriterion("has_add_device_or is null");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrIsNotNull() {
            addCriterion("has_add_device_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrEqualTo(Integer value) {
            addCriterion("has_add_device_or =", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrNotEqualTo(Integer value) {
            addCriterion("has_add_device_or <>", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrGreaterThan(Integer value) {
            addCriterion("has_add_device_or >", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_add_device_or >=", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrLessThan(Integer value) {
            addCriterion("has_add_device_or <", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_add_device_or <=", value, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrIn(List<Integer> values) {
            addCriterion("has_add_device_or in", values, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrNotIn(List<Integer> values) {
            addCriterion("has_add_device_or not in", values, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrBetween(Integer value1, Integer value2) {
            addCriterion("has_add_device_or between", value1, value2, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasAddDeviceOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_add_device_or not between", value1, value2, "hasAddDeviceOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrIsNull() {
            addCriterion("has_not_repair_or is null");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrIsNotNull() {
            addCriterion("has_not_repair_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrEqualTo(Integer value) {
            addCriterion("has_not_repair_or =", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrNotEqualTo(Integer value) {
            addCriterion("has_not_repair_or <>", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrGreaterThan(Integer value) {
            addCriterion("has_not_repair_or >", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_not_repair_or >=", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrLessThan(Integer value) {
            addCriterion("has_not_repair_or <", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_not_repair_or <=", value, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrIn(List<Integer> values) {
            addCriterion("has_not_repair_or in", values, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrNotIn(List<Integer> values) {
            addCriterion("has_not_repair_or not in", values, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrBetween(Integer value1, Integer value2) {
            addCriterion("has_not_repair_or between", value1, value2, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasNotRepairOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_not_repair_or not between", value1, value2, "hasNotRepairOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrIsNull() {
            addCriterion("has_robbery_or is null");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrIsNotNull() {
            addCriterion("has_robbery_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrEqualTo(Integer value) {
            addCriterion("has_robbery_or =", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrNotEqualTo(Integer value) {
            addCriterion("has_robbery_or <>", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrGreaterThan(Integer value) {
            addCriterion("has_robbery_or >", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_robbery_or >=", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrLessThan(Integer value) {
            addCriterion("has_robbery_or <", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_robbery_or <=", value, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrIn(List<Integer> values) {
            addCriterion("has_robbery_or in", values, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrNotIn(List<Integer> values) {
            addCriterion("has_robbery_or not in", values, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrBetween(Integer value1, Integer value2) {
            addCriterion("has_robbery_or between", value1, value2, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasRobberyOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_robbery_or not between", value1, value2, "hasRobberyOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrIsNull() {
            addCriterion("has_fire_self_or is null");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrIsNotNull() {
            addCriterion("has_fire_self_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrEqualTo(Integer value) {
            addCriterion("has_fire_self_or =", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrNotEqualTo(Integer value) {
            addCriterion("has_fire_self_or <>", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrGreaterThan(Integer value) {
            addCriterion("has_fire_self_or >", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_fire_self_or >=", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrLessThan(Integer value) {
            addCriterion("has_fire_self_or <", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_fire_self_or <=", value, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrIn(List<Integer> values) {
            addCriterion("has_fire_self_or in", values, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrNotIn(List<Integer> values) {
            addCriterion("has_fire_self_or not in", values, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrBetween(Integer value1, Integer value2) {
            addCriterion("has_fire_self_or between", value1, value2, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasFireSelfOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_fire_self_or not between", value1, value2, "hasFireSelfOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrIsNull() {
            addCriterion("has_water_or is null");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrIsNotNull() {
            addCriterion("has_water_or is not null");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrEqualTo(Integer value) {
            addCriterion("has_water_or =", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrNotEqualTo(Integer value) {
            addCriterion("has_water_or <>", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrGreaterThan(Integer value) {
            addCriterion("has_water_or >", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_water_or >=", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrLessThan(Integer value) {
            addCriterion("has_water_or <", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrLessThanOrEqualTo(Integer value) {
            addCriterion("has_water_or <=", value, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrIn(List<Integer> values) {
            addCriterion("has_water_or in", values, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrNotIn(List<Integer> values) {
            addCriterion("has_water_or not in", values, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrBetween(Integer value1, Integer value2) {
            addCriterion("has_water_or between", value1, value2, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andHasWaterOrNotBetween(Integer value1, Integer value2) {
            addCriterion("has_water_or not between", value1, value2, "hasWaterOr");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumIsNull() {
            addCriterion("insurance_num is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumIsNotNull() {
            addCriterion("insurance_num is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumEqualTo(String value) {
            addCriterion("insurance_num =", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumNotEqualTo(String value) {
            addCriterion("insurance_num <>", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumGreaterThan(String value) {
            addCriterion("insurance_num >", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_num >=", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumLessThan(String value) {
            addCriterion("insurance_num <", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumLessThanOrEqualTo(String value) {
            addCriterion("insurance_num <=", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumLike(String value) {
            addCriterion("insurance_num like", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumNotLike(String value) {
            addCriterion("insurance_num not like", value, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumIn(List<String> values) {
            addCriterion("insurance_num in", values, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumNotIn(List<String> values) {
            addCriterion("insurance_num not in", values, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumBetween(String value1, String value2) {
            addCriterion("insurance_num between", value1, value2, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andInsuranceNumNotBetween(String value1, String value2) {
            addCriterion("insurance_num not between", value1, value2, "insuranceNum");
            return (Criteria) this;
        }

        public Criteria andUpSystemIsNull() {
            addCriterion("up_system is null");
            return (Criteria) this;
        }

        public Criteria andUpSystemIsNotNull() {
            addCriterion("up_system is not null");
            return (Criteria) this;
        }

        public Criteria andUpSystemEqualTo(String value) {
            addCriterion("up_system =", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemNotEqualTo(String value) {
            addCriterion("up_system <>", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemGreaterThan(String value) {
            addCriterion("up_system >", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemGreaterThanOrEqualTo(String value) {
            addCriterion("up_system >=", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemLessThan(String value) {
            addCriterion("up_system <", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemLessThanOrEqualTo(String value) {
            addCriterion("up_system <=", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemLike(String value) {
            addCriterion("up_system like", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemNotLike(String value) {
            addCriterion("up_system not like", value, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemIn(List<String> values) {
            addCriterion("up_system in", values, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemNotIn(List<String> values) {
            addCriterion("up_system not in", values, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemBetween(String value1, String value2) {
            addCriterion("up_system between", value1, value2, "upSystem");
            return (Criteria) this;
        }

        public Criteria andUpSystemNotBetween(String value1, String value2) {
            addCriterion("up_system not between", value1, value2, "upSystem");
            return (Criteria) this;
        }

        public Criteria andText1IsNull() {
            addCriterion("text1 is null");
            return (Criteria) this;
        }

        public Criteria andText1IsNotNull() {
            addCriterion("text1 is not null");
            return (Criteria) this;
        }

        public Criteria andText1EqualTo(String value) {
            addCriterion("text1 =", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotEqualTo(String value) {
            addCriterion("text1 <>", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThan(String value) {
            addCriterion("text1 >", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThanOrEqualTo(String value) {
            addCriterion("text1 >=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThan(String value) {
            addCriterion("text1 <", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThanOrEqualTo(String value) {
            addCriterion("text1 <=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Like(String value) {
            addCriterion("text1 like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotLike(String value) {
            addCriterion("text1 not like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1In(List<String> values) {
            addCriterion("text1 in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotIn(List<String> values) {
            addCriterion("text1 not in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Between(String value1, String value2) {
            addCriterion("text1 between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotBetween(String value1, String value2) {
            addCriterion("text1 not between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText2IsNull() {
            addCriterion("text2 is null");
            return (Criteria) this;
        }

        public Criteria andText2IsNotNull() {
            addCriterion("text2 is not null");
            return (Criteria) this;
        }

        public Criteria andText2EqualTo(String value) {
            addCriterion("text2 =", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotEqualTo(String value) {
            addCriterion("text2 <>", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThan(String value) {
            addCriterion("text2 >", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThanOrEqualTo(String value) {
            addCriterion("text2 >=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThan(String value) {
            addCriterion("text2 <", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThanOrEqualTo(String value) {
            addCriterion("text2 <=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Like(String value) {
            addCriterion("text2 like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotLike(String value) {
            addCriterion("text2 not like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2In(List<String> values) {
            addCriterion("text2 in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotIn(List<String> values) {
            addCriterion("text2 not in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Between(String value1, String value2) {
            addCriterion("text2 between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotBetween(String value1, String value2) {
            addCriterion("text2 not between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText3IsNull() {
            addCriterion("text3 is null");
            return (Criteria) this;
        }

        public Criteria andText3IsNotNull() {
            addCriterion("text3 is not null");
            return (Criteria) this;
        }

        public Criteria andText3EqualTo(String value) {
            addCriterion("text3 =", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotEqualTo(String value) {
            addCriterion("text3 <>", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3GreaterThan(String value) {
            addCriterion("text3 >", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3GreaterThanOrEqualTo(String value) {
            addCriterion("text3 >=", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3LessThan(String value) {
            addCriterion("text3 <", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3LessThanOrEqualTo(String value) {
            addCriterion("text3 <=", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3Like(String value) {
            addCriterion("text3 like", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotLike(String value) {
            addCriterion("text3 not like", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3In(List<String> values) {
            addCriterion("text3 in", values, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotIn(List<String> values) {
            addCriterion("text3 not in", values, "text3");
            return (Criteria) this;
        }

        public Criteria andText3Between(String value1, String value2) {
            addCriterion("text3 between", value1, value2, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotBetween(String value1, String value2) {
            addCriterion("text3 not between", value1, value2, "text3");
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