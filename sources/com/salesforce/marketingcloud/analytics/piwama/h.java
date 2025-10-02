package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import com.salesforce.marketingcloud.internal.m;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f16849a;

    @NotNull
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final String e;

    public h(@NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Date timestamp) throws IllegalArgumentException {
        Intrinsics.h(url, "url");
        Intrinsics.h(timestamp, "timestamp");
        this.f16849a = timestamp;
        this.b = a(url, "url", true);
        this.c = str != null ? a(str, "title", false) : null;
        this.d = str2 != null ? a(str2, "item", false) : null;
        this.e = str3 != null ? a(str3, "search", false) : null;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return com.salesforce.marketingcloud.analytics.b.s;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_endpoint", d());
        jSONObject.put("timestamp", m.a(e()));
        jSONObject.put("url", this.b);
        if (!TextUtils.isEmpty(this.c)) {
            jSONObject.put("title", this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            jSONObject.put("item", this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            jSONObject.put("search", this.e);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_view";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public Date e() {
        return this.f16849a;
    }

    @Nullable
    public final String f() {
        return this.d;
    }

    @Nullable
    public final String g() {
        return this.e;
    }

    @Nullable
    public final String h() {
        return this.c;
    }

    @NotNull
    public final String i() {
        return this.b;
    }
}
