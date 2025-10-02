package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0750na implements Nd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0589d9 f17862a;

    public C0750na(C0589d9 c0589d9) {
        this.f17862a = c0589d9;
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object value) throws JSONException {
        Intrinsics.h(value, "value");
        C0589d9 c0589d9 = this.f17862a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", c0589d9.a());
        jSONObject.put("value", value);
        c0589d9.a(jSONObject);
    }
}
