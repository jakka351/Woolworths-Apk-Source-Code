package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TorchSwitchControl f18917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TorchSwitchControl torchSwitchControl) {
        super(0);
        this.f18917a = torchSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Camera camera = this.f18917a.f;
        if (camera != null) {
            TorchSwitchControl.access$toggleTorchOnOff(this.f18917a, camera);
        }
        return Unit.f24250a;
    }
}
