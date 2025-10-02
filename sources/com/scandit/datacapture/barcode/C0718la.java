package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0718la implements Nd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0589d9 f17840a;

    public C0718la(C0589d9 c0589d9) {
        this.f17840a = c0589d9;
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object value) throws JSONException {
        Intrinsics.h(value, "value");
        C0589d9 c0589d9 = this.f17840a;
        JSONObject jSONObject = new JSONObject(SparkScanScanningModeSerializer.toJson((SparkScanScanningMode) value));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("key", c0589d9.a());
        jSONObject2.put("value", jSONObject);
        c0589d9.a(jSONObject2);
    }
}
