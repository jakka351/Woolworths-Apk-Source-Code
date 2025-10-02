package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class j extends NativeCameraFrameDataPool {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18855a;

    public j(SequenceFrameSource owner) {
        Intrinsics.h(owner, "owner");
        this.f18855a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool
    public final void returnToPool(NativeCameraFrameData frameData) {
        Intrinsics.h(frameData, "frameData");
        SequenceFrameSource sequenceFrameSource = (SequenceFrameSource) this.f18855a.get();
        if (sequenceFrameSource != null) {
            SequenceFrameSource.access$returnToPool(sequenceFrameSource, frameData);
        }
    }
}
