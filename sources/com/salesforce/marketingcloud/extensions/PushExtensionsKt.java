package com.salesforce.marketingcloud.extensions;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.config.b;
import com.salesforce.marketingcloud.g;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001a\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b*\u00020\u0007H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\r"}, d2 = {"Lorg/json/JSONObject;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "getStringOrNull", "", "getIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "Lorg/json/JSONArray;", "", "toMap", "", "Lcom/salesforce/marketingcloud/config/b;", "toJSONArray", "sdk_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PushExtensionsKt {

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16895a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not add event to active events map.";
        }
    }

    @MCKeep
    @Nullable
    public static final Integer getIntOrNull(@NotNull JSONObject jSONObject, @Nullable String str) {
        Intrinsics.h(jSONObject, "<this>");
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @MCKeep
    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject jSONObject, @Nullable String str) {
        Intrinsics.h(jSONObject, "<this>");
        if (str == null) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @MCKeep
    @NotNull
    public static final JSONArray toJSONArray(@NotNull Map<String, b> map) throws JSONException {
        Intrinsics.h(map, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, b> entry : map.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.salesforce.marketingcloud.config.a.i, entry.getKey());
            String strF = entry.getValue().f();
            if (strF != null) {
                jSONObject.put(com.salesforce.marketingcloud.config.a.j, strF);
            }
            jSONObject.put(com.salesforce.marketingcloud.config.a.k, entry.getValue().e());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    @MCKeep
    @NotNull
    public static final Map<String, String> toMap(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.h(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Object obj = jSONArray.get(i);
                    Intrinsics.f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    String stringOrNull = getStringOrNull(jSONObject, com.salesforce.marketingcloud.config.a.h);
                    if (stringOrNull != null) {
                        String lowerCase = stringOrNull.toLowerCase(Locale.ROOT);
                        Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        linkedHashMap.put(lowerCase, getStringOrNull(jSONObject, com.salesforce.marketingcloud.config.a.e));
                    }
                } catch (Exception e) {
                    g.f16896a.e("~!toMap", e, a.f16895a);
                }
            }
        }
        return linkedHashMap;
    }
}
