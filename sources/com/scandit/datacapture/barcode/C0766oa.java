package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.oa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0766oa implements Nd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0589d9 f17873a;

    public C0766oa(C0589d9 c0589d9) {
        this.f17873a = c0589d9;
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object value) throws JSONException {
        Intrinsics.h(value, "value");
        C0589d9 c0589d9 = this.f17873a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", c0589d9.a());
        jSONObject.put("value", value);
        c0589d9.a(jSONObject);
    }
}
