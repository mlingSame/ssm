package lml.domain;

import java.io.Serializable;

public class Traveller implements Serializable {
    private Integer id;
    private String name;//姓名
    private String sex;//性别
    private  String phoneNum;//电话号码
    private Integer credentialsType;//证件类型  0 身份证 1护照 2军官证
    private String credentialsTypeStr;
    private String credentialsNum;//证件号码
    private Integer travellerType;//旅客类型 0 成人 1 儿童
    private String travellerTypeStr;

    public String getCredentialsTypeStr() {
        if (credentialsType!=null){
            if (credentialsType==0){
                credentialsTypeStr="身份证";
            }
            if (credentialsType==1){
                credentialsTypeStr="护照";
            }
            if (credentialsType==1){
                credentialsTypeStr="军官证";
            }
        }
        return credentialsTypeStr;
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }

    public String getTravellerTypeStr() {
        if (travellerType!=null){
            if (travellerType==0){
            travellerTypeStr="成人";
            }
            if (travellerType==1){
                travellerTypeStr="儿童";
            }
        }
        return travellerTypeStr;
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }
}
