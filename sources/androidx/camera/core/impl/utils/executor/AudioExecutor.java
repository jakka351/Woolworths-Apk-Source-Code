package androidx.camera.core.impl.utils.executor;

import androidx.camera.camera2.interop.d;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class AudioExecutor implements Executor {

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1, reason: invalid class name */
    public class AnonymousClass1 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            new Thread(new d(runnable, 4));
            Locale locale = Locale.US;
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        throw null;
    }
}
