package me.oriient.navigation.ondevice;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f26362a = new y();

    public y() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NavigationOutput it = (NavigationOutput) obj;
        Intrinsics.h(it, "it");
        return it.toRouteCore();
    }
}
