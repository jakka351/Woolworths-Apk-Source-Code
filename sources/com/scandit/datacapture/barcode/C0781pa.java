package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0781pa implements SparkScanAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanStateManager f17883a;
    private C0666i6 b;
    private C0589d9 c;
    private C0589d9 d;
    private C0589d9 e;
    private C0589d9 f;
    private C0589d9 g;
    private C0589d9 h;
    private C0589d9 i;

    public C0781pa(SparkScanStateManager stateManager) {
        Intrinsics.h(stateManager, "stateManager");
        this.f17883a = stateManager;
        this.b = new C0666i6();
        this.c = new C0589d9("torch_state");
        this.d = new C0589d9("sound_enabled");
        this.e = new C0589d9("haptic_enabled");
        this.f = new C0589d9("hand_mode");
        this.g = new C0589d9("session_stop_reason");
        this.h = new C0589d9("scanning_mode");
        this.i = new C0589d9("camera_position");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a() {
        synchronized (this) {
            C0666i6 c0666i6 = new C0666i6();
            this.b = c0666i6;
            c0666i6.a(this.f17883a.g().a((Nd) new C0750na(this.e)), this.f17883a.q().a((Nd) new C0766oa(this.d)), this.f17883a.d().a((Nd) new C0686ja(this.f)), this.f17883a.s().a((Nd) new C0702ka(this.c)), this.f17883a.o().a((Nd) new C0718la(this.h)), this.f17883a.b().a((Nd) new C0734ma(this.i)));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a(EnumC0828s9 stopReason) {
        Intrinsics.h(stopReason, "stopReason");
        synchronized (this) {
            C0589d9 c0589d9 = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "session_stop_reason");
            jSONObject.put("value", stopReason.a());
            c0589d9.a(jSONObject);
        }
        this.b.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final C0589d9 a(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1773044719:
                if (str.equals("sound_enabled")) {
                    return this.d;
                }
                return null;
            case -1404158567:
                if (str.equals("haptic_enabled")) {
                    return this.e;
                }
                return null;
            case -1137308018:
                if (str.equals("torch_state")) {
                    return this.c;
                }
                return null;
            case -77151997:
                if (str.equals("camera_position")) {
                    return this.i;
                }
                return null;
            case 52371315:
                if (str.equals("hand_mode")) {
                    return this.f;
                }
                return null;
            case 1101455473:
                if (str.equals("scanning_mode")) {
                    return this.h;
                }
                return null;
            case 1563988216:
                if (str.equals("session_stop_reason")) {
                    return this.g;
                }
                return null;
            default:
                return null;
        }
    }
}
