package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0771p0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0789q0 f17876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771p0(C0789q0 c0789q0) {
        super(0);
        this.f17876a = c0789q0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Camera.Companion companion = Camera.INSTANCE;
        Camera defaultCamera$default = Camera.Companion.getDefaultCamera$default(companion, null, 1, null);
        if (defaultCamera$default != null) {
            FrameSourceState currentState = defaultCamera$default.getCurrentState();
            FrameSourceState frameSourceState = FrameSourceState.OFF;
            if (currentState != frameSourceState) {
                defaultCamera$default.switchToDesiredState(frameSourceState);
                defaultCamera$default.getF18831a().flushPendingTasks();
            }
        }
        return companion.getDefaultCamera(this.f17876a.e());
    }
}
