package com.example.demo.pojo;

import java.util.Date;

public class Permission {
    private String id;
    private String code; //权限编码
    private String title; //权限名称
    private String type;//类型，page：功能模块，file:代码，data：数据create_operator
    private int seq;//权限在当前模块下的顺序，由小到大
    private int status; // 状态，1：可用，0：冻结
    private Date createTime;
    private Date operate_time;
    private String  operator; // 操作者
    private String  create_operator; // 操作者
    private String remark; //备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(Date operate_time) {
        this.operate_time = operate_time;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCreate_operator() {
        return create_operator;
    }

    public void setCreate_operator(String create_operator) {
        this.create_operator = create_operator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
