package com.scandit.datacapture.core;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* renamed from: com.scandit.datacapture.core.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1171y1 implements CameraProfile {

    /* renamed from: a, reason: collision with root package name */
    private final K6 f18992a = new K6();
    private final H0 b = new H0();

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range b(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean c() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public K6 d() {
        return this.f18992a;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean e() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean f() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean g() {
        return I0.c();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean h() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeFocusStrategy i() {
        return I0.a();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean j() {
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeCameraApi k() {
        return I0.b();
    }

    public final H0 l() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public void a(Camera.Parameters camParams) {
        Intrinsics.h(camParams, "camParams");
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range a(Range[] frameRateRanges, float f) {
        Intrinsics.h(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean a(String model) {
        Intrinsics.h(model, "model");
        String strB = b();
        RegexOption regexOption = RegexOption.e;
        return new Regex(strB, 0).f(model);
    }

    public static void a(Camera.Parameters camParams, float f) {
        Intrinsics.h(camParams, "camParams");
        float exposureCompensationStep = camParams.getExposureCompensationStep();
        camParams.setExposureCompensation(Math.min(camParams.getMaxExposureCompensation(), Math.max(camParams.getMinExposureCompensation(), Math.round(f / exposureCompensationStep))));
    }
}
