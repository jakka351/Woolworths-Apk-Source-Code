package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f24929a;
    public Object b;
    public final Object c;

    public k(Function0 creator) {
        Intrinsics.h(creator, "creator");
        this.f24929a = creator;
        this.c = new Object();
    }

    @Override // me.oriient.internal.infra.di.g
    public final Object get() {
        Object obj;
        synchronized (this.c) {
            try {
                if (this.b == null) {
                    this.b = this.f24929a.invoke();
                }
                obj = this.b;
                Intrinsics.e(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
