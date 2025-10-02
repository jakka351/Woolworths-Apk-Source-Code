package com.medallia.digital.mobilesdk;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FormCommunicatorPreviews extends BaseFormCommunicator {
    private final l0 clientRequestData;
    private final String customParams;
    private final String features;
    private final b5 mediaCaptureConfiguration;
    private final String provisions;
    private final String token;

    public FormCommunicatorPreviews(j2 j2Var, y3 y3Var, o2 o2Var, i2 i2Var, b5 b5Var, boolean z, Integer num) {
        super(j2Var, i2Var, (FormTriggerType) null, (FormViewType) null, y3Var, z, num);
        this.clientRequestData = new l0(o2Var.d());
        this.token = o2Var.e();
        this.provisions = o2Var.c();
        this.customParams = o2Var.a();
        this.mediaCaptureConfiguration = b5Var;
        this.features = o2Var.b();
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String getCustomParamsString() {
        return this.customParams;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public b5 getMediaCapture() {
        return this.mediaCaptureConfiguration;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String getProvisionsData() {
        return this.provisions;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public boolean isDarkMode() {
        j2 j2Var = this.formData;
        if (j2Var == null || !j2Var.isDarkModeEnabled()) {
            return false;
        }
        return MDAppearanceMode.dark.equals(this.formData.d());
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public boolean isPreviewApp() {
        return true;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void notifySendFeedback() {
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public String provideDeviceData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("osVersion", l3.a((Object) CollectorsInfrastructure.getInstance().getOSVersion()));
            jSONObject.put(lllqqql.cc006300630063cc, l3.a((Object) "4.8.1"));
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
    public String provideSdkData() {
        return this.features;
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void sendFeedback(c2 c2Var) {
        Broadcasts.d.a(Broadcasts.d.a.formSubmitted, this.formId);
        new g7(s4.f().h(), this.clientRequestData, c2Var, Boolean.TRUE, this.token, new a()).c();
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject) {
    }

    @Override // com.medallia.digital.mobilesdk.BaseFormCommunicator
    public void separateCustomParams(JSONObject jSONObject) throws JSONException {
        try {
            if (getCustomParams() != null) {
                JSONObject jSONObject2 = new JSONObject(getCustomParams());
                JSONArray jSONArray = new JSONArray();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("unique_name", next);
                        jSONObject3.put("value", jSONObject2.get(next));
                        jSONArray.put(jSONObject3);
                    }
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("dynamicData");
                jSONObject4.put("customParams", jSONArray);
                jSONObject.put("dynamicData", jSONObject4);
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public class a implements n6<Void> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r1) {
        }
    }
}
