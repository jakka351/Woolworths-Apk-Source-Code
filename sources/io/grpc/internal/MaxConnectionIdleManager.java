package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;

/* loaded from: classes7.dex */
public final class MaxConnectionIdleManager {

    /* renamed from: io.grpc.internal.MaxConnectionIdleManager$1, reason: invalid class name */
    public class AnonymousClass1 implements Ticker {
    }

    /* renamed from: io.grpc.internal.MaxConnectionIdleManager$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @VisibleForTesting
    public interface Ticker {
    }
}
