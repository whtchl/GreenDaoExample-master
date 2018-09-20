package com.wjk.greendaoexample.datamodel;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class Country {
    @Id
    private String cid;
    private String name;
    private String code;
    @Generated(hash = 460904283)
    public Country(String cid, String name, String code) {
        this.cid = cid;
        this.name = name;
        this.code = code;
    }
    @Generated(hash = 668024697)
    public Country() {
    }
    public String getCid() {
        return this.cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
