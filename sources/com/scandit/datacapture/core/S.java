package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class S extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18370a;

    public S(U parent) {
        Intrinsics.h(parent, "parent");
        this.f18370a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData frameData) {
        Intrinsics.h(frameData, "frameData");
        U u = (U) this.f18370a.get();
        if (u != null) {
            U.a(u, frameData);
        }
    }
}
