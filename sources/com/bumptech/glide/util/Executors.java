package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class Executors {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f13983a = new AnonymousClass1();
    public static final Executor b = new AnonymousClass2();

    /* renamed from: com.bumptech.glide.util.Executors$1, reason: invalid class name */
    public class AnonymousClass1 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Util.f().post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.util.Executors$2, reason: invalid class name */
    public class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
