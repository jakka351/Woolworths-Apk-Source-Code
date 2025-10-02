package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Kb extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17218a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kb(C0540bc c0540bc) {
        super(0);
        this.f17218a = c0540bc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        C0540bc.k.release();
    }

    public final void a() {
        C0540bc.a(this.f17218a, Jb.f17208a[this.f17218a.b.a().ordinal()] == 1 ? this.f17218a.f : this.f17218a.e, new ef(0));
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f24250a;
    }
}
