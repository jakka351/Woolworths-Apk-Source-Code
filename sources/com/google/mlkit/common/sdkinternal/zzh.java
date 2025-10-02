package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
final class zzh implements Executor {
    public static final zzh d;
    public static final /* synthetic */ zzh[] e;

    static {
        zzh zzhVar = new zzh("INSTANCE", 0);
        d = zzhVar;
        e = new zzh[]{zzhVar};
    }

    public static zzh[] values() {
        return (zzh[]) e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        MLTaskExecutor.a().f15981a.post(runnable);
    }
}
