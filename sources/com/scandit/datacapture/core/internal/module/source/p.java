package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CameraFactory f18590a;
    final /* synthetic */ CameraPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CameraFactory cameraFactory, CameraPosition cameraPosition) {
        super(1);
        this.f18590a = cameraFactory;
        this.b = cameraPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f18831a;
        FrameSourceState highPriorityState = (FrameSourceState) obj;
        Intrinsics.h(highPriorityState, "highPriorityState");
        Camera cameraA = this.f18590a.c.a(this.b);
        if (cameraA != null && (f18831a = cameraA.getF18831a()) != null) {
            f18831a.switchToPriorityStateAsyncAndroid(highPriorityState);
        }
        return Unit.f24250a;
    }
}
