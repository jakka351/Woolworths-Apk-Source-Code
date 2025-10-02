package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CameraSwitchControl f18909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CameraSwitchControl cameraSwitchControl) {
        super(0);
        this.f18909a = cameraSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CameraSwitchControl.access$toggleCamera(this.f18909a);
        return Unit.f24250a;
    }
}
