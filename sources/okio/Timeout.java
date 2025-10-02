package okio;

import androidx.camera.core.impl.b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Timeout;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class Timeout {
    public static final Timeout$Companion$NONE$1 e = new Timeout$Companion$NONE$1();

    /* renamed from: a, reason: collision with root package name */
    public boolean f26784a;
    public long b;
    public long c;
    public volatile Object d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/Timeout$Companion;", "", "Lokio/Timeout;", "NONE", "Lokio/Timeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public void a() {
        this.d = new Object();
    }

    public Timeout b() {
        this.f26784a = false;
        return this;
    }

    public Timeout c() {
        this.c = 0L;
        return this;
    }

    public long d() {
        if (this.f26784a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public Timeout e(long j) {
        this.f26784a = true;
        this.b = j;
        return this;
    }

    /* renamed from: f, reason: from getter */
    public boolean getF26784a() {
        return this.f26784a;
    }

    public void g() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f26784a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout h(long j, TimeUnit unit) {
        Intrinsics.h(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "timeout < 0: ").toString());
        }
        this.c = unit.toNanos(j);
        return this;
    }

    /* renamed from: i, reason: from getter */
    public long getC() {
        return this.c;
    }
}
