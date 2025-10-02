package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0734ma implements Nd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0589d9 f17850a;

    public C0734ma(C0589d9 c0589d9) {
        this.f17850a = c0589d9;
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object value) throws JSONException {
        Intrinsics.h(value, "value");
        C0589d9 c0589d9 = this.f17850a;
        String json = CameraPositionSerializer.toJson((CameraPosition) value);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", c0589d9.a());
        jSONObject.put("value", json);
        c0589d9.a(jSONObject);
    }
}
