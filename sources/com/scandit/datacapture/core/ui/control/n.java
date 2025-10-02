package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ZoomSwitchControl f18921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ZoomSwitchControl zoomSwitchControl) {
        super(0);
        this.f18921a = zoomSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ZoomSwitchControl.access$showImageForCurrentState(this.f18921a);
        return Unit.f24250a;
    }
}
