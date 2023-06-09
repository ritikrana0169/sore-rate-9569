package com.tender.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
    private String vendorCompanyName;
    private String contactMailId;
    private String CompanyCeoName;
    private String userName;
    private String userPasword;
    private int totalTenderTakeOver;
    private int experienceInYears;

    @ManyToMany(mappedBy = "bidByList", cascade = CascadeType.ALL)
    private List<Tender> bidForList;
    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<Tender> tenderList;



public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}



public String getContactMailId() {
	return contactMailId;
}



public void setContactMailId(String contactMailId) {
	this.contactMailId = contactMailId;
}


public String getCompanyCeoName() {
	return CompanyCeoName;
}




public void setCompanyCeoName(String companyCeoName) {
	CompanyCeoName = companyCeoName;
}


@Override
public String toString() {
	String str="|⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃【V】【E】【N】【D】【O】【R】 【D】【E】【T】【A】【I】【L】【S】⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃|\n|\n|     VENDOR ID ➤ " + vendorId + ", COMPANY NAME ➤ "
+ vendorCompanyName + ", CONTACT MAIL ➤ "
			+ contactMailId + ",\n|     CEO NAME ➤ " + CompanyCeoName + ", USER NAME ➤ " + userName + ", TOTAL TENDERS TAKEOVER ➤ "
			+ totalTenderTakeOver + ",\n|     EXPERIENCE ➤ " + experienceInYears + ",\n|\n|    ⚝⚝ ＡＳＳＩＧＮＥＤ ＴＥＮＤＥＲ ＬＩＳＴ ⚝⚝\n|\n";
for(int i=0;i<tenderList.size();i++) {
	str=str+"|     TENDER ID ➤ "+tenderList.get(i).getTenderId()+"\n|     TENDER NAME ➤ "+
tenderList.get(i).getTenderName()+"\n|     TENDER TAKEOVER PRICE ➤ "+tenderList.get(i).getTakeOverBid()+"\n"
		     + "|⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃|";
}
	
	return str;
}

public String toStringVendor() {
	String str="|⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃【V】【E】【N】【D】【O】【R】 【D】【E】【T】【A】【I】【L】【S】⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃|\n|\n|     VENDOR ID ➤ " + vendorId + ", COMPANY NAME ➤ "
+ vendorCompanyName + ", CONTACT MAIL ➤ "
			+ contactMailId + ",\n|     CEO NAME ➤ " + CompanyCeoName + ", USER NAME ➤ " + userName + ", TOTAL TENDERS TAKEOVER ➤ "
			+ totalTenderTakeOver + ",\n|     EXPERIENCE ➤ " + experienceInYears + "\n"
		    + "|⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃|";
	
	return str;
}




public int getVendorId() {
	return vendorId;
}





public Vendor(String vendorCompanyName, String contactMailId, String companyCeoName, String userName,
		String userPasword, int totalTenderTakeOver, int experienceInYears) {
	super();
	this.vendorCompanyName = vendorCompanyName;
	this.contactMailId = contactMailId;
	CompanyCeoName = companyCeoName;
	this.userName = userName;
	this.userPasword = userPasword;
	this.totalTenderTakeOver = totalTenderTakeOver;
	this.experienceInYears = experienceInYears;
}












public void setVendorId(int vendorId) {
	this.vendorId = vendorId;
}



public String getVendorCompanyName() {
	return vendorCompanyName;
}



public void setVendorCompanyName(String vendorCompanyName) {
	this.vendorCompanyName = vendorCompanyName;
}



public String getUserName() {
	return userName;
}



public void setUserName(String userName) {
	this.userName = userName;
}



public String getUserPasword() {
	return userPasword;
}



public void setUserPasword(String userPasword) {
	this.userPasword = userPasword;
}



public int getTotalTenderTakeOver() {
	return totalTenderTakeOver;
}



public void setTotalTenderTakeOver(int totalTenderTakeOver) {
	this.totalTenderTakeOver = totalTenderTakeOver;
}



public int getExperienceInYears() {
	return experienceInYears;
}



public void setExperienceInYears(int experienceInYears) {
	this.experienceInYears = experienceInYears;
}



public List<Tender> getBidForList() {
	return bidForList;
}



public void setBidForList(List<Tender> bidForList) {
	this.bidForList = bidForList;
}



public List<Tender> getTenderList() {
	return tenderList;
}



public void setTenderList(List<Tender> tenderList) {
	this.tenderList = tenderList;
}


}
