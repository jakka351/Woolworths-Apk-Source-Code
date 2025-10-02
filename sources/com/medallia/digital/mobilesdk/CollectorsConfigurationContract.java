package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class CollectorsConfigurationContract extends e0 {
    private CollectorContract accountIdCollector;
    private CollectorContract appIdCollector;
    private CollectorContract appNameCollector;
    private CollectorContract appRatingLastAcceptedTimestampCollector;
    private CollectorContract appRatingLastDeclineTimestampCollector;
    private CollectorContract appRatingLastTriggerTimestampCollector;
    private CollectorContract appVersionCollector;
    private CollectorContract csatCollector;
    private CollectorContract customParametersCollector;
    private CollectorContract deviceFreeMemoryCollector;
    private CollectorContract deviceIdCollector;
    private CollectorContract deviceModelCollector;
    private CollectorContract deviceResolutionCollector;
    private CollectorContract deviceUsedMemoryCollector;
    private CollectorContract deviceVendorCollector;
    private CollectorContract interceptDisabledCollector;
    private CollectorContract interceptEnabledCollector;
    private CollectorContract invitationDisplayedCollector;
    private CollectorContract ipCollector;
    private CollectorContract isOCQRulesValidCollector;
    private CollectorContract isOCQUserSetCollector;
    private CollectorContract isSessionSampledEventsCollector;
    private CollectorContract languageCollector;
    private CollectorContract lastDeclineTimestampCollector;
    private CollectorContract lastSubmitTimestampCollector;
    private CollectorContract localNotificationsEnabledCollector;
    private CollectorContract networkCarrierCollector;
    private CollectorContract networkProviderCollector;
    private CollectorContract networkSpeedCollector;
    private CollectorContract networkTypeCollector;
    private CollectorContract npsCollector;
    private CollectorContract orientationCollector;
    private CollectorContract osNameCollector;
    private CollectorContract osVersionCollector;
    private CollectorContract promptDisplayedCollector;
    private CollectorContract propertyIdCollector;
    private CollectorContract sdkFrameworkCollector;
    private CollectorContract sdkVersionCollector;
    private CollectorContract sessionCalculatedPercentageCollector;
    private CollectorContract sessionIdCollector;
    private CollectorContract sessionNumberCollector;
    private CollectorContract sessionPercentageSampledEventsCollector;
    private CollectorContract timeInBackgroundCollector;
    private CollectorContract timeInCurrentForegroundCollector;
    private CollectorContract timeInForegroundCollector;
    private CollectorContract timezoneCollector;
    private CollectorContract userEmailCollector;
    private CollectorContract userIdCollector;
    private CollectorContract userNameCollector;

    public CollectorsConfigurationContract() {
        this.deviceModelCollector = s0.a.b;
        this.deviceVendorCollector = s0.a.e;
        this.deviceResolutionCollector = s0.a.c;
        this.deviceUsedMemoryCollector = s0.a.d;
        this.deviceFreeMemoryCollector = s0.a.f16690a;
        this.osNameCollector = s0.a.f;
        this.osVersionCollector = s0.a.g;
        this.networkProviderCollector = s0.a.h;
        this.networkCarrierCollector = s0.a.i;
        this.languageCollector = s0.a.j;
        this.timezoneCollector = s0.a.k;
        this.ipCollector = s0.a.l;
        this.networkSpeedCollector = s0.a.m;
        this.deviceIdCollector = s0.a.n;
        this.appNameCollector = s0.a.o;
        this.appIdCollector = s0.a.p;
        this.appVersionCollector = s0.a.q;
        this.sdkVersionCollector = s0.a.r;
        this.sessionCalculatedPercentageCollector = s0.a.s;
        this.sessionNumberCollector = s0.a.t;
        this.networkTypeCollector = s0.a.v;
        this.orientationCollector = s0.a.y;
        this.lastDeclineTimestampCollector = s0.a.z;
        this.lastSubmitTimestampCollector = s0.a.A;
        this.invitationDisplayedCollector = s0.a.F;
        this.npsCollector = s0.a.K;
        this.csatCollector = s0.a.L;
        this.appRatingLastDeclineTimestampCollector = s0.a.M;
        this.promptDisplayedCollector = s0.a.N;
        this.appRatingLastAcceptedTimestampCollector = s0.a.O;
        this.appRatingLastTriggerTimestampCollector = s0.a.Q;
        this.localNotificationsEnabledCollector = s0.a.R;
        this.timeInBackgroundCollector = s0.a.G;
        this.timeInForegroundCollector = s0.a.H;
        this.timeInCurrentForegroundCollector = s0.a.S;
        this.isOCQUserSetCollector = s0.a.T;
        this.isOCQRulesValidCollector = s0.a.U;
        this.isSessionSampledEventsCollector = s0.a.V;
        this.sessionPercentageSampledEventsCollector = s0.a.W;
        this.sdkFrameworkCollector = s0.a.P;
        this.userIdCollector = s0.a.B;
        this.userEmailCollector = s0.a.C;
        this.userNameCollector = s0.a.D;
        this.customParametersCollector = s0.a.E;
        this.interceptEnabledCollector = s0.a.I;
        this.interceptDisabledCollector = s0.a.J;
    }

    private String collectorToJSonString(CollectorContract collectorContract) {
        return collectorContract == null ? "null" : collectorContract.toJsonString();
    }

    public CollectorContract getAccountIdCollector() {
        return this.accountIdCollector;
    }

    public CollectorContract getAppIdCollector() {
        return this.appIdCollector;
    }

    public CollectorContract getAppNameCollector() {
        return this.appNameCollector;
    }

    public CollectorContract getAppRatingLastAcceptedTimestampCollector() {
        return this.appRatingLastAcceptedTimestampCollector;
    }

    public CollectorContract getAppRatingLastDeclineTimestampCollector() {
        return this.appRatingLastDeclineTimestampCollector;
    }

    public CollectorContract getAppRatingLastTriggerTimestampCollector() {
        return this.appRatingLastTriggerTimestampCollector;
    }

    public CollectorContract getAppVersionCollector() {
        return this.appVersionCollector;
    }

    public CollectorContract getCsatCollector() {
        return this.csatCollector;
    }

    public CollectorContract getCustomParametersCollector() {
        return this.customParametersCollector;
    }

    public CollectorContract getDeviceFreeMemoryCollector() {
        return this.deviceFreeMemoryCollector;
    }

    public CollectorContract getDeviceIdCollector() {
        return this.deviceIdCollector;
    }

    public CollectorContract getDeviceModelCollector() {
        return this.deviceModelCollector;
    }

    public CollectorContract getDeviceResolutionCollector() {
        return this.deviceResolutionCollector;
    }

    public CollectorContract getDeviceUsedMemoryCollector() {
        return this.deviceUsedMemoryCollector;
    }

    public CollectorContract getDeviceVendorCollector() {
        return this.deviceVendorCollector;
    }

    public CollectorContract getInterceptDisabledCollector() {
        return this.interceptDisabledCollector;
    }

    public CollectorContract getInterceptEnabledCollector() {
        return this.interceptEnabledCollector;
    }

    public CollectorContract getInvitationDisplayedCollector() {
        return this.invitationDisplayedCollector;
    }

    public CollectorContract getIpCollector() {
        return this.ipCollector;
    }

    public CollectorContract getIsOCQRulesValidCollector() {
        return this.isOCQRulesValidCollector;
    }

    public CollectorContract getIsOCQUserSetCollector() {
        return this.isOCQUserSetCollector;
    }

    public CollectorContract getIsSessionSampledEventsCollector() {
        return this.isSessionSampledEventsCollector;
    }

    public CollectorContract getLanguageCollector() {
        return this.languageCollector;
    }

    public CollectorContract getLastDeclineTimestampCollector() {
        return this.lastDeclineTimestampCollector;
    }

    public CollectorContract getLastSubmitTimestampCollector() {
        return this.lastSubmitTimestampCollector;
    }

    public CollectorContract getLocalNotificationsEnabledCollector() {
        return this.localNotificationsEnabledCollector;
    }

    public CollectorContract getNetworkCarrierCollector() {
        return this.networkCarrierCollector;
    }

    public CollectorContract getNetworkProviderCollector() {
        return this.networkProviderCollector;
    }

    public CollectorContract getNetworkSpeedCollector() {
        return this.networkSpeedCollector;
    }

    public CollectorContract getNetworkTypeCollector() {
        return this.networkTypeCollector;
    }

    public CollectorContract getNpsCollector() {
        return this.npsCollector;
    }

    public CollectorContract getOrientationCollector() {
        return this.orientationCollector;
    }

    public CollectorContract getOsNameCollector() {
        return this.osNameCollector;
    }

    public CollectorContract getOsVersionCollector() {
        return this.osVersionCollector;
    }

    public CollectorContract getPromptDisplayedCollector() {
        return this.promptDisplayedCollector;
    }

    public CollectorContract getPropertyIdCollector() {
        return this.propertyIdCollector;
    }

    public CollectorContract getSdkFrameworkCollector() {
        return this.sdkFrameworkCollector;
    }

    public CollectorContract getSdkVersionCollector() {
        return this.sdkVersionCollector;
    }

    public CollectorContract getSessionCalculatedPercentageCollector() {
        return this.sessionCalculatedPercentageCollector;
    }

    public CollectorContract getSessionIdCollector() {
        return this.sessionIdCollector;
    }

    public CollectorContract getSessionNumberCollector() {
        return this.sessionNumberCollector;
    }

    public CollectorContract getSessionPercentageSampledEventsCollector() {
        return this.sessionPercentageSampledEventsCollector;
    }

    public CollectorContract getTimeInBackgroundCollector() {
        return this.timeInBackgroundCollector;
    }

    public CollectorContract getTimeInCurrentForegroundCollector() {
        return this.timeInCurrentForegroundCollector;
    }

    public CollectorContract getTimeInForegroundCollector() {
        return this.timeInForegroundCollector;
    }

    public CollectorContract getTimezoneCollector() {
        return this.timezoneCollector;
    }

    public CollectorContract getUserEmailCollector() {
        return this.userEmailCollector;
    }

    public CollectorContract getUserIdCollector() {
        return this.userIdCollector;
    }

    public CollectorContract getUserNameCollector() {
        return this.userNameCollector;
    }

    public String toJsonString() {
        try {
            return "{\"deviceModelCollector\":" + collectorToJSonString(this.deviceModelCollector) + ",\"deviceVendorCollector\":" + collectorToJSonString(this.deviceVendorCollector) + ",\"deviceResolutionCollector\":" + collectorToJSonString(this.deviceResolutionCollector) + ",\"deviceUsedMemoryCollector\":" + collectorToJSonString(this.deviceUsedMemoryCollector) + ",\"deviceFreeMemoryCollector\":" + collectorToJSonString(this.deviceFreeMemoryCollector) + ",\"osNameCollector\":" + collectorToJSonString(this.osNameCollector) + ",\"osVersionCollector\":" + collectorToJSonString(this.osVersionCollector) + ",\"networkProviderCollector\":" + collectorToJSonString(this.networkProviderCollector) + ",\"networkCarrierCollector\":" + collectorToJSonString(this.networkCarrierCollector) + ",\"languageCollector\":" + collectorToJSonString(this.languageCollector) + ",\"timezoneCollector\":" + collectorToJSonString(this.timezoneCollector) + ",\"ipCollector\":" + collectorToJSonString(this.ipCollector) + ",\"networkSpeedCollector\":" + collectorToJSonString(this.networkSpeedCollector) + ",\"deviceIdCollector\":" + collectorToJSonString(this.deviceIdCollector) + ",\"appNameCollector\":" + collectorToJSonString(this.appNameCollector) + ",\"appIdCollector\":" + collectorToJSonString(this.appIdCollector) + ",\"appVersionCollector\":" + collectorToJSonString(this.appVersionCollector) + ",\"sdkVersionCollector\":" + collectorToJSonString(this.sdkVersionCollector) + ",\"sessionCalculatedPercentageCollector\":" + collectorToJSonString(this.sessionCalculatedPercentageCollector) + ",\"sessionNumberCollector\":" + collectorToJSonString(this.sessionNumberCollector) + ",\"sessionIdCollector\":" + collectorToJSonString(this.sessionIdCollector) + ",\"networkTypeCollector\":" + collectorToJSonString(this.networkTypeCollector) + ",\"orientationCollector\":" + collectorToJSonString(this.orientationCollector) + ",\"lastDeclineTimestampCollector\":" + collectorToJSonString(this.lastDeclineTimestampCollector) + ",\"lastSubmitTimestampCollector\":" + collectorToJSonString(this.lastSubmitTimestampCollector) + ",\"invitationDisplayedCollector\":" + collectorToJSonString(this.invitationDisplayedCollector) + ",\"propertyIdCollector\":" + collectorToJSonString(this.propertyIdCollector) + ",\"accountIdCollector\":" + collectorToJSonString(this.accountIdCollector) + ",\"npsCollector\":" + collectorToJSonString(this.npsCollector) + ",\"csatCollector\":" + collectorToJSonString(this.csatCollector) + ",\"appRatingLastDeclineTimestampCollector\":" + collectorToJSonString(this.appRatingLastDeclineTimestampCollector) + ",\"promptDisplayedCollector\":" + collectorToJSonString(this.promptDisplayedCollector) + ",\"appRatingLastAcceptedTimestampCollector\":" + collectorToJSonString(this.appRatingLastAcceptedTimestampCollector) + ",\"appRatingLastTriggerTimestampCollector\":" + collectorToJSonString(this.appRatingLastTriggerTimestampCollector) + ",\"localNotificationsEnabledCollector\":" + collectorToJSonString(this.localNotificationsEnabledCollector) + ",\"timeInBackgroundCollector\":" + collectorToJSonString(this.timeInBackgroundCollector) + ",\"timeInForegroundCollector\":" + collectorToJSonString(this.timeInForegroundCollector) + ",\"timeInCurrentForegroundCollector\":" + collectorToJSonString(this.timeInCurrentForegroundCollector) + ",\"isOCQUserSetCollector\":" + collectorToJSonString(this.isOCQUserSetCollector) + ",\"isOCQRulesValidCollector\":" + collectorToJSonString(this.isOCQRulesValidCollector) + ",\"isSessionSampledEventsCollector\":" + collectorToJSonString(this.isSessionSampledEventsCollector) + ",\"sessionPercentageSampledEventsCollector\":" + collectorToJSonString(this.sessionPercentageSampledEventsCollector) + ",\"sdkFrameworkCollector\":" + collectorToJSonString(this.sdkFrameworkCollector) + ",\"userIdCollector\":" + collectorToJSonString(this.userIdCollector) + ",\"userEmailCollector\":" + collectorToJSonString(this.userEmailCollector) + ",\"userNameCollector\":" + collectorToJSonString(this.userNameCollector) + ",\"customParametersCollector\":" + collectorToJSonString(this.customParametersCollector) + ",\"interceptEnabledCollector\":" + collectorToJSonString(this.interceptEnabledCollector) + ",\"interceptDisabledCollector\":" + collectorToJSonString(this.interceptDisabledCollector) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public CollectorsConfigurationContract(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("deviceModelCollector") || jSONObject.isNull("deviceModelCollector")) {
                str = "deviceIdCollector";
            } else {
                str = "deviceIdCollector";
                this.deviceModelCollector = new CollectorContract(jSONObject.getJSONObject("deviceModelCollector"));
            }
            if (jSONObject.has("deviceVendorCollector") && !jSONObject.isNull("deviceVendorCollector")) {
                this.deviceVendorCollector = new CollectorContract(jSONObject.getJSONObject("deviceVendorCollector"));
            }
            if (jSONObject.has("deviceResolutionCollector") && !jSONObject.isNull("deviceResolutionCollector")) {
                this.deviceResolutionCollector = new CollectorContract(jSONObject.getJSONObject("deviceResolutionCollector"));
            }
            if (jSONObject.has("deviceUsedMemoryCollector") && !jSONObject.isNull("deviceUsedMemoryCollector")) {
                this.deviceUsedMemoryCollector = new CollectorContract(jSONObject.getJSONObject("deviceUsedMemoryCollector"));
            }
            if (jSONObject.has("deviceFreeMemoryCollector") && !jSONObject.isNull("deviceFreeMemoryCollector")) {
                this.deviceFreeMemoryCollector = new CollectorContract(jSONObject.getJSONObject("deviceFreeMemoryCollector"));
            }
            if (jSONObject.has("osNameCollector") && !jSONObject.isNull("osNameCollector")) {
                this.osNameCollector = new CollectorContract(jSONObject.getJSONObject("osNameCollector"));
            }
            if (jSONObject.has("osVersionCollector") && !jSONObject.isNull("osVersionCollector")) {
                this.osVersionCollector = new CollectorContract(jSONObject.getJSONObject("osVersionCollector"));
            }
            if (jSONObject.has("networkProviderCollector") && !jSONObject.isNull("networkProviderCollector")) {
                this.networkProviderCollector = new CollectorContract(jSONObject.getJSONObject("networkProviderCollector"));
            }
            if (jSONObject.has("networkCarrierCollector") && !jSONObject.isNull("networkCarrierCollector")) {
                this.networkCarrierCollector = new CollectorContract(jSONObject.getJSONObject("networkCarrierCollector"));
            }
            if (jSONObject.has("languageCollector") && !jSONObject.isNull("languageCollector")) {
                this.languageCollector = new CollectorContract(jSONObject.getJSONObject("languageCollector"));
            }
            if (jSONObject.has("timezoneCollector") && !jSONObject.isNull("timezoneCollector")) {
                this.timezoneCollector = new CollectorContract(jSONObject.getJSONObject("timezoneCollector"));
            }
            if (jSONObject.has("ipCollector") && !jSONObject.isNull("ipCollector")) {
                this.ipCollector = new CollectorContract(jSONObject.getJSONObject("ipCollector"));
            }
            if (jSONObject.has("networkSpeedCollector") && !jSONObject.isNull("networkSpeedCollector")) {
                this.networkSpeedCollector = new CollectorContract(jSONObject.getJSONObject("networkSpeedCollector"));
            }
            String str2 = str;
            if (jSONObject.has(str2) && !jSONObject.isNull(str2)) {
                this.deviceIdCollector = new CollectorContract(jSONObject.getJSONObject(str2));
            }
            if (jSONObject.has("appNameCollector") && !jSONObject.isNull("appNameCollector")) {
                this.appNameCollector = new CollectorContract(jSONObject.getJSONObject("appNameCollector"));
            }
            if (jSONObject.has("appIdCollector") && !jSONObject.isNull("appIdCollector")) {
                this.appIdCollector = new CollectorContract(jSONObject.getJSONObject("appIdCollector"));
            }
            if (jSONObject.has("appVersionCollector") && !jSONObject.isNull("appVersionCollector")) {
                this.appVersionCollector = new CollectorContract(jSONObject.getJSONObject("appVersionCollector"));
            }
            if (jSONObject.has("sdkVersionCollector") && !jSONObject.isNull("sdkVersionCollector")) {
                this.sdkVersionCollector = new CollectorContract(jSONObject.getJSONObject("sdkVersionCollector"));
            }
            if (jSONObject.has("sessionNumberCollector") && !jSONObject.isNull("sessionNumberCollector")) {
                this.sessionNumberCollector = new CollectorContract(jSONObject.getJSONObject("sessionNumberCollector"));
            }
            if (jSONObject.has("sessionIdCollector") && !jSONObject.isNull("sessionIdCollector")) {
                this.sessionIdCollector = new CollectorContract(jSONObject.getJSONObject("sessionIdCollector"));
            }
            if (jSONObject.has("sessionCalculatedPercentageCollector") && !jSONObject.isNull("sessionCalculatedPercentageCollector")) {
                this.sessionCalculatedPercentageCollector = new CollectorContract(jSONObject.getJSONObject("sessionCalculatedPercentageCollector"));
            }
            if (jSONObject.has("networkTypeCollector") && !jSONObject.isNull("networkTypeCollector")) {
                this.networkTypeCollector = new CollectorContract(jSONObject.getJSONObject("networkTypeCollector"));
            }
            if (jSONObject.has("orientationCollector") && !jSONObject.isNull("orientationCollector")) {
                this.orientationCollector = new CollectorContract(jSONObject.getJSONObject("orientationCollector"));
            }
            if (jSONObject.has("lastDeclineTimestampCollector") && !jSONObject.isNull("lastDeclineTimestampCollector")) {
                this.lastDeclineTimestampCollector = new CollectorContract(jSONObject.getJSONObject("lastDeclineTimestampCollector"));
            }
            if (jSONObject.has("lastSubmitTimestampCollector") && !jSONObject.isNull("lastSubmitTimestampCollector")) {
                this.lastSubmitTimestampCollector = new CollectorContract(jSONObject.getJSONObject("lastSubmitTimestampCollector"));
            }
            if (jSONObject.has("invitationDisplayedCollector") && !jSONObject.isNull("invitationDisplayedCollector")) {
                this.invitationDisplayedCollector = new CollectorContract(jSONObject.getJSONObject("invitationDisplayedCollector"));
            }
            if (jSONObject.has("propertyIdCollector") && !jSONObject.isNull("propertyIdCollector")) {
                this.propertyIdCollector = new CollectorContract(jSONObject.getJSONObject("propertyIdCollector"));
            }
            if (jSONObject.has("accountIdCollector") && !jSONObject.isNull("accountIdCollector")) {
                this.accountIdCollector = new CollectorContract(jSONObject.getJSONObject("accountIdCollector"));
            }
            if (jSONObject.has("npsCollector") && !jSONObject.isNull("npsCollector")) {
                this.npsCollector = new CollectorContract(jSONObject.getJSONObject("npsCollector"));
            }
            if (jSONObject.has("csatCollector") && !jSONObject.isNull("csatCollector")) {
                this.csatCollector = new CollectorContract(jSONObject.getJSONObject("csatCollector"));
            }
            if (jSONObject.has("appRatingLastDeclineTimestampCollector") && !jSONObject.isNull("appRatingLastDeclineTimestampCollector")) {
                this.appRatingLastDeclineTimestampCollector = new CollectorContract(jSONObject.getJSONObject("appRatingLastDeclineTimestampCollector"));
            }
            if (jSONObject.has("promptDisplayedCollector") && !jSONObject.isNull("promptDisplayedCollector")) {
                this.promptDisplayedCollector = new CollectorContract(jSONObject.getJSONObject("promptDisplayedCollector"));
            }
            if (jSONObject.has("appRatingLastAcceptedTimestampCollector") && !jSONObject.isNull("appRatingLastAcceptedTimestampCollector")) {
                this.appRatingLastAcceptedTimestampCollector = new CollectorContract(jSONObject.getJSONObject("appRatingLastAcceptedTimestampCollector"));
            }
            if (jSONObject.has("appRatingLastTriggerTimestampCollector") && !jSONObject.isNull("appRatingLastTriggerTimestampCollector")) {
                this.appRatingLastTriggerTimestampCollector = new CollectorContract(jSONObject.getJSONObject("appRatingLastTriggerTimestampCollector"));
            }
            if (jSONObject.has("localNotificationsEnabledCollector") && !jSONObject.isNull("localNotificationsEnabledCollector")) {
                this.localNotificationsEnabledCollector = new CollectorContract(jSONObject.getJSONObject("localNotificationsEnabledCollector"));
            }
            if (jSONObject.has("timeInBackgroundCollector") && !jSONObject.isNull("timeInBackgroundCollector")) {
                this.timeInBackgroundCollector = new CollectorContract(jSONObject.getJSONObject("timeInBackgroundCollector"));
            }
            if (jSONObject.has("timeInForegroundCollector") && !jSONObject.isNull("timeInForegroundCollector")) {
                this.timeInForegroundCollector = new CollectorContract(jSONObject.getJSONObject("timeInForegroundCollector"));
            }
            if (jSONObject.has("timeInCurrentForegroundCollector") && !jSONObject.isNull("timeInCurrentForegroundCollector")) {
                this.timeInCurrentForegroundCollector = new CollectorContract(jSONObject.getJSONObject("timeInCurrentForegroundCollector"));
            }
            if (jSONObject.has("isOCQUserSetCollector") && !jSONObject.isNull("isOCQUserSetCollector")) {
                this.isOCQUserSetCollector = new CollectorContract(jSONObject.getJSONObject("isOCQUserSetCollector"));
            }
            if (jSONObject.has("isOCQRulesValidCollector") && !jSONObject.isNull("isOCQRulesValidCollector")) {
                this.isOCQRulesValidCollector = new CollectorContract(jSONObject.getJSONObject("isOCQRulesValidCollector"));
            }
            if (jSONObject.has("isSessionSampledEventsCollector") && !jSONObject.isNull("isSessionSampledEventsCollector")) {
                this.isSessionSampledEventsCollector = new CollectorContract(jSONObject.getJSONObject("isSessionSampledEventsCollector"));
            }
            if (jSONObject.has("sessionPercentageSampledEventsCollector") && !jSONObject.isNull("sessionPercentageSampledEventsCollector")) {
                this.sessionPercentageSampledEventsCollector = new CollectorContract(jSONObject.getJSONObject("sessionPercentageSampledEventsCollector"));
            }
            if (jSONObject.has("sdkFrameworkCollector") && !jSONObject.isNull("sdkFrameworkCollector")) {
                this.sdkFrameworkCollector = new CollectorContract(jSONObject.getJSONObject("sdkFrameworkCollector"));
            }
            if (jSONObject.has("userIdCollector") && !jSONObject.isNull("userIdCollector")) {
                this.userIdCollector = new CollectorContract(jSONObject.getJSONObject("userIdCollector"));
            }
            if (jSONObject.has("userEmailCollector") && !jSONObject.isNull("userEmailCollector")) {
                this.userEmailCollector = new CollectorContract(jSONObject.getJSONObject("userEmailCollector"));
            }
            if (jSONObject.has("userNameCollector") && !jSONObject.isNull("userNameCollector")) {
                this.userNameCollector = new CollectorContract(jSONObject.getJSONObject("userNameCollector"));
            }
            if (jSONObject.has("customParametersCollector") && !jSONObject.isNull("customParametersCollector")) {
                this.customParametersCollector = new CollectorContract(jSONObject.getJSONObject("customParametersCollector"));
            }
            if (jSONObject.has("interceptEnabledCollector") && !jSONObject.isNull("interceptEnabledCollector")) {
                this.interceptEnabledCollector = new CollectorContract(jSONObject.getJSONObject("interceptEnabledCollector"));
            }
            if (!jSONObject.has("interceptDisabledCollector") || jSONObject.isNull("interceptDisabledCollector")) {
                return;
            }
            this.interceptDisabledCollector = new CollectorContract(jSONObject.getJSONObject("interceptDisabledCollector"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
