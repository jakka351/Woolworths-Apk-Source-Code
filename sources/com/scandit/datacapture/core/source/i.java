package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSourceListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class i implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18854a;

    public i(SequenceFrameSource owner) {
        Intrinsics.h(owner, "owner");
        this.f18854a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(frame, "frame");
        SequenceFrameSource sequenceFrameSource = (SequenceFrameSource) this.f18854a.get();
        if (sequenceFrameSource == null || (copyOnWriteArraySet = sequenceFrameSource.h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FrameSourceListener) it.next()).onFrameOutput(frameSource, frame);
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
    public final void onStateChanged(FrameSource frameSource, FrameSourceState newState) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(newState, "newState");
        SequenceFrameSource sequenceFrameSource = (SequenceFrameSource) this.f18854a.get();
        if (sequenceFrameSource == null || (copyOnWriteArraySet = sequenceFrameSource.h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FrameSourceListener) it.next()).onStateChanged(frameSource, newState);
        }
    }
}
