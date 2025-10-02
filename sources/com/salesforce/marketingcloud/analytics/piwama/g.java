package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.analytics.PiOrder;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PiOrder f16848a;

    @NotNull
    private final Date b;

    public g(@NotNull PiOrder piOrder, @NotNull Date timestamp) {
        Intrinsics.h(piOrder, "piOrder");
        Intrinsics.h(timestamp, "timestamp");
        this.f16848a = piOrder;
        this.b = timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return com.salesforce.marketingcloud.analytics.b.q;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        PiOrder piOrder = this.f16848a;
        jSONObject.put("shipping", piOrder.shipping());
        jSONObject.put("order_number", piOrder.orderNumber());
        jSONObject.put("discount", piOrder.discount());
        jSONObject.put("cart", piOrder.cart().m85toJson());
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_conversion";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public Date e() {
        return this.b;
    }
}
