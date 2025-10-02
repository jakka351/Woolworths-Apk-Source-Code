package com.scandit.datacapture.core;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativePreferredFrameRateRange;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1019h2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeCameraApi f18528a;
    final /* synthetic */ CameraProfile b;
    final /* synthetic */ Range[] c;
    final /* synthetic */ NativePreferredFrameRateRange d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019h2(CameraProfile cameraProfile, NativeCameraApi nativeCameraApi, NativePreferredFrameRateRange nativePreferredFrameRateRange, Range[] rangeArr) {
        super(1);
        this.f18528a = nativeCameraApi;
        this.b = cameraProfile;
        this.c = rangeArr;
        this.d = nativePreferredFrameRateRange;
    }

    public final Range a(float f) {
        int i;
        Range rangeA;
        NativeCameraApi nativeCameraApi = this.f18528a;
        Intrinsics.h(nativeCameraApi, "<this>");
        int[] iArr = AbstractC1010g2.f18523a;
        int i2 = iArr[nativeCameraApi.ordinal()];
        if (i2 == 1) {
            i = 1000;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        float f2 = f * i;
        CameraProfile cameraProfile = this.b;
        NativeCameraApi nativeCameraApi2 = this.f18528a;
        Range[] rangeArr = this.c;
        int i3 = iArr[nativeCameraApi2.ordinal()];
        if (i3 == 1) {
            rangeA = cameraProfile.a(rangeArr, f2);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rangeA = cameraProfile.b(rangeArr, f2);
        }
        if (rangeA != null) {
            return rangeA;
        }
        NativePreferredFrameRateRange nativePreferredFrameRateRange = this.d;
        Range[] rangeArr2 = this.c;
        int i4 = nativePreferredFrameRateRange == null ? -1 : AbstractC1010g2.b[nativePreferredFrameRateRange.ordinal()];
        return i4 != 1 ? i4 != 2 ? AbstractC1001f2.b(rangeArr2, f2) : AbstractC1001f2.b(rangeArr2, f2) : AbstractC1001f2.c(rangeArr2, f2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
