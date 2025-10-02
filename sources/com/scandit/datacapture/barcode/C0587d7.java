package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.d7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0587d7 implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f17595a;

    public C0587d7(Function1 block) {
        Intrinsics.h(block, "block");
        this.f17595a = block;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(frame, "frame");
        if (frameSource.getCurrentState() != FrameSourceState.ON) {
            return;
        }
        ImageBuffer imageBuffer = frame.getImageBuffer();
        int width = imageBuffer.getWidth();
        if (imageBuffer.getHeight() <= 0 || width <= 0) {
            return;
        }
        frameSource.removeListener(this);
        this.f17595a.invoke(frame);
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
