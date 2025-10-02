package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.VideoResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0920xb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0920xb f18264a = new C0920xb();

    public C0920xb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CameraSettings cameraSettings = new CameraSettings();
        cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
        cameraSettings.setZoomFactor(1.0f);
        cameraSettings.setProperty("exposureTargetBias", -1);
        cameraSettings.setProperty("repeatedTriggerInterval", 1);
        cameraSettings.setProperty("stage1StandbyDuration", 4);
        cameraSettings.setProperty("usesApi2Features", Boolean.TRUE);
        return cameraSettings;
    }
}
