package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ob extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17260a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ob(C0540bc c0540bc, Function0 function0) {
        super(0);
        this.f17260a = c0540bc;
        this.b = function0;
    }

    public final void a() {
        Unit unit;
        Camera cameraG = this.f17260a.g();
        if (cameraG != null) {
            C0540bc c0540bc = this.f17260a;
            cameraG.applySettings(c0540bc.a(c0540bc.b.m(), this.f17260a.b.a()), new jf(this.f17260a, this.b, 0));
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            C0540bc.a(this.f17260a, this.b);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0540bc this$0, Function0 whenDone) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(whenDone, "$whenDone");
        Camera cameraG = this$0.g();
        if (cameraG != null) {
            cameraG.switchToDesiredState(FrameSourceState.STANDBY, LambdaExtensionsKt.Callback(new Nb(this$0, whenDone)));
        }
    }
}
