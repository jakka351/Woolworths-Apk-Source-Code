package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case 0:
                ArchTaskExecutor.d().c(runnable);
                break;
            case 1:
                ArchTaskExecutor.d().f199a.b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
