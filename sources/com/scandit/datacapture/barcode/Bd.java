package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Bd extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Gd f17111a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Gd gd) {
        super(0);
        this.f17111a = gd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17111a.f.b(new Ad(this.f17111a));
    }
}
