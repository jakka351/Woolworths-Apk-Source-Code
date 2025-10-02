package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MedalliaDigitalClientConfigurationContract extends e0 {
    private long accessTokenValidationBufferTime;
    private Boolean blockNetworkInForm;
    private r1 digitalAnalyticsConfigurationContract;
    private String getConfigEndPoint;
    private Integer httpRequestTimeout;
    private b5 mediaCaptureConfiguration;
    private String ocqCUuidUrlPrefix;
    private String quarantineValidationEndpoint;
    private w4 serverHttpRequestsConfiguration;
    private String submitUrlPrefix;
    private String submitUrlSuffix;

    public MedalliaDigitalClientConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("serverHttpRequestsConfiguration") && !jSONObject.isNull("serverHttpRequestsConfiguration")) {
                this.serverHttpRequestsConfiguration = new w4(jSONObject.getJSONObject("serverHttpRequestsConfiguration"));
            }
            if (jSONObject.has("httpRequestTimeout") && !jSONObject.isNull("httpRequestTimeout")) {
                this.httpRequestTimeout = Integer.valueOf(jSONObject.getInt("httpRequestTimeout"));
            }
            if (jSONObject.has("getConfigEndPoint") && !jSONObject.isNull("getConfigEndPoint")) {
                this.getConfigEndPoint = jSONObject.getString("getConfigEndPoint");
            }
            if (jSONObject.has("submitUrlPrefix") && !jSONObject.isNull("submitUrlPrefix")) {
                this.submitUrlPrefix = jSONObject.getString("submitUrlPrefix");
            }
            if (jSONObject.has("submitUrlSuffix") && !jSONObject.isNull("submitUrlSuffix")) {
                this.submitUrlSuffix = jSONObject.getString("submitUrlSuffix");
            }
            if (jSONObject.has("blockNetworkInForm") && !jSONObject.isNull("blockNetworkInForm")) {
                this.blockNetworkInForm = Boolean.valueOf(jSONObject.getBoolean("blockNetworkInForm"));
            }
            if (jSONObject.has("accessTokenValidationBufferTime") && !jSONObject.isNull("accessTokenValidationBufferTime")) {
                this.accessTokenValidationBufferTime = jSONObject.getLong("accessTokenValidationBufferTime");
            }
            if (jSONObject.has("digitalAnalyticsConfigurationContract") && !jSONObject.isNull("digitalAnalyticsConfigurationContract")) {
                this.digitalAnalyticsConfigurationContract = new r1(jSONObject.getJSONObject("digitalAnalyticsConfigurationContract"));
            }
            if (jSONObject.has("mediaCaptureConfiguration") && !jSONObject.isNull("mediaCaptureConfiguration")) {
                this.mediaCaptureConfiguration = new b5(jSONObject.getJSONObject("mediaCaptureConfiguration"));
            }
            if (jSONObject.has("quarantineValidationEndpoint") && !jSONObject.isNull("quarantineValidationEndpoint")) {
                this.quarantineValidationEndpoint = jSONObject.getString("quarantineValidationEndpoint");
            }
            if (!jSONObject.has("ocqCuuidUrlPrefix") || jSONObject.isNull("ocqCuuidUrlPrefix")) {
                return;
            }
            this.ocqCUuidUrlPrefix = jSONObject.getString("ocqCuuidUrlPrefix");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public long getAccessTokenValidationBufferTime() {
        return this.accessTokenValidationBufferTime;
    }

    public Boolean getBlockNetworkInForm() {
        return this.blockNetworkInForm;
    }

    public r1 getDigitalAnalyticsConfigurationContract() {
        return this.digitalAnalyticsConfigurationContract;
    }

    public String getGetConfigEndPoint() {
        return this.getConfigEndPoint;
    }

    public Integer getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    public b5 getMediaCaptureConfiguration() {
        return this.mediaCaptureConfiguration;
    }

    public String getOcqCUuidUrlPrefix() {
        return this.ocqCUuidUrlPrefix;
    }

    public String getQuarantineValidationEndpoint() {
        return this.quarantineValidationEndpoint;
    }

    public w4 getServerHttpRequestsConfiguration() {
        return this.serverHttpRequestsConfiguration;
    }

    public String getSubmitUrlPrefix() {
        return this.submitUrlPrefix;
    }

    public String getSubmitUrlSuffix() {
        return this.submitUrlSuffix;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"serverHttpRequestsConfiguration\":");
            w4 w4Var = this.serverHttpRequestsConfiguration;
            String strI = "null";
            sb.append(w4Var == null ? "null" : w4Var.i());
            sb.append(",\"httpRequestTimeout\":");
            sb.append(this.httpRequestTimeout);
            sb.append(",\"getConfigEndPoint\":");
            sb.append(l3.c(this.getConfigEndPoint));
            sb.append(",\"submitUrlPrefix\":");
            sb.append(l3.c(this.submitUrlPrefix));
            sb.append(",\"submitUrlSuffix\":");
            sb.append(l3.c(this.submitUrlSuffix));
            sb.append(",\"blockNetworkInForm\":");
            sb.append(this.blockNetworkInForm);
            sb.append(",\"accessTokenValidationBufferTime\":");
            sb.append(this.accessTokenValidationBufferTime);
            sb.append(",\"digitalAnalyticsConfigurationContract\":");
            r1 r1Var = this.digitalAnalyticsConfigurationContract;
            sb.append(r1Var == null ? "null" : r1Var.e());
            sb.append(",\"mediaCaptureConfiguration\":");
            b5 b5Var = this.mediaCaptureConfiguration;
            if (b5Var != null) {
                strI = b5Var.i();
            }
            sb.append(strI);
            sb.append(",\"quarantineValidationEndpoint\":");
            sb.append(l3.c(this.quarantineValidationEndpoint));
            sb.append(",\"ocqCuuidUrlPrefix\":");
            sb.append(l3.c(this.ocqCUuidUrlPrefix));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
