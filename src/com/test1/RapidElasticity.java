package com.test1;

public class RapidElasticity {
	private long regionCode;
	private Integer dataCentre;
	private String capabilities;
	private String elasticallyProvisioned;
	private String elasticallyReleased;
	private String autoScalWithDemand;
	private String networkingProvisions;
	private String rapidElasticMode;
	private String latencyAvoidance;

	public RapidElasticity() {

	}

	public RapidElasticity(long regionCode, Integer dataCentre, String capabilities, String elasticallyProvisioned,
			String elasticallyReleased, String autoScalWithDemand, String networkingProvisions, String rapidElasticMode,
			String latencyAvoidance) {
		super();
		this.regionCode = regionCode;
		this.dataCentre = dataCentre;
		this.capabilities = capabilities;
		this.elasticallyProvisioned = elasticallyProvisioned;
		this.elasticallyReleased = elasticallyReleased;
		this.autoScalWithDemand = autoScalWithDemand;
		this.networkingProvisions = networkingProvisions;
		this.rapidElasticMode = rapidElasticMode;
		this.latencyAvoidance = latencyAvoidance;
	}

	public long getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(long regionCode) {
		this.regionCode = regionCode;
	}

	public Integer getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(Integer dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(String capabilities) {
		this.capabilities = capabilities;
	}

	public String getElasticallyProvisioned() {
		return elasticallyProvisioned;
	}

	public void setElasticallyProvisioned(String elasticallyProvisioned) {
		this.elasticallyProvisioned = elasticallyProvisioned;
	}

	public String getElasticallyReleased() {
		return elasticallyReleased;
	}

	public void setElasticallyReleased(String elasticallyReleased) {
		this.elasticallyReleased = elasticallyReleased;
	}

	public String getAutoScalWithDemand() {
		return autoScalWithDemand;
	}

	public void setAutoScalWithDemand(String autoScalWithDemand) {
		this.autoScalWithDemand = autoScalWithDemand;
	}

	public String getNetworkingProvisions() {
		return networkingProvisions;
	}

	public void setNetworkingProvisions(String networkingProvisions) {
		this.networkingProvisions = networkingProvisions;
	}

	public String getRapidElasticMode() {
		return rapidElasticMode;
	}

	public void setRapidElasticMode(String rapidElasticMode) {
		this.rapidElasticMode = rapidElasticMode;
	}

	public String getLatencyAvoidance() {
		return latencyAvoidance;
	}

	public void setLatencyAvoidance(String latencyAvoidance) {
		this.latencyAvoidance = latencyAvoidance;
	}

}
