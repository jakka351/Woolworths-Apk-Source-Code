package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CameraFactory f18589a;
    final /* synthetic */ CameraPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CameraFactory cameraFactory, CameraPosition cameraPosition) {
        super(1);
        this.f18589a = cameraFactory;
        this.b = cameraPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f18831a;
        NativeCameraFrameData frameData = (NativeCameraFrameData) obj;
        Intrinsics.h(frameData, "frameData");
        Camera cameraA = this.f18589a.c.a(this.b);
        if (cameraA != null && (f18831a = cameraA.getF18831a()) != null) {
            f18831a.onFrameOutputAndroid(frameData);
        }
        return Unit.f24250a;
    }
}
