package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CameraSwitchControl f18910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CameraSwitchControl cameraSwitchControl) {
        super(0);
        this.f18910a = cameraSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CameraSwitchControl.access$setupViewForCurrentCamera(this.f18910a);
        return Unit.f24250a;
    }
}
