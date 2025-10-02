package me.oriient.internal.infra.utils.core.coroutines;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final int f25000a;

    public a(int i) {
        this.f25000a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.h(runnable, "runnable");
        Thread thread = new Thread(runnable);
        thread.setPriority(this.f25000a);
        return thread;
    }
}
