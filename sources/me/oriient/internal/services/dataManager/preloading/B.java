package me.oriient.internal.services.dataManager.preloading;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions;

/* loaded from: classes7.dex */
public final class B extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final B f25363a = new B();

    public B() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FloorTransitions it = (FloorTransitions) obj;
        Intrinsics.h(it, "it");
        return Unit.f24250a;
    }
}
