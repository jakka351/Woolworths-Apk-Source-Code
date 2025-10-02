package io.grpc.internal;

/* loaded from: classes7.dex */
public final class TransportTracer {
    public static final Factory c = new Factory();
    public final LongCounter b = LongCounterFactory.a();

    /* renamed from: a, reason: collision with root package name */
    public final TimeProvider f24113a = TimeProvider.f24111a;

    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final TimeProvider f24114a = TimeProvider.f24111a;
    }

    public interface FlowControlReader {
    }

    public static final class FlowControlWindows {
    }
}
