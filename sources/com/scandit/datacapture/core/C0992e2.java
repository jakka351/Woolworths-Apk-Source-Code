package com.scandit.datacapture.core;

import android.media.Image;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0992e2 implements InterfaceC0983d2 {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f18487a;
    private AtomicReference b;
    private final U c;

    public C0992e2(F0 cameraInfo) {
        Intrinsics.h(cameraInfo, "cameraInfo");
        this.f18487a = cameraInfo;
        this.b = new AtomicReference();
        this.c = new U(cameraInfo.w());
    }

    public final void a(C1035j0 captureResult) {
        Intrinsics.h(captureResult, "captureResult");
        this.b.set(captureResult);
    }

    public final void a(Image image, long j, Function1 onFrame) {
        Intrinsics.h(image, "image");
        Intrinsics.h(onFrame, "onFrame");
        NativeCameraFrameData nativeCameraFrameDataA = this.c.a(image, (InterfaceC1026i0) this.b.get(), ((F0) this.f18487a).h(), ((F0) this.f18487a).x(), ((F0) this.f18487a).d(), Long.valueOf(j));
        if (nativeCameraFrameDataA != null) {
            nativeCameraFrameDataA.retain();
            try {
                onFrame.invoke(nativeCameraFrameDataA);
            } finally {
                nativeCameraFrameDataA.release();
            }
        }
    }
}
