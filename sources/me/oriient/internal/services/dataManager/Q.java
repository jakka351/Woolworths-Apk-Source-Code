package me.oriient.internal.services.dataManager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Object obj) {
        super(1);
        this.f25081a = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.h(it, "it");
        return this.f25081a;
    }
}
