package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResourceContract extends b0 implements Serializable {
    private static final int HASH_CODE_MULT = 31;
    private String checksum;
    private String formId;
    private Boolean isGlobal;
    private String localUrl;
    private String remoteUrl;

    public ResourceContract() {
        this.isGlobal = Boolean.FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ResourceContract resourceContract = (ResourceContract) obj;
            String str = this.formId;
            if (str == null ? resourceContract.formId != null : !str.equals(resourceContract.formId)) {
                return false;
            }
            String str2 = this.remoteUrl;
            if (str2 == null ? resourceContract.remoteUrl != null : !str2.equals(resourceContract.remoteUrl)) {
                return false;
            }
            String str3 = this.localUrl;
            if (str3 == null ? resourceContract.localUrl != null : !str3.equals(resourceContract.localUrl)) {
                return false;
            }
            Boolean bool = this.isGlobal;
            if (bool == null ? resourceContract.isGlobal != null : !bool.equals(resourceContract.isGlobal)) {
                return false;
            }
            String str4 = this.checksum;
            String str5 = resourceContract.checksum;
            if (str4 != null) {
                return str4.equals(str5);
            }
            if (str5 == null) {
                return true;
            }
        }
        return false;
    }

    public String getChecksum() {
        return this.checksum;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.Resource;
    }

    public String getFormId() {
        return this.formId;
    }

    public String getLocalUrl() {
        return this.localUrl;
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public int hashCode() {
        String str = this.formId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.remoteUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.localUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.checksum;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.isGlobal;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public Boolean isGlobal() {
        Boolean bool = this.isGlobal;
        return bool == null ? Boolean.FALSE : bool;
    }

    public void setFormId(String str) {
        this.formId = str;
    }

    public void setGlobal(Boolean bool) {
        this.isGlobal = bool;
    }

    public String toJsonString() {
        try {
            return "{\"formId\":" + l3.c(this.formId) + ",\"remoteUrl\":" + l3.c(this.remoteUrl) + ",\"localUrl\":" + l3.c(this.localUrl) + ",\"checksum\":" + l3.c(this.checksum) + ",\"isGlobal\":" + this.isGlobal + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public ResourceContract(String str, String str2, String str3, String str4) {
        Boolean bool = Boolean.FALSE;
        this.formId = str;
        this.remoteUrl = str2;
        this.localUrl = str3;
        this.checksum = str4;
        this.isGlobal = bool;
    }

    public ResourceContract(String str, String str2, String str3, String str4, boolean z) {
        this.isGlobal = Boolean.FALSE;
        this.formId = str;
        this.remoteUrl = str2;
        this.localUrl = str3;
        this.checksum = str4;
        this.isGlobal = Boolean.valueOf(z);
    }

    public ResourceContract(JSONObject jSONObject) {
        this.isGlobal = Boolean.FALSE;
        try {
            if (jSONObject.has("remoteUrl") && !jSONObject.isNull("remoteUrl")) {
                this.remoteUrl = jSONObject.getString("remoteUrl");
            }
            if (jSONObject.has("localUrl") && !jSONObject.isNull("localUrl")) {
                this.localUrl = jSONObject.getString("localUrl");
            }
            if (jSONObject.has("checksum") && !jSONObject.isNull("checksum")) {
                this.checksum = jSONObject.getString("checksum");
            }
            if (jSONObject.has("isGlobal") && !jSONObject.isNull("isGlobal")) {
                this.isGlobal = Boolean.valueOf(jSONObject.getBoolean("isGlobal"));
            }
            if (!jSONObject.has("formId") || jSONObject.isNull("formId")) {
                return;
            }
            this.formId = jSONObject.getString("formId");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
