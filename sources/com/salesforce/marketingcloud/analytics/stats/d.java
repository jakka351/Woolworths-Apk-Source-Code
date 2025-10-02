package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.util.l;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    final JSONObject f16853a;

    private d(String str) throws JSONException {
        this.f16853a = new JSONObject(str);
    }

    public static d b(String str, String str2, Date date, String str3, String str4) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        return dVar;
    }

    private void c(String str) throws JSONException {
        this.f16853a.put("buttonId", str);
    }

    private void d(@Nullable String str) throws JSONException {
        if (str == null) {
            return;
        }
        this.f16853a.put(com.salesforce.marketingcloud.config.a.e, str);
    }

    private void e(String str) throws JSONException {
        this.f16853a.put("id", str);
    }

    private void f(String str) throws JSONException {
        this.f16853a.put("messageId", str);
    }

    private void g(String str) throws JSONException {
        this.f16853a.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
    }

    private void h(String str) throws JSONException {
        this.f16853a.put("outcomeType", str);
    }

    private void i(String str) throws JSONException {
        this.f16853a.put("triggerId", str);
    }

    @NonNull
    public String a() {
        return this.f16853a.toString();
    }

    private d(String str, String str2, Date date) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f16853a = jSONObject;
        jSONObject.put("applicationId", str);
        jSONObject.put("deviceId", str2);
        jSONObject.put("eventDateUtc", l.a(date));
    }

    public static d a(String str, String str2, Date date, String str3, String str4) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        return dVar;
    }

    private void b(@Nullable String str) throws JSONException {
        if (str != null) {
            this.f16853a.put("activityInstanceId", str);
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        this.f16853a.put("metaData", jSONObject);
    }

    @NonNull
    public static d a(@NonNull String str) throws JSONException {
        return new d(str);
    }

    private void b(JSONObject jSONObject) throws JSONException {
        this.f16853a.put("information", jSONObject);
    }

    public static d a(String str, String str2, Date date, String str3, String str4, long j, int i, String str5) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.a(j);
        dVar.a(i);
        dVar.c(str5);
        return dVar;
    }

    private void b() throws JSONException {
        this.f16853a.put(k.a.b, "Android");
    }

    public static d a(String str, String str2, Date date, @Nullable String str3, @Nullable String str4, JSONObject jSONObject) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.b(jSONObject);
        dVar.b();
        if (str3 != null) {
            dVar.f(str3);
        }
        if (str4 != null) {
            dVar.b(str4);
        }
        return dVar;
    }

    public void b(int i) throws JSONException {
        this.f16853a.put("timeInApp", i);
    }

    private void a(JSONObject jSONObject) throws JSONException {
        this.f16853a.put(k.a.h, jSONObject);
    }

    private void a(int i) throws JSONException {
        this.f16853a.put("dismissReason", i);
    }

    public void a(long j) throws JSONException {
        this.f16853a.put("duration", j);
    }

    private void a(List<String> list) throws JSONException {
        this.f16853a.put("reasons", new JSONArray((Collection) list));
    }

    public static d a(String str, String str2, Date date, JSONObject jSONObject) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.b(jSONObject);
        dVar.b();
        return dVar;
    }

    public static d a(String str, String str2, Date date, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, @Nullable String str5) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.e(str4);
        dVar.g(str3);
        dVar.a(jSONObject);
        dVar.c(jSONObject2);
        dVar.d(str5);
        return dVar;
    }

    public static d a(String str, String str2, Date date, String str3, String str4, String str5, String str6) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.i(str5);
        dVar.h(str6);
        return dVar;
    }

    public static d a(String str, String str2, Date date, String str3, String str4, List<String> list) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.a(list);
        dVar.b();
        return dVar;
    }
}
