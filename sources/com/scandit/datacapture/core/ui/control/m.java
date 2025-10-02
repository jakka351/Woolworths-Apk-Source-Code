package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ZoomSwitchControl f18920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ZoomSwitchControl zoomSwitchControl) {
        super(0);
        this.f18920a = zoomSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ZoomSwitchControl.access$toggleZoom(this.f18920a);
        return Unit.f24250a;
    }
}
