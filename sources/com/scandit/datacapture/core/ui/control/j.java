package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TorchSwitchControl f18918a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TorchSwitchControl torchSwitchControl) {
        super(0);
        this.f18918a = torchSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TorchSwitchControl.access$showImageForCurrentTorchState(this.f18918a);
        return Unit.f24250a;
    }
}
