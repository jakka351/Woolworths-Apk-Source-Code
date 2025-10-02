package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.VideoResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.zb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0950zb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0950zb f18290a = new C0950zb();

    public C0950zb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = C0540bc.o;
        CameraSettings cameraSettings = new CameraSettings();
        cameraSettings.setProperty("exposureTargetBias", -1);
        cameraSettings.setProperty("repeatedTriggerInterval", 1);
        cameraSettings.setProperty("stage1StandbyDuration", 4);
        cameraSettings.setProperty("usesApi2Features", Boolean.TRUE);
        cameraSettings.setProperty("regionStrategy", "spot");
        cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
        return cameraSettings;
    }
}
