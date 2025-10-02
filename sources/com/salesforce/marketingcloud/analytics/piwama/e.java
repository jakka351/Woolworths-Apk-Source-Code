package com.salesforce.marketingcloud.analytics.piwama;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f16846a;
    private final boolean b;

    @NotNull
    private final List<String> c;

    public e(@NotNull Date timestamp, boolean z, @NotNull List<String> objectIds) {
        Intrinsics.h(timestamp, "timestamp");
        Intrinsics.h(objectIds, "objectIds");
        this.f16846a = timestamp;
        this.b = z;
        this.c = objectIds;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "app_open";
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
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open_from_push", this.b);
        if (!this.c.isEmpty()) {
            jSONObject2.put("message_ids", new JSONArray((Collection) this.c));
        }
        jSONObject.put(ErrorBundle.DETAIL_ENTRY, jSONObject2);
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
        return this.f16846a;
    }
}
