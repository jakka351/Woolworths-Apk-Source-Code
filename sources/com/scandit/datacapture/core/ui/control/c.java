package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureContext f18911a;
    final /* synthetic */ FrameSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataCaptureContext dataCaptureContext, Camera camera) {
        super(0);
        this.f18911a = dataCaptureContext;
        this.b = camera;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DataCaptureContext.setFrameSource$default(this.f18911a, this.b, null, 2, null);
        FrameSource frameSource = this.b;
        if (frameSource != null) {
            FrameSource.DefaultImpls.switchToDesiredState$default(frameSource, FrameSourceState.ON, null, 2, null);
        }
        return Unit.f24250a;
    }
}
