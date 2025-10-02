package io.grpc.internal;

import io.grpc.StreamTracer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public final class StatsTraceContext {

    /* renamed from: a, reason: collision with root package name */
    public final StreamTracer[] f24108a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    static {
        new StatsTraceContext(new StreamTracer[0]);
    }

    public StatsTraceContext(StreamTracer[] streamTracerArr) {
        this.f24108a = streamTracerArr;
    }

    public final void a(long j) {
        for (StreamTracer streamTracer : this.f24108a) {
            streamTracer.d(j);
        }
    }
}
