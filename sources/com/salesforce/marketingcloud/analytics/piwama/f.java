package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.analytics.PiCart;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PiCart f16847a;

    @NotNull
    private final Date b;

    public f(@NotNull PiCart piCart, @NotNull Date timestamp) {
        Intrinsics.h(piCart, "piCart");
        Intrinsics.h(timestamp, "timestamp");
        this.f16847a = piCart;
        this.b = timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return com.salesforce.marketingcloud.analytics.b.r;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        if (this.f16847a.cartItems().isEmpty()) {
            jSONObject.put("clear_cart", true);
            return jSONObject;
        }
        jSONObject.put("cart", this.f16847a.m85toJson());
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_cart";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public Date e() {
        return this.b;
    }
}
