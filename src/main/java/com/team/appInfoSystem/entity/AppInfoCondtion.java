package com.team.appInfoSystem.entity;

//app查询条件
public class AppInfoCondtion {
    private String softwarename; //名称
    private Long status; //状态
    private Long flatformid;  //所属平台
    private Long categorylevel1; //类别1
    private Long categorylevel2; //类别2
    private Long categorylevel3; //类别3

    @Override
    public String toString() {
        return "AppInfoCondtion{" +
                "softwarename='" + softwarename + '\'' +
                ", status=" + status +
                ", flatformid=" + flatformid +
                ", categorylevel1=" + categorylevel1 +
                ", categorylevel2=" + categorylevel2 +
                ", categorylevel3=" + categorylevel3 +
                '}';
    }

    public String getSoftwarename() {
        return softwarename;
    }

    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getFlatformid() {
        return flatformid;
    }

    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    public Long getCategorylevel1() {
        return categorylevel1;
    }

    public void setCategorylevel1(Long categorylevel1) {
        this.categorylevel1 = categorylevel1;
    }

    public Long getCategorylevel2() {
        return categorylevel2;
    }

    public void setCategorylevel2(Long categorylevel2) {
        this.categorylevel2 = categorylevel2;
    }

    public Long getCategorylevel3() {
        return categorylevel3;
    }

    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }
}