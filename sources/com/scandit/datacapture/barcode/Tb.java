package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Tb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17308a;
    final /* synthetic */ Callback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(C0540bc c0540bc, Callback callback) {
        super(0);
        this.f17308a = c0540bc;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        Camera cameraG = this.f17308a.g();
        Unit unit2 = Unit.f24250a;
        if (cameraG != null) {
            FrameSourceState frameSourceState = FrameSourceState.OFF;
            C0540bc c0540bc = this.f17308a;
            Rb rb = new Rb(this.b);
            c0540bc.getClass();
            cameraG.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new Ib(c0540bc, rb)));
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            C0540bc.a(this.f17308a, new Sb(this.b));
        }
        return unit2;
    }
}
