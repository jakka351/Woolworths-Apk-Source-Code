package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class T extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f18374a;
    final /* synthetic */ InterfaceC1026i0 b;
    final /* synthetic */ V c;
    final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u, InterfaceC1026i0 interfaceC1026i0, V v, Long l) {
        super(1);
        this.f18374a = u;
        this.b = interfaceC1026i0;
        this.c = v;
        this.d = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCameraCaptureParameters updateFrameData = (NativeCameraCaptureParameters) obj;
        Intrinsics.h(updateFrameData, "$this$updateFrameData");
        U.a(this.f18374a, updateFrameData, this.b, this.c);
        V cameraInfo = this.c;
        Intrinsics.h(cameraInfo, "cameraInfo");
        NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
        int iC = ((W4) cameraInfo).c();
        updateFrameData.insertInt64(nativeCameraCaptureParameterKey, iC != 0 ? iC != 1 ? -1L : 1L : 2L);
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.LENS_FOCUS_CALIBRATION, r0.d());
        Long l = this.d;
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.DELAY_BETWEEN_YUV_AND_PREVIEW, l != null ? l.longValue() : 0L);
        return Unit.f24250a;
    }
}
