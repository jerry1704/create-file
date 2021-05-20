package com.gerardo.domain;


/**
 * Domain for retrieve information excel.
 */

public class AccountRetrieveExcel {
  
  private String businessName;
  private String rfc;
  private String origin;
  private String certificationType;
  private String certificationStatus;
  private String certificationDate;
  private String lastValidation;  
  private String certificationExpirateDate;
  private String legalEntity;
  private String country;
  private String sizeCompany;
  private String economicActivity;
  private String webSite;
  private String state;
  private String city;
  private String municipality;
  private String district;
  private String stretName;
  private String name;
  private String firstSurname;
  private String secondSurname;
  private String mobilePhone;
  private String email;
  private Float recursosHumanos;
  private Float scoreLegal;
  private Float scoreFiscal;
  private Float scoreEthicsIntegrity;
  private Float scoreFinancial;
  private Float scoreCommercial;
  private Float scoreQuality;
  private Float scoreHealth;
  private Float scoreEnvironment;
  private Float scoreOperation;
  private Float scoreEconomic;
  private Boolean certificateQuality;
  private Boolean certificateHealthSafety;
  private Boolean certificateEnvironmental;
  private Integer observationList;
  private Integer disabledSfp;
  
  
  
  public AccountRetrieveExcel(String businessName, String rfc, String origin, String certificationType,
      String certificationStatus, String certificationDate, String lastValidation, String certificationExpirateDate,
      String legalEntity, String country, String sizeCompany, String economicActivity, String webSite, String state,
      String city, String municipality, String district, String stretName, String name, String firstSurname,
      String secondSurname, String mobilePhone, String email, Float recursosHumanos, Float scoreLegal,
      Float scoreFiscal, Float scoreEthicsIntegrity, Float scoreFinancial, Float scoreCommercial, Float scoreQuality,
      Float scoreHealth, Float scoreEnvironment, Float scoreOperation, Float scoreEconomic, Boolean certificateQuality,
      Boolean certificateHealthSafety, Boolean certificateEnvironmental, Integer observationList, Integer disabledSfp) {
    super();
    this.businessName = businessName;
    this.rfc = rfc;
    this.origin = origin;
    this.certificationType = certificationType;
    this.certificationStatus = certificationStatus;
    this.certificationDate = certificationDate;
    this.lastValidation = lastValidation;
    this.certificationExpirateDate = certificationExpirateDate;
    this.legalEntity = legalEntity;
    this.country = country;
    this.sizeCompany = sizeCompany;
    this.economicActivity = economicActivity;
    this.webSite = webSite;
    this.state = state;
    this.city = city;
    this.municipality = municipality;
    this.district = district;
    this.stretName = stretName;
    this.name = name;
    this.firstSurname = firstSurname;
    this.secondSurname = secondSurname;
    this.mobilePhone = mobilePhone;
    this.email = email;
    this.recursosHumanos = recursosHumanos;
    this.scoreLegal = scoreLegal;
    this.scoreFiscal = scoreFiscal;
    this.scoreEthicsIntegrity = scoreEthicsIntegrity;
    this.scoreFinancial = scoreFinancial;
    this.scoreCommercial = scoreCommercial;
    this.scoreQuality = scoreQuality;
    this.scoreHealth = scoreHealth;
    this.scoreEnvironment = scoreEnvironment;
    this.scoreOperation = scoreOperation;
    this.scoreEconomic = scoreEconomic;
    this.certificateQuality = certificateQuality;
    this.certificateHealthSafety = certificateHealthSafety;
    this.certificateEnvironmental = certificateEnvironmental;
    this.observationList = observationList;
    this.disabledSfp = disabledSfp;
  }
  
  
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }
  public String getCertificationType() {
    return certificationType;
  }
  public void setCertificationType(String certificationType) {
    this.certificationType = certificationType;
  }
  public String getCertificationStatus() {
    return certificationStatus;
  }
  public void setCertificationStatus(String certificationStatus) {
    this.certificationStatus = certificationStatus;
  }
  public String getCertificationDate() {
    return certificationDate;
  }
  public void setCertificationDate(String certificationDate) {
    this.certificationDate = certificationDate;
  }
  public String getLastValidation() {
    return lastValidation;
  }
  public void setLastValidation(String lastValidation) {
    this.lastValidation = lastValidation;
  }
  public String getCertificationExpirateDate() {
    return certificationExpirateDate;
  }
  public void setCertificationExpirateDate(String certificationExpirateDate) {
    this.certificationExpirateDate = certificationExpirateDate;
  }
  public String getLegalEntity() {
    return legalEntity;
  }
  public void setLegalEntity(String legalEntity) {
    this.legalEntity = legalEntity;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public String getSizeCompany() {
    return sizeCompany;
  }
  public void setSizeCompany(String sizeCompany) {
    this.sizeCompany = sizeCompany;
  }
  public String getEconomicActivity() {
    return economicActivity;
  }
  public void setEconomicActivity(String economicActivity) {
    this.economicActivity = economicActivity;
  }
  public String getWebSite() {
    return webSite;
  }
  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getMunicipality() {
    return municipality;
  }
  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }
  public String getDistrict() {
    return district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }
  public String getStretName() {
    return stretName;
  }
  public void setStretName(String stretName) {
    this.stretName = stretName;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFirstSurname() {
    return firstSurname;
  }
  public void setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
  }
  public String getSecondSurname() {
    return secondSurname;
  }
  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }
  public String getMobilePhone() {
    return mobilePhone;
  }
  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Float getRecursosHumanos() {
    return recursosHumanos;
  }
  public void setRecursosHumanos(Float recursosHumanos) {
    this.recursosHumanos = recursosHumanos;
  }
  public Float getScoreLegal() {
    return scoreLegal;
  }
  public void setScoreLegal(Float scoreLegal) {
    this.scoreLegal = scoreLegal;
  }
  public Float getScoreFiscal() {
    return scoreFiscal;
  }
  public void setScoreFiscal(Float scoreFiscal) {
    this.scoreFiscal = scoreFiscal;
  }
  public Float getScoreEthicsIntegrity() {
    return scoreEthicsIntegrity;
  }
  public void setScoreEthicsIntegrity(Float scoreEthicsIntegrity) {
    this.scoreEthicsIntegrity = scoreEthicsIntegrity;
  }
  public Float getScoreFinancial() {
    return scoreFinancial;
  }
  public void setScoreFinancial(Float scoreFinancial) {
    this.scoreFinancial = scoreFinancial;
  }
  public Float getScoreCommercial() {
    return scoreCommercial;
  }
  public void setScoreCommercial(Float scoreCommercial) {
    this.scoreCommercial = scoreCommercial;
  }
  public Float getScoreQuality() {
    return scoreQuality;
  }
  public void setScoreQuality(Float scoreQuality) {
    this.scoreQuality = scoreQuality;
  }
  public Float getScoreHealth() {
    return scoreHealth;
  }
  public void setScoreHealth(Float scoreHealth) {
    this.scoreHealth = scoreHealth;
  }
  public Float getScoreEnvironment() {
    return scoreEnvironment;
  }
  public void setScoreEnvironment(Float scoreEnvironment) {
    this.scoreEnvironment = scoreEnvironment;
  }
  public Float getScoreOperation() {
    return scoreOperation;
  }
  public void setScoreOperation(Float scoreOperation) {
    this.scoreOperation = scoreOperation;
  }
  public Float getScoreEconomic() {
    return scoreEconomic;
  }
  public void setScoreEconomic(Float scoreEconomic) {
    this.scoreEconomic = scoreEconomic;
  }
  public Boolean getCertificateQuality() {
    return certificateQuality;
  }
  public void setCertificateQuality(Boolean certificateQuality) {
    this.certificateQuality = certificateQuality;
  }
  public Boolean getCertificateHealthSafety() {
    return certificateHealthSafety;
  }
  public void setCertificateHealthSafety(Boolean certificateHealthSafety) {
    this.certificateHealthSafety = certificateHealthSafety;
  }
  public Boolean getCertificateEnvironmental() {
    return certificateEnvironmental;
  }
  public void setCertificateEnvironmental(Boolean certificateEnvironmental) {
    this.certificateEnvironmental = certificateEnvironmental;
  }
  public Integer getObservationList() {
    return observationList;
  }
  public void setObservationList(Integer observationList) {
    this.observationList = observationList;
  }
  public Integer getDisabledSfp() {
    return disabledSfp;
  }
  public void setDisabledSfp(Integer disabledSfp) {
    this.disabledSfp = disabledSfp;
  }
  
    
}