package androidx.media3.exoplayer.util;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@UnstableApi
/* loaded from: classes2.dex */
public interface ReleasableExecutor extends Executor {
    static ReleasableExecutor a1(final ExecutorService executorService, final c cVar) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                executorService.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public final void release() {
                cVar.accept(executorService);
            }
        };
    }

    void release();
}
