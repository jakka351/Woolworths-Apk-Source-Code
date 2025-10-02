package com.medallia.digital.mobilesdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.medallia.digital.mobilesdk.CustomParameter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16389a;
    private String b;

    public c1(JSONObject jSONObject) {
        try {
            if (jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.NAME) && !jSONObject.isNull(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                this.f16389a = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            if (!jSONObject.has("type") || jSONObject.isNull("type")) {
                return;
            }
            this.b = jSONObject.getString("type");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.f16389a;
    }

    public String b() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            return "{\"name\":\"" + this.f16389a + "\",\"type\":\"" + this.b + "\"}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public boolean a(CustomParameter customParameter) {
        String strB = b();
        strB.getClass();
        switch (strB) {
            case "Number":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeInteger || customParameter.a() == CustomParameter.CustomParameterType.TypeLong || customParameter.a() == CustomParameter.CustomParameterType.TypeFloat || customParameter.a() == CustomParameter.CustomParameterType.TypeDouble;
            case "Text":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeString;
            case "Boolean":
                return customParameter.a() == CustomParameter.CustomParameterType.TypeBoolean;
            default:
                return false;
        }
    }
}
