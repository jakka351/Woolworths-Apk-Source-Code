package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Qb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17282a;
    final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(C0540bc c0540bc, Function0 function0) {
        super(0);
        this.f17282a = c0540bc;
        this.b = function0;
    }

    public final void a() {
        Camera cameraG = this.f17282a.g();
        Camera camera = Intrinsics.c(cameraG, this.f17282a.e) ? this.f17282a.f : Intrinsics.c(cameraG, this.f17282a.f) ? this.f17282a.e : this.f17282a.e;
        if (camera != null) {
            C0540bc c0540bc = this.f17282a;
            camera._applySettings(c0540bc.a(c0540bc.b.m(), camera.getPosition()));
        }
        this.f17282a.h().setFrameSource(camera, new jf(this.f17282a, this.b, 1));
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0540bc this$0, Function0 onDone) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(onDone, "$onDone");
        C0540bc.a(this$0, new Pb(onDone));
    }
}
