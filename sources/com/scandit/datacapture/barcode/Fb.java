package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Fb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17161a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(C0540bc c0540bc, Function0 function0) {
        super(0);
        this.f17161a = c0540bc;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        Camera cameraG = this.f17161a.g();
        Unit unit2 = Unit.f24250a;
        if (cameraG != null) {
            FrameSourceState frameSourceState = FrameSourceState.STANDBY;
            C0540bc c0540bc = this.f17161a;
            Eb eb = new Eb(this.b);
            c0540bc.getClass();
            cameraG.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new Ib(c0540bc, eb)));
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            C0540bc.a(this.f17161a, this.b);
        }
        return unit2;
    }
}
