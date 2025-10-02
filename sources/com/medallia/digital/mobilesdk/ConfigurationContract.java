package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ConfigurationContract extends e0 {
    ConfigurationUUID configurationUUID;
    KillStatus killStatus;
    y3 localization;
    PropertyConfigurationContract propertyConfiguration;
    SDKConfigurationContract sdkConfiguration;
    l7 targetEvaluatorContract;
    TargetRuleEngineContract targetRuleEngine;

    public ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    public ConfigurationUUID getConfigurationUUID() {
        return this.configurationUUID;
    }

    public KillStatus getKillStatus() {
        return this.killStatus;
    }

    public y3 getLocalization() {
        return this.localization;
    }

    public PropertyConfigurationContract getPropertyConfiguration() {
        return this.propertyConfiguration;
    }

    public SDKConfigurationContract getSdkConfiguration() {
        return this.sdkConfiguration;
    }

    public l7 getTargetEvaluatorContract() {
        return this.targetEvaluatorContract;
    }

    public TargetRuleEngineContract getTargetRuleEngine() {
        return this.targetRuleEngine;
    }

    public String toJsonString() {
        try {
            String jsonString = "null";
            StringBuilder sb = new StringBuilder("{\"propertyConfiguration\":");
            PropertyConfigurationContract propertyConfigurationContract = this.propertyConfiguration;
            sb.append(propertyConfigurationContract == null ? "null" : propertyConfigurationContract.toJsonString());
            sb.append(",\"configurationUUID\":");
            ConfigurationUUID configurationUUID = this.configurationUUID;
            sb.append(configurationUUID == null ? "null" : configurationUUID.toJsonString());
            sb.append(",\"sdkConfiguration\":");
            SDKConfigurationContract sDKConfigurationContract = this.sdkConfiguration;
            sb.append(sDKConfigurationContract == null ? "null" : sDKConfigurationContract.toJsonString());
            sb.append(",\"targetRuleEngine\":");
            TargetRuleEngineContract targetRuleEngineContract = this.targetRuleEngine;
            sb.append(targetRuleEngineContract == null ? "null" : targetRuleEngineContract.toJsonString());
            sb.append(",\"killConfiguration\":");
            KillStatus killStatus = this.killStatus;
            sb.append(killStatus == null ? "null" : killStatus.toJsonString());
            sb.append(",\"localization\":");
            y3 y3Var = this.localization;
            sb.append(y3Var == null ? "null" : y3Var.toJsonString());
            sb.append(",\"targetEvaluatorContract\":");
            l7 l7Var = this.targetEvaluatorContract;
            if (l7Var != null) {
                jsonString = l7Var.toJsonString();
            }
            sb.append(jsonString);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus;
    }

    public ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus, y3 y3Var, l7 l7Var) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus;
        this.localization = y3Var;
        this.targetEvaluatorContract = l7Var;
    }

    public ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    public ConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("propertyConfiguration") && !jSONObject.isNull("propertyConfiguration")) {
                this.propertyConfiguration = new PropertyConfigurationContract(jSONObject.getJSONObject("propertyConfiguration"));
            }
            if (jSONObject.has("configurationUUID") && !jSONObject.isNull("configurationUUID")) {
                this.configurationUUID = new ConfigurationUUID(jSONObject.getJSONObject("configurationUUID"));
            }
            if (jSONObject.has("sdkConfiguration") && !jSONObject.isNull("sdkConfiguration")) {
                this.sdkConfiguration = new SDKConfigurationContract(jSONObject.getJSONObject("sdkConfiguration"));
            }
            if (jSONObject.has("targetRuleEngine") && !jSONObject.isNull("targetRuleEngine")) {
                this.targetRuleEngine = new TargetRuleEngineContract(jSONObject.getJSONObject("targetRuleEngine"));
            }
            if (jSONObject.has("killConfiguration") && !jSONObject.isNull("killConfiguration")) {
                this.killStatus = new KillStatus(jSONObject.getJSONObject("killConfiguration"));
            }
            if (jSONObject.has("localization") && !jSONObject.isNull("localization")) {
                this.localization = new y3(jSONObject.getJSONObject("localization"));
            }
            if (!jSONObject.has("targetEvaluatorContract") || jSONObject.isNull("targetEvaluatorContract")) {
                return;
            }
            this.targetEvaluatorContract = new l7(jSONObject.getJSONObject("targetEvaluatorContract"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
