package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.VideoResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.yb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0935yb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0935yb f18275a = new C0935yb();

    public C0935yb() {
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
        cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
        return cameraSettings;
    }
}
