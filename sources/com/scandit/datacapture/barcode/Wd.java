package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Wd extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yd f17338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(Yd yd) {
        super(0);
        this.f17338a = yd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17338a.c.b(new Vd(this.f17338a));
    }
}
