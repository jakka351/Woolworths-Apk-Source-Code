package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.serialization.SparkScanViewHandModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0686ja implements Nd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0589d9 f17822a;

    public C0686ja(C0589d9 c0589d9) {
        this.f17822a = c0589d9;
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object value) throws JSONException {
        Intrinsics.h(value, "value");
        C0589d9 c0589d9 = this.f17822a;
        String json = SparkScanViewHandModeSerializer.toJson((SparkScanViewHandMode) value);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", c0589d9.a());
        jSONObject.put("value", json);
        c0589d9.a(jSONObject);
    }
}
