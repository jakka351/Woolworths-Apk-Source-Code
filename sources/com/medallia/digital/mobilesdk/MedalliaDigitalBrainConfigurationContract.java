package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MedalliaDigitalBrainConfigurationContract extends e0 {
    private Long androidBackoffDelay;
    private boolean canBlockAfterOneSuccess;
    private boolean evaluateWithConfigurationFile;
    private Long formDisplayTimeout;
    private boolean isBlackBoxEnabled;
    private boolean isBridgeSDKIntegrationEnabled;
    private boolean isCrashlyticsInjectionCustomKeysEnabled;
    private boolean isDistinct;
    private boolean isFeedbackSubmitIndicatorEnabled;
    private boolean isSessionPercentageSupportDouble;
    private boolean isTREV2Enabled;
    private Double maxDbFileSizeInMb;
    private Integer maxTableRecordsBeforeClean;
    private long maxUserJourneyEventsSize;
    private Long offlineConfigurationExpirationTime;
    private boolean removeTaskContainingFormActivityOnly;
    private boolean requestMediaCapturePermissions;
    private Long sessionInactivityTime;
    private boolean skipSetUnattachedCustomParams;

    public MedalliaDigitalBrainConfigurationContract() {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.isFeedbackSubmitIndicatorEnabled = true;
    }

    public Long getAndroidBackoffDelay() {
        return this.androidBackoffDelay;
    }

    public Long getFormDisplayTimeout() {
        return this.formDisplayTimeout;
    }

    public Double getMaxDbFileSizeInMb() {
        return this.maxDbFileSizeInMb;
    }

    public Integer getMaxTableRecordsBeforeClean() {
        return this.maxTableRecordsBeforeClean;
    }

    public long getMaxUserJourneyEventsSize() {
        return this.maxUserJourneyEventsSize;
    }

    public Long getOfflineConfigurationExpirationTime() {
        return this.offlineConfigurationExpirationTime;
    }

    public Long getSessionInactivityTime() {
        return this.sessionInactivityTime;
    }

    public boolean isBlackBoxEnabled() {
        return this.isBlackBoxEnabled;
    }

    public boolean isBridgeSDKIntegrationEnabled() {
        return this.isBridgeSDKIntegrationEnabled;
    }

    public boolean isCanBlockAfterOneSuccess() {
        return this.canBlockAfterOneSuccess;
    }

    public boolean isCrashlyticsInjectionCustomKeysEnabled() {
        return this.isCrashlyticsInjectionCustomKeysEnabled;
    }

    public boolean isDistinct() {
        return this.isDistinct;
    }

    public boolean isEvaluateWithConfigurationFile() {
        return this.evaluateWithConfigurationFile;
    }

    public boolean isFeedbackSubmitIndicatorEnabled() {
        return this.isFeedbackSubmitIndicatorEnabled;
    }

    public boolean isRemoveTaskContainingFormActivityOnly() {
        return this.removeTaskContainingFormActivityOnly;
    }

    public boolean isRequestMediaCapturePermissions() {
        return this.requestMediaCapturePermissions;
    }

    public boolean isSessionPercentageSupportDouble() {
        return this.isSessionPercentageSupportDouble;
    }

    public boolean isSkipSetUnattachedCustomParams() {
        return this.skipSetUnattachedCustomParams;
    }

    public boolean isTREV2Enabled() {
        return this.isTREV2Enabled;
    }

    public void setAndroidBackoffDelay(Long l) {
        this.androidBackoffDelay = l;
    }

    public String toJsonString() {
        try {
            return "{\"sessionInactivityTime\":" + this.sessionInactivityTime + ",\"formDisplayTimeout\":" + this.formDisplayTimeout + ",\"offlineConfigurationExpirationTime\":" + this.offlineConfigurationExpirationTime + ",\"isDistinct\":" + this.isDistinct + ",\"canBlockAfterOneSuccess\":" + this.canBlockAfterOneSuccess + ",\"maxUserJourneyEventsSize\":" + this.maxUserJourneyEventsSize + ",\"isBlackBoxEnabled\":" + this.isBlackBoxEnabled + ",\"evaluateWithConfigurationFile\":" + this.evaluateWithConfigurationFile + ",\"isTREV2Enabled\":" + this.isTREV2Enabled + ",\"requestMediaCapturePermissions\":" + this.requestMediaCapturePermissions + ",\"androidBackoffDelay\":" + this.androidBackoffDelay + ",\"isFeedbackSubmitIndicatorEnabled\":" + this.isFeedbackSubmitIndicatorEnabled + ",\"isSessionPercentageSupportDouble\":" + this.isSessionPercentageSupportDouble + ",\"maxDbFileSizeInMb\":" + this.maxDbFileSizeInMb + ",\"maxTableRecordsBeforeClean\":" + this.maxTableRecordsBeforeClean + ",\"skipSetUnattachedCustomParams\":" + this.skipSetUnattachedCustomParams + ",\"androidRemoveTaskContainingFormActivityOnly\":" + this.removeTaskContainingFormActivityOnly + ",\"isBridgeSDKIntegrationEnabled\":" + this.isBridgeSDKIntegrationEnabled + ",\"isCrashlyticsInjectionCustomKeysEnabled\":" + this.isCrashlyticsInjectionCustomKeysEnabled + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public MedalliaDigitalBrainConfigurationContract(long j) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.sessionInactivityTime = Long.valueOf(j);
    }

    public MedalliaDigitalBrainConfigurationContract(long j, boolean z, boolean z2) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.sessionInactivityTime = Long.valueOf(j);
        this.isDistinct = z;
        this.canBlockAfterOneSuccess = z2;
    }

    public MedalliaDigitalBrainConfigurationContract(JSONObject jSONObject) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        try {
            if (jSONObject.has("sessionInactivityTime") && !jSONObject.isNull("sessionInactivityTime")) {
                this.sessionInactivityTime = Long.valueOf(jSONObject.getLong("sessionInactivityTime"));
            }
            if (jSONObject.has("formDisplayTimeout") && !jSONObject.isNull("formDisplayTimeout")) {
                this.formDisplayTimeout = Long.valueOf(jSONObject.getLong("formDisplayTimeout"));
            }
            if (jSONObject.has("offlineConfigurationExpirationTime") && !jSONObject.isNull("offlineConfigurationExpirationTime")) {
                this.offlineConfigurationExpirationTime = Long.valueOf(jSONObject.getLong("offlineConfigurationExpirationTime"));
            }
            if (jSONObject.has("isDistinct") && !jSONObject.isNull("isDistinct")) {
                this.isDistinct = jSONObject.getBoolean("isDistinct");
            }
            if (jSONObject.has("canBlockAfterOneSuccess") && !jSONObject.isNull("canBlockAfterOneSuccess")) {
                this.canBlockAfterOneSuccess = jSONObject.getBoolean("canBlockAfterOneSuccess");
            }
            if (jSONObject.has("maxUserJourneyEventsSize") && !jSONObject.isNull("maxUserJourneyEventsSize")) {
                this.maxUserJourneyEventsSize = jSONObject.getLong("maxUserJourneyEventsSize");
            }
            if (jSONObject.has("isBlackBoxEnabled") && !jSONObject.isNull("isBlackBoxEnabled")) {
                this.isBlackBoxEnabled = jSONObject.getBoolean("isBlackBoxEnabled");
            }
            if (jSONObject.has("evaluateWithConfigurationFile") && !jSONObject.isNull("evaluateWithConfigurationFile")) {
                this.evaluateWithConfigurationFile = jSONObject.getBoolean("evaluateWithConfigurationFile");
            }
            if (jSONObject.has("isTREV2Enabled") && !jSONObject.isNull("isTREV2Enabled")) {
                this.isTREV2Enabled = jSONObject.getBoolean("isTREV2Enabled");
            }
            if (jSONObject.has("requestMediaCapturePermissions") && !jSONObject.isNull("requestMediaCapturePermissions")) {
                this.requestMediaCapturePermissions = jSONObject.getBoolean("requestMediaCapturePermissions");
            }
            if (jSONObject.has("androidBackoffDelay") && !jSONObject.isNull("androidBackoffDelay")) {
                this.androidBackoffDelay = Long.valueOf(jSONObject.getLong("androidBackoffDelay"));
            }
            if (jSONObject.has("isSessionPercentageSupportDouble") && !jSONObject.isNull("isSessionPercentageSupportDouble")) {
                this.isSessionPercentageSupportDouble = jSONObject.getBoolean("isSessionPercentageSupportDouble");
            }
            if (jSONObject.has("maxDbFileSizeInMb") && !jSONObject.isNull("maxDbFileSizeInMb")) {
                this.maxDbFileSizeInMb = Double.valueOf(jSONObject.getDouble("maxDbFileSizeInMb"));
            }
            if (jSONObject.has("maxTableRecordsBeforeClean") && !jSONObject.isNull("maxTableRecordsBeforeClean")) {
                this.maxTableRecordsBeforeClean = Integer.valueOf(jSONObject.getInt("maxTableRecordsBeforeClean"));
            }
            if (!jSONObject.has("isFeedbackSubmitIndicatorEnabled") || jSONObject.isNull("isFeedbackSubmitIndicatorEnabled")) {
                this.isFeedbackSubmitIndicatorEnabled = true;
            } else {
                this.isFeedbackSubmitIndicatorEnabled = jSONObject.getBoolean("isFeedbackSubmitIndicatorEnabled");
            }
            if (jSONObject.has("skipSetUnattachedCustomParams") && !jSONObject.isNull("skipSetUnattachedCustomParams")) {
                this.skipSetUnattachedCustomParams = jSONObject.getBoolean("skipSetUnattachedCustomParams");
            }
            if (jSONObject.has("androidRemoveTaskContainingFormActivityOnly") && !jSONObject.isNull("androidRemoveTaskContainingFormActivityOnly")) {
                this.removeTaskContainingFormActivityOnly = jSONObject.getBoolean("androidRemoveTaskContainingFormActivityOnly");
            }
            if (jSONObject.has("isBridgeSDKIntegrationEnabled") && !jSONObject.isNull("isBridgeSDKIntegrationEnabled")) {
                this.isBridgeSDKIntegrationEnabled = jSONObject.getBoolean("isBridgeSDKIntegrationEnabled");
            }
            if (!jSONObject.has("isCrashlyticsInjectionCustomKeysEnabled") || jSONObject.isNull("isCrashlyticsInjectionCustomKeysEnabled")) {
                return;
            }
            this.isCrashlyticsInjectionCustomKeysEnabled = jSONObject.getBoolean("isCrashlyticsInjectionCustomKeysEnabled");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
