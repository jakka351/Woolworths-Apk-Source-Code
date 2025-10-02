package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class O extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O f26219a = new O();

    public O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", "At least 2 waypoints are necessary to calculate a route");
    }
}
