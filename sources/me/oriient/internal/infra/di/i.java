package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f24927a;

    public i(Function0 creator) {
        Intrinsics.h(creator, "creator");
        this.f24927a = creator;
    }

    @Override // me.oriient.internal.infra.di.g
    public final Object get() {
        return this.f24927a.invoke();
    }
}
