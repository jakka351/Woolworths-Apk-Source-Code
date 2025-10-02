package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0524ac extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0524ac(C0540bc c0540bc) {
        super(0);
        this.f17378a = c0540bc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        C0540bc.k.release();
    }

    public final void a() {
        Unit unit;
        Camera cameraG = this.f17378a.g();
        if (cameraG != null) {
            C0540bc c0540bc = this.f17378a;
            cameraG.applySettings(c0540bc.a(c0540bc.b.m(), this.f17378a.b.a()), new ef(1));
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            C0540bc.k.release();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f24250a;
    }
}
