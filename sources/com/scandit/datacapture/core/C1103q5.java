package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1103q5 extends AbstractC1171y1 {
    public static final C1103q5 c;
    private static final String d;
    private static final K6 e;

    static {
        C1103q5 c1103q5 = new C1103q5();
        c = c1103q5;
        d = "sm-g350.*";
        e = K6.a(super.d(), false, BitmapDescriptorFactory.HUE_RED, false, false, 0, 123);
    }

    private C1103q5() {
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
        AbstractC1171y1.a(camParams, Math.max(e.e(), -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String b() {
        return d;
    }

    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final K6 d() {
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // com.scandit.datacapture.core.AbstractC1171y1, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Range a(android.util.Range[] r10, float r11) {
        /*
            r9 = this;
            java.lang.String r0 = "frameRateRanges"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            int r0 = r10.length
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r10.length
            r2 = 0
            r3 = r1
        Ld:
            if (r2 >= r0) goto L93
            r4 = r10[r2]
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L23
            int r5 = r5.intValue()
            float r5 = (float) r5
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L24
        L23:
            r5 = r1
        L24:
            float r5 = r5.floatValue()
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L2d
            goto L8f
        L2d:
            java.lang.Comparable r5 = r4.getLower()
            java.lang.String r6 = "fpsRange.lower"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r7 = 16000(0x3e80, float:2.2421E-41)
            if (r5 >= r7) goto L8f
            if (r3 == 0) goto L8e
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.String r7 = "fpsRange.upper"
            kotlin.jvm.internal.Intrinsics.g(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Comparable r7 = r3.getUpper()
            java.lang.String r8 = "best.upper"
            kotlin.jvm.internal.Intrinsics.g(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 > r7) goto L8e
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.Comparable r7 = r3.getUpper()
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r7)
            if (r5 == 0) goto L8f
            java.lang.Comparable r5 = r4.getLower()
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Comparable r6 = r3.getLower()
            java.lang.String r7 = "best.lower"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r5 <= r6) goto L8f
        L8e:
            r3 = r4
        L8f:
            int r2 = r2 + 1
            goto Ld
        L93:
            if (r3 == 0) goto L96
            return r3
        L96:
            android.util.Range r10 = com.scandit.datacapture.core.AbstractC1001f2.b(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.C1103q5.a(android.util.Range[], float):android.util.Range");
    }
}
