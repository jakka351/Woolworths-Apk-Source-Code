package com.medallia.digital.mobilesdk;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class FormCommunicator extends BaseFormCommunicator {
    public static final String NPS = "nps";

    public FormCommunicator(String str, i2 i2Var, FormTriggerType formTriggerType, FormViewType formViewType, y3 y3Var, boolean z, Integer num) {
        super(str, i2Var, formTriggerType, formViewType, y3Var, z, num);
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String getCustomParamsString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList<CustomParameter> customParameters = CollectorsInfrastructure.getInstance().getCustomParameters();
        if (customParameters != null) {
            try {
                Iterator<CustomParameter> it = customParameters.iterator();
                while (it.hasNext()) {
                    CustomParameter next = it.next();
                    jSONObject.put(next.b(), l3.a((Object) String.valueOf(next.c())));
                }
            } catch (Exception e) {
                a4.c("FormId: " + this.formId + " failed to getCustomParams " + e.getMessage());
            }
        }
        String string = jSONObject.toString();
        a4.b(YU.a.p(new StringBuilder("FormId: "), this.formId, " getCustomParams was called ", string));
        return string;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public b5 getMediaCapture() {
        if (t0.c().a() == null || t0.c().a().getSdkConfiguration() == null || t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig() == null || t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig().getMediaCaptureConfiguration() == null) {
            return null;
        }
        return t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig().getMediaCaptureConfiguration();
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String getProvisionsData() throws JSONException {
        HashMap<String, Boolean> mapG = r2.e().g();
        JSONObject jSONObject = new JSONObject();
        if (mapG != null) {
            try {
                for (Map.Entry<String, Boolean> entry : mapG.entrySet()) {
                    jSONObject.put(entry.getKey(), l3.a(entry.getValue()));
                }
            } catch (Exception e) {
                a4.c("FormId: " + this.formId + " failed to getProvisions " + e.getMessage());
            }
        }
        String string = jSONObject.toString();
        a4.b(YU.a.p(new StringBuilder("FormId: "), this.formId, " getProvisions was called ", string));
        return string;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public boolean isDarkMode() {
        j2 j2Var = this.formData;
        if (j2Var == null || !j2Var.isDarkModeEnabled()) {
            return false;
        }
        return MDAppearanceMode.dark.equals(v7.c().a());
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public boolean isPreviewApp() {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void notifySendFeedback() {
        Intent intent = new Intent("com.medallia.digital.mobilesdk.LastSubmitTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.LastSubmitTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent);
        Broadcasts.d.a(Broadcasts.d.a.formSubmitted, this.formId, this.formTriggerType, this.formViewType);
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String provideDeviceData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String sDKVersion = CollectorsInfrastructure.getInstance().getSDKVersion();
            a4.b("sdkVersion = " + sDKVersion);
            jSONObject.put("osVersion", l3.a((Object) CollectorsInfrastructure.getInstance().getOSVersion()));
            jSONObject.put(lllqqql.cc006300630063cc, l3.a((Object) sDKVersion));
            jSONObject.put("appVersion", l3.a((Object) CollectorsInfrastructure.getInstance().getAppVersion()));
            jSONObject.put("osType", "Android");
            jSONObject.put("deviceId", l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceId()));
            jSONObject.put("deviceModel", l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceModel()));
            jSONObject.put("appId", l3.a((Object) CollectorsInfrastructure.getInstance().getAppId()));
            a4.b("isDarkMode = " + isDarkMode());
            jSONObject.put("isDarkMode", isDarkMode());
        } catch (JSONException e) {
            a4.c("FormId: " + this.formId + " failed to getDeviceData " + e.getMessage());
        }
        String string = jSONObject.toString();
        a4.b(YU.a.p(new StringBuilder("FormId: "), this.formId, " getDeviceData was called ", string));
        return string;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String provideSdkData() throws JSONException, PackageManager.NameNotFoundException {
        JSONObject features;
        if (t0.c().a() == null || t0.c().a().getSdkConfiguration() == null || t0.c().a().getSdkConfiguration().getFeatures() == null) {
            features = null;
        } else {
            features = t0.c().a().getSdkConfiguration().getFeatures();
            a4.b("FormId: " + this.formId + " getSDKData was called " + features.toString());
        }
        try {
            PackageInfo packageInfo = i4.c().b().getPackageManager().getPackageInfo(i4.c().b().getPackageName(), 4096);
            if (packageInfo != null) {
                ArrayList arrayList = new ArrayList(Arrays.asList(packageInfo.requestedPermissions));
                if (!arrayList.contains("android.permission.CAMERA") && !arrayList.contains("android.permission.RECORD_AUDIO") && features != null && features.has("sdkSupportedFeatures")) {
                    try {
                        ArrayList<String> stringArray = ModelFactory.getInstance().getStringArray(features.getJSONArray("sdkSupportedFeatures"));
                        if (stringArray.contains("mediaCapture")) {
                            stringArray.remove("mediaCapture");
                            features.put("sdkSupportedFeatures", new JSONArray((Collection) stringArray));
                        }
                    } catch (JSONException e) {
                        a4.c(e.getMessage());
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            a4.c(e2.getMessage());
        }
        if (features != null) {
            return features.toString();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void sendFeedback(c2 c2Var) {
        s4.f().a(c2Var, new a());
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObjectA;
        if (jSONObject == null) {
            str = "feedbackContract is null";
        } else {
            try {
                JSONObject jSONObject2 = (!jSONObject.has("dynamicData") || jSONObject.isNull("dynamicData")) ? null : jSONObject.getJSONObject("dynamicData");
                if (jSONObject2 != null && jSONObject2.has("pages") && !jSONObject2.isNull("pages")) {
                    if (!jSONObject.has("uuid") || jSONObject.isNull("uuid")) {
                        jSONObject.put("uuid", UUID.randomUUID().toString());
                    }
                    JSONArray jSONArray = new JSONArray();
                    if (jSONObject2.has("pages") && !jSONObject2.isNull("pages")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("pages");
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                            if (jSONObject3 != null && jSONObject3.has("components") && !jSONObject3.isNull("components")) {
                                JSONArray jSONArray3 = jSONObject3.getJSONArray("components");
                                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                                    jSONArray.put(jSONArray3.get(i2));
                                }
                            }
                        }
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("components", l3.a(jSONArray));
                    this.feedbackClientCorrelationId = jSONObject.getString("uuid");
                    if (t0.c().a() == null || t0.c().a().getSdkConfiguration() == null || t0.c().a().getSdkConfiguration().getFormConfigurations() == null || (jSONObjectA = e2.a(jSONObject4, t0.c().a().getSdkConfiguration().getFormConfigurations())) == null) {
                        return;
                    }
                    updateRatingCollectors(jSONObjectA);
                    Broadcasts.d.a(Broadcasts.d.a.feedbackPayload, this.formId, this.formTriggerType, this.feedbackClientCorrelationId, jSONObjectA.toString());
                    x6 x6Var = x6.f16771a;
                    if (x6Var.h() && x6Var.i()) {
                        x6Var.a(this.feedbackClientCorrelationId);
                        return;
                    }
                    return;
                }
                str = "dynamicData is null";
            } catch (Exception e) {
                a4.c(e.getMessage());
                return;
            }
        }
        a4.f(str);
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void separateCustomParams(JSONObject jSONObject) throws JSONException {
        try {
            for (SDKConfigurationFormContract sDKConfigurationFormContract : t0.c().a().getPropertyConfiguration().getForms()) {
                if (sDKConfigurationFormContract.getFormId().equals(this.formId)) {
                    if (sDKConfigurationFormContract.getCustomParams() != null) {
                        JSONArray jSONArray = new JSONArray(l3.e(sDKConfigurationFormContract.getCustomParams()));
                        HashMap map = new HashMap();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            map.put(jSONObject2.getString("unique_name"), jSONObject2);
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator<CustomParameter> it = CollectorsInfrastructure.getInstance().getCustomParameters().iterator();
                        while (it.hasNext()) {
                            CustomParameter next = it.next();
                            if (map.get(next.b()) != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("unique_name", next.b());
                                jSONObject3.put("value", next.c());
                                jSONArray2.put(jSONObject3);
                            }
                        }
                        JSONObject jSONObject4 = jSONObject.getJSONObject("dynamicData");
                        jSONObject4.put("customParams", jSONArray2);
                        jSONObject.put("dynamicData", jSONObject4);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void updateRatingCollectors(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("components") || jSONObject.isNull("components")) {
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("components");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("type") && jSONObject2.has("value") && NPS.equals(jSONObject2.getString("type")) && !jSONObject2.isNull("value")) {
                    try {
                        Intent intent = new Intent("com.medallia.digital.mobilesdk.NPSCollectorFilter");
                        intent.putExtra("com.medallia.digital.mobilesdk.NPSCollector", jSONObject2.getInt("value"));
                        q4.a(i4.c().b()).a(intent);
                    } catch (Exception e) {
                        a4.c(e.getMessage());
                    }
                }
                if (jSONObject2.has("isCsat") && jSONObject2.has("value") && !jSONObject2.isNull("isCsat") && jSONObject2.getBoolean("isCsat") && !jSONObject2.isNull("value")) {
                    try {
                        Intent intent2 = new Intent("com.medallia.digital.mobilesdk.CSATCollectorFilter");
                        intent2.putExtra("com.medallia.digital.mobilesdk.CSATCollector", jSONObject2.getInt("value"));
                        q4.a(i4.c().b()).a(intent2);
                    } catch (Exception e2) {
                        a4.c(e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            a4.c(e3.getMessage());
        }
    }

    public class a implements n6<Void> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Submit feedback failed: " + h4Var.getMessage());
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r1) {
            a4.e("Submit feedback sent successfully");
            Broadcasts.h.a(Broadcasts.h.a.submitFeedback);
        }
    }
}
