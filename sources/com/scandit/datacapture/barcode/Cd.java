package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Cd extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Gd f17125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(Gd gd) {
        super(2);
        this.f17125a = gd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Boolean bool2 = (Boolean) obj2;
        bool2.booleanValue();
        this.f17125a.a().invoke(bool, bool2);
        return Unit.f24250a;
    }
}
