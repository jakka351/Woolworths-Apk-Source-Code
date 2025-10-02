package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public final class AtomicBackoff {
    public static final Logger c = Logger.getLogger(AtomicBackoff.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f23982a;
    public final AtomicLong b;

    @ThreadSafe
    public final class State {

        /* renamed from: a, reason: collision with root package name */
        public final long f23983a;

        public State(long j) {
            this.f23983a = j;
        }
    }

    public AtomicBackoff(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        Preconditions.f("value must be positive", j > 0);
        this.f23982a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
