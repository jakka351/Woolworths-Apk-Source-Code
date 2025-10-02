package com.scandit.datacapture.core;

import android.os.Handler;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.l7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1060l7 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1037j2 f18797a;
    final /* synthetic */ int b;
    final /* synthetic */ Handler c;
    final /* synthetic */ InterfaceC1033i7 d;
    final /* synthetic */ Subscription e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1060l7(C1037j2 c1037j2, int i, Handler handler, E e, Subscription subscription) {
        super(1);
        this.f18797a = c1037j2;
        this.b = i;
        this.c = handler;
        this.d = e;
        this.e = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.a(new C1051k7(this.c, this.d, this.e), this.f18797a.d(), this.f18797a.b(), this.b);
        return Unit.f24250a;
    }
}
