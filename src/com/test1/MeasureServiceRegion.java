package com.test1;

public class MeasureServiceRegion {
	private String dataCentre;
	private String serviceCode;
	private String managedOption;
	private String presenceDuration;
	private Integer moduleScanIndicator;
	private Integer localCompliance;
	private String proximity;
	private String dataCenterRegion;
	private String pricing;
	private String hardwareRequirements;

	public MeasureServiceRegion() {

	}

	public MeasureServiceRegion(String dataCentre, String serviceCode, String managedOption, String presenceDuration,
			Integer moduleScanIndicator, Integer localCompliance, String proximity, String dataCenterRegion,
			String pricing, String hardwareRequirements) {
		super();
		this.dataCentre = dataCentre;
		this.serviceCode = serviceCode;
		this.managedOption = managedOption;
		this.presenceDuration = presenceDuration;
		this.moduleScanIndicator = moduleScanIndicator;
		this.localCompliance = localCompliance;
		this.proximity = proximity;
		this.dataCenterRegion = dataCenterRegion;
		this.pricing = pricing;
		this.hardwareRequirements = hardwareRequirements;
	}

	public String getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(String dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getManagedOption() {
		return managedOption;
	}

	public void setManagedOption(String managedOption) {
		this.managedOption = managedOption;
	}

	public String getPresenceDuration() {
		return presenceDuration;
	}

	public void setPresenceDuration(String presenceDuration) {
		this.presenceDuration = presenceDuration;
	}

	public Integer getModuleScanIndicator() {
		return moduleScanIndicator;
	}

	public void setModuleScanIndicator(Integer moduleScanIndicator) {
		this.moduleScanIndicator = moduleScanIndicator;
	}

	public Integer getLocalCompliance() {
		return localCompliance;
	}

	public void setLocalCompliance(Integer localCompliance) {
		this.localCompliance = localCompliance;
	}

	public String getProximity() {
		return proximity;
	}

	public void setProximity(String proximity) {
		this.proximity = proximity;
	}

	public String getDataCenterRegion() {
		return dataCenterRegion;
	}

	public void setDataCenterRegion(String dataCenterRegion) {
		this.dataCenterRegion = dataCenterRegion;
	}

	public String getPricing() {
		return pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	public String getHardwareRequirements() {
		return hardwareRequirements;
	}

	public void setHardwareRequirements(String hardwareRequirements) {
		this.hardwareRequirements = hardwareRequirements;
	}

}
