package com.scandit.datacapture.core;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1018h1 {
    private static final ColorSpaceTransform c = new ColorSpaceTransform(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1});

    /* renamed from: a, reason: collision with root package name */
    private RggbChannelVector f18527a;
    private boolean b;

    public final void a(C1035j0 result) {
        Intrinsics.h(result, "result");
        this.f18527a = result.b();
    }

    public final void a(C0959a5 requestSettings, boolean z) {
        Intrinsics.h(requestSettings, "requestSettings");
        if (z || this.b) {
            if (z && this.b) {
                Log.i("sdc-core", "CAMCTRL CONTROL_AWB_MODE_AUTO");
                a(requestSettings, 1);
                return;
            }
            return;
        }
        this.b = true;
        Log.i("sdc-core", "CAMCTRL CONTROL_AWB_MODE_OFF");
        RggbChannelVector rggbChannelVector = this.f18527a;
        if (rggbChannelVector == null) {
            rggbChannelVector = new RggbChannelVector(1.0f, 1.0f, 1.0f, 1.0f);
        }
        a(requestSettings, 0);
        CaptureRequest.Key key = CaptureRequest.COLOR_CORRECTION_MODE;
        AbstractC1009g1.a(key, "COLOR_CORRECTION_MODE", 0, requestSettings, key);
        CaptureRequest.Key COLOR_CORRECTION_GAINS = CaptureRequest.COLOR_CORRECTION_GAINS;
        Intrinsics.g(COLOR_CORRECTION_GAINS, "COLOR_CORRECTION_GAINS");
        requestSettings.a(COLOR_CORRECTION_GAINS, rggbChannelVector);
        CaptureRequest.Key COLOR_CORRECTION_TRANSFORM = CaptureRequest.COLOR_CORRECTION_TRANSFORM;
        Intrinsics.g(COLOR_CORRECTION_TRANSFORM, "COLOR_CORRECTION_TRANSFORM");
        requestSettings.a(COLOR_CORRECTION_TRANSFORM, c);
    }

    public final void a(C0959a5 requestSettings, int i) {
        Intrinsics.h(requestSettings, "requestSettings");
        CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
        AbstractC1009g1.a(key, "CONTROL_AWB_MODE", i, requestSettings, key);
        if (i == 1) {
            this.b = false;
        }
    }
}
