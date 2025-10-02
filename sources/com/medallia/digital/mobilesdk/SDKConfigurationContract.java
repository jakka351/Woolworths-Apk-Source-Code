package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SDKConfigurationContract extends e0 {
    private CollectorsConfigurationContract collectorsConfigurations;
    private i eventsConfigurations;
    private JSONObject features;
    private FormConfigurations formConfigurations;
    private MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
    private MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig;
    private t6 sdkVersionsContract;

    public SDKConfigurationContract() {
    }

    public CollectorsConfigurationContract getCollectorsConfigurations() {
        return this.collectorsConfigurations;
    }

    public i getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    public JSONObject getFeatures() {
        return this.features;
    }

    public FormConfigurations getFormConfigurations() {
        return this.formConfigurations;
    }

    public MedalliaDigitalBrainConfigurationContract getMedalliaDigitalBrain() {
        return this.medalliaDigitalBrain;
    }

    public MedalliaDigitalClientConfigurationContract getMedalliaDigitalClientConfig() {
        return this.medalliaDigitalClientConfig;
    }

    public t6 getSdkVersionsContract() {
        return this.sdkVersionsContract;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"collectorsConfigurations\":");
            CollectorsConfigurationContract collectorsConfigurationContract = this.collectorsConfigurations;
            String jsonString = "null";
            sb.append(collectorsConfigurationContract == null ? "null" : collectorsConfigurationContract.toJsonString());
            sb.append(",\"medalliaDigitalClientConfig\":");
            MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract = this.medalliaDigitalClientConfig;
            sb.append(medalliaDigitalClientConfigurationContract == null ? "null" : medalliaDigitalClientConfigurationContract.toJsonString());
            sb.append(",\"medalliaDigitalBrain\":");
            MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract = this.medalliaDigitalBrain;
            sb.append(medalliaDigitalBrainConfigurationContract == null ? "null" : medalliaDigitalBrainConfigurationContract.toJsonString());
            sb.append(",\"formConfigurations\":");
            FormConfigurations formConfigurations = this.formConfigurations;
            sb.append(formConfigurations == null ? "null" : formConfigurations.toJsonString());
            sb.append(",\"analyticsEventsConfigurationContract\":");
            i iVar = this.eventsConfigurations;
            sb.append(iVar == null ? "null" : iVar.e());
            sb.append(",\"features\":");
            JSONObject jSONObject = this.features;
            sb.append(jSONObject == null ? "null" : jSONObject.toString());
            sb.append(",\"sdkVersionsContract\":");
            t6 t6Var = this.sdkVersionsContract;
            if (t6Var != null) {
                jsonString = t6Var.toJsonString();
            }
            sb.append(jsonString);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public SDKConfigurationContract(CollectorsConfigurationContract collectorsConfigurationContract, MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract, MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract) {
        this.collectorsConfigurations = collectorsConfigurationContract;
        this.medalliaDigitalClientConfig = medalliaDigitalClientConfigurationContract;
        this.medalliaDigitalBrain = medalliaDigitalBrainConfigurationContract;
    }

    public SDKConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("collectorsConfigurations") && !jSONObject.isNull("collectorsConfigurations")) {
                this.collectorsConfigurations = new CollectorsConfigurationContract(jSONObject.getJSONObject("collectorsConfigurations"));
            }
            if (jSONObject.has("medalliaDigitalClientConfig") && !jSONObject.isNull("medalliaDigitalClientConfig")) {
                this.medalliaDigitalClientConfig = new MedalliaDigitalClientConfigurationContract(jSONObject.getJSONObject("medalliaDigitalClientConfig"));
            }
            if (jSONObject.has("medalliaDigitalBrain") && !jSONObject.isNull("medalliaDigitalBrain")) {
                this.medalliaDigitalBrain = new MedalliaDigitalBrainConfigurationContract(jSONObject.getJSONObject("medalliaDigitalBrain"));
            }
            if (jSONObject.has("formConfigurations") && !jSONObject.isNull("formConfigurations")) {
                this.formConfigurations = new FormConfigurations(jSONObject.getJSONObject("formConfigurations"));
            }
            if (jSONObject.has("analyticsEventsConfigurationContract") && !jSONObject.isNull("analyticsEventsConfigurationContract")) {
                this.eventsConfigurations = new i(jSONObject.getJSONObject("analyticsEventsConfigurationContract"));
            }
            if (jSONObject.has("features") && !jSONObject.isNull("features")) {
                this.features = jSONObject.getJSONObject("features");
            }
            if (!jSONObject.has("sdkTerminationConfiguration") || jSONObject.isNull("sdkTerminationConfiguration")) {
                return;
            }
            this.sdkVersionsContract = new t6(jSONObject.getJSONObject("sdkTerminationConfiguration"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
