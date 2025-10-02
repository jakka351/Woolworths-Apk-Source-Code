package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1106r extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18824a;

    public C1106r(C1115s parent) {
        Intrinsics.h(parent, "parent");
        this.f18824a = new WeakReference(parent);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData frameData) {
        Intrinsics.h(frameData, "frameData");
        C1115s c1115s = (C1115s) this.f18824a.get();
        if (c1115s != null) {
            c1115s.a(frameData);
        }
    }
}
