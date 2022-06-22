package com.team.appInfoSystem.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
    private Long id;

    private String softwarename;

    private String apkname;

    private String supportrom;

    private String interfacelanguage;

    private BigDecimal softwaresize;

    private Date updatedate;

    private Long devid;

    private String appinfo;

    private Long status;

    private Date onsaledate;

    private Date offsaledate;

    private Long flatformid;

    private Long categorylevel3;

    private Long downloads;

    private Long createdby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    private Long categorylevel1;

    private Long categorylevel2;

    private String logopicpath;

    private String logolocpath;

    private String flatfromname;

    private String l1;

    private String l2;

    private String l3;

    private String status2;

    private String versionid2;

    private Long versionid;

    private AppCategory appCategory;

    @Override
    public String toString() {
        return "AppInfo{" +
                "id=" + id +
                ", softwarename='" + softwarename + '\'' +
                ", apkname='" + apkname + '\'' +
                ", supportrom='" + supportrom + '\'' +
                ", interfacelanguage='" + interfacelanguage + '\'' +
                ", softwaresize=" + softwaresize +
                ", updatedate=" + updatedate +
                ", devid=" + devid +
                ", appinfo='" + appinfo + '\'' +
                ", status=" + status +
                ", onsaledate=" + onsaledate +
                ", offsaledate=" + offsaledate +
                ", flatformid=" + flatformid +
                ", categorylevel3=" + categorylevel3 +
                ", downloads=" + downloads +
                ", createdby=" + createdby +
                ", creationdate=" + creationdate +
                ", modifyby=" + modifyby +
                ", modifydate=" + modifydate +
                ", categorylevel1=" + categorylevel1 +
                ", categorylevel2=" + categorylevel2 +
                ", logopicpath='" + logopicpath + '\'' +
                ", logolocpath='" + logolocpath + '\'' +
                ", flatfromname='" + flatfromname + '\'' +
                ", l1='" + l1 + '\'' +
                ", l2='" + l2 + '\'' +
                ", l3='" + l3 + '\'' +
                ", status2='" + status2 + '\'' +
                ", versionid2='" + versionid2 + '\'' +
                ", versionid=" + versionid +
                ", appCategory=" + appCategory +
                '}';
    }

    public String getVersionid2() {
        return versionid2;
    }

    public void setVersionid2(String versionid2) {
        this.versionid2 = versionid2;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }
    public String getFlatfromname() {
        return flatfromname;
    }

    public void setFlatfromname(String flatfromname) {
        this.flatfromname = flatfromname;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public AppCategory getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(AppCategory appCategory) {
        this.appCategory = appCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwarename() {
        return softwarename;
    }

    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename == null ? null : softwarename.trim();
    }

    public String getApkname() {
        return apkname;
    }

    public void setApkname(String apkname) {
        this.apkname = apkname == null ? null : apkname.trim();
    }

    public String getSupportrom() {
        return supportrom;
    }

    public void setSupportrom(String supportrom) {
        this.supportrom = supportrom == null ? null : supportrom.trim();
    }

    public String getInterfacelanguage() {
        return interfacelanguage;
    }

    public void setInterfacelanguage(String interfacelanguage) {
        this.interfacelanguage = interfacelanguage == null ? null : interfacelanguage.trim();
    }

    public BigDecimal getSoftwaresize() {
        return softwaresize;
    }

    public void setSoftwaresize(BigDecimal softwaresize) {
        this.softwaresize = softwaresize;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Long getDevid() {
        return devid;
    }

    public void setDevid(Long devid) {
        this.devid = devid;
    }

    public String getAppinfo() {
        return appinfo;
    }

    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo == null ? null : appinfo.trim();
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getOnsaledate() {
        return onsaledate;
    }

    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    public Date getOffsaledate() {
        return offsaledate;
    }

    public void setOffsaledate(Date offsaledate) {
        this.offsaledate = offsaledate;
    }

    public Long getFlatformid() {
        return flatformid;
    }

    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    public Long getCategorylevel3() {
        return categorylevel3;
    }

    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
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

    public String getLogopicpath() {
        return logopicpath;
    }

    public void setLogopicpath(String logopicpath) {
        this.logopicpath = logopicpath == null ? null : logopicpath.trim();
    }

    public String getLogolocpath() {
        return logolocpath;
    }

    public void setLogolocpath(String logolocpath) {
        this.logolocpath = logolocpath == null ? null : logolocpath.trim();
    }

    public Long getVersionid() {
        return versionid;
    }

    public void setVersionid(Long versionid) {
        this.versionid = versionid;
    }
}