package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Zb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17369a;
    final /* synthetic */ Callback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zb(C0540bc c0540bc, Callback callback) {
        super(0);
        this.f17369a = c0540bc;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        InterfaceC0799qa interfaceC0799qaI;
        Camera cameraG = this.f17369a.g();
        Unit unit2 = Unit.f24250a;
        if (cameraG != null) {
            C0540bc c0540bc = this.f17369a;
            Callback callback = this.b;
            FrameSourceState currentState = cameraG.getCurrentState();
            FrameSourceState frameSourceState = FrameSourceState.ON;
            if (currentState != frameSourceState && (interfaceC0799qaI = c0540bc.i()) != null) {
                interfaceC0799qaI.onCameraOnStart();
            }
            Wb wb = new Wb(c0540bc);
            c0540bc.getClass();
            cameraG.addListener(new Db(wb));
            cameraG.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new Ib(c0540bc, new Xb(callback))));
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            C0540bc.a(this.f17369a, new Yb(this.b));
        }
        return unit2;
    }
}
