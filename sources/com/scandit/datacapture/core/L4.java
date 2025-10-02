package com.scandit.datacapture.core;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L4 implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    private final Set f18342a;
    private final Function1 b;

    public L4(Set wantedStates, Function1 action) {
        Intrinsics.h(wantedStates, "wantedStates");
        Intrinsics.h(action, "action");
        this.f18342a = wantedStates;
        this.b = action;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frameData) {
        FrameSourceListener.DefaultImpls.onFrameOutput(this, frameSource, frameData);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStarted(FrameSource frameSource) {
        Intrinsics.h(frameSource, "frameSource");
        if (this.f18342a.contains(frameSource.getCurrentState())) {
            this.b.invoke(frameSource);
            frameSource.removeListener(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStopped(FrameSource frameSource) {
        Intrinsics.h(frameSource, "frameSource");
        frameSource.removeListener(this);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onStateChanged(FrameSource frameSource, FrameSourceState newState) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(newState, "newState");
        if (this.f18342a.contains(frameSource.getCurrentState())) {
            this.b.invoke(frameSource);
            frameSource.removeListener(this);
        }
    }
}
