package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.internal.m;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface c {
    @NotNull
    String a();

    default void a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        jSONObject.put("analyticType", b());
        jSONObject.put("api_endpoint", d());
        if (a().length() > 0) {
            jSONObject.put("event_name", a());
        }
        jSONObject.put("timestamp", m.a(e()));
    }

    int b();

    @NotNull
    JSONObject c();

    @NotNull
    String d();

    @NotNull
    Date e();

    @NotNull
    default String a(@NotNull String str, @NotNull String fieldName, boolean z) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(fieldName, "fieldName");
        String string = StringsKt.k0(str).toString();
        int length = string.length();
        if (length == 0) {
            throw new IllegalArgumentException(YU.a.h("PiEvent must contain a ", fieldName, "."));
        }
        if (length <= 1024) {
            return string;
        }
        String strSubstring = string.substring(0, 1024);
        Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt.k0(strSubstring).toString();
    }
}
