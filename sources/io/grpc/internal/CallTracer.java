package io.grpc.internal;

/* loaded from: classes7.dex */
final class CallTracer {
    public final LongCounter b = LongCounterFactory.a();
    public final LongCounter c = LongCounterFactory.a();
    public final LongCounter d = LongCounterFactory.a();

    /* renamed from: a, reason: collision with root package name */
    public final TimeProvider f23991a = TimeProvider.f24111a;

    /* renamed from: io.grpc.internal.CallTracer$1, reason: invalid class name */
    public class AnonymousClass1 implements Factory {
    }

    public interface Factory {
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a();
        } else {
            this.d.a();
        }
    }
}
