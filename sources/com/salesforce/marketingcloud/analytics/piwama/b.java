package com.salesforce.marketingcloud.analytics.piwama;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f16844a;

    public b(@NotNull Date timestamp) {
        Intrinsics.h(timestamp, "timestamp");
        this.f16844a = timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "app_close";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return 0;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_event";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public Date e() {
        return this.f16844a;
    }
}
