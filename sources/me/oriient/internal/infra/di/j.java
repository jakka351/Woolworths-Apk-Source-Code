package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f24928a;
    public Object b;

    public j(Function0 creator) {
        Intrinsics.h(creator, "creator");
        this.f24928a = creator;
    }

    @Override // me.oriient.internal.infra.di.g
    public final Object get() {
        if (this.b == null) {
            this.b = this.f24928a.invoke();
        }
        Object obj = this.b;
        Intrinsics.e(obj);
        return obj;
    }
}
