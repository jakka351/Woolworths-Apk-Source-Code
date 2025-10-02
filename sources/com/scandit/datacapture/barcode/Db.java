package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Db implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0 f17138a;

    public Db(Function0 function0) {
        this.f17138a = function0;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(frame, "frame");
        if (frameSource.getCurrentState() == FrameSourceState.ON) {
            frameSource.removeListener(this);
            this.f17138a.invoke();
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStarted(FrameSource frameSource) {
        FrameSourceListener.DefaultImpls.onObservationStarted(this, frameSource);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStopped(FrameSource frameSource) {
        FrameSourceListener.DefaultImpls.onObservationStopped(this, frameSource);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onStateChanged(FrameSource frameSource, FrameSourceState frameSourceState) {
        FrameSourceListener.DefaultImpls.onStateChanged(this, frameSource, frameSourceState);
    }
}
