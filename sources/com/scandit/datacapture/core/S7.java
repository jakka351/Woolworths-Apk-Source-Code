package com.scandit.datacapture.core;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.TonemapCurve;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S7 {
    private static final float[] b = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    private static final float[] c = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.0667f, 0.292f, 0.1333f, 0.4002f, 0.2f, 0.4812f, 0.2667f, 0.5484f, 0.3333f, 0.6069f, 0.4f, 0.6594f, 0.4667f, 0.7072f, 0.5333f, 0.7515f, 0.6f, 0.7928f, 0.6667f, 0.8317f, 0.7333f, 0.8685f, 0.8f, 0.9035f, 0.8667f, 0.937f, 0.9333f, 0.9691f, 1.0f, 1.0f};
    private static final float[] d = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.0667f, 0.292f, 0.1333f, 0.4002f, 0.2f, 0.4812f, 0.2667f, 0.5484f, 0.3333f, 0.6069f, 0.4f, 0.6594f, 0.4667f, 0.7072f, 0.5333f, 0.7515f, 0.6f, 0.7928f, 0.6667f, 0.8317f, 0.7333f, 0.8685f, 0.8f, 0.9035f, 0.8667f, 0.937f, 0.9333f, 0.9691f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private NativeTonemapCurve f18373a = NativeTonemapCurve.NONE;

    public final void a(C0959a5 requestSettings, NativeTonemapCurve toneMappingCurve) throws Exception {
        Intrinsics.h(requestSettings, "requestSettings");
        Intrinsics.h(toneMappingCurve, "toneMappingCurve");
        if (this.f18373a != toneMappingCurve) {
            this.f18373a = toneMappingCurve;
            if (toneMappingCurve == NativeTonemapCurve.NONE) {
                try {
                    CaptureRequest.Key TONEMAP_MODE = CaptureRequest.TONEMAP_MODE;
                    Intrinsics.g(TONEMAP_MODE, "TONEMAP_MODE");
                    requestSettings.a(TONEMAP_MODE, (Object) 1);
                    return;
                } catch (Exception e) {
                    O3.a("Exception caught in listener method. Rethrowing...", e);
                    throw e;
                }
            }
            int i = R7.f18369a[toneMappingCurve.ordinal()];
            float[] fArr = i != 1 ? i != 2 ? i != 3 ? null : d : c : b;
            TonemapCurve tonemapCurve = fArr != null ? new TonemapCurve(fArr, fArr, fArr) : null;
            if (tonemapCurve != null) {
                try {
                    CaptureRequest.Key TONEMAP_MODE2 = CaptureRequest.TONEMAP_MODE;
                    Intrinsics.g(TONEMAP_MODE2, "TONEMAP_MODE");
                    requestSettings.a(TONEMAP_MODE2, (Object) 0);
                    CaptureRequest.Key TONEMAP_CURVE = CaptureRequest.TONEMAP_CURVE;
                    Intrinsics.g(TONEMAP_CURVE, "TONEMAP_CURVE");
                    requestSettings.a(TONEMAP_CURVE, tonemapCurve);
                } catch (Exception e2) {
                    O3.a("Exception caught in listener method. Rethrowing...", e2);
                    throw e2;
                }
            }
        }
    }
}
