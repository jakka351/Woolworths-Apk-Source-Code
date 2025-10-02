package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ForwardingTimeout extends Timeout {
    public Timeout f;

    public ForwardingTimeout(Timeout delegate) {
        Intrinsics.h(delegate, "delegate");
        this.f = delegate;
    }

    @Override // okio.Timeout
    public final Timeout b() {
        return this.f.b();
    }

    @Override // okio.Timeout
    public final Timeout c() {
        return this.f.c();
    }

    @Override // okio.Timeout
    public final long d() {
        return this.f.d();
    }

    @Override // okio.Timeout
    public final Timeout e(long j) {
        return this.f.e(j);
    }

    @Override // okio.Timeout
    /* renamed from: f */
    public final boolean getF26784a() {
        return this.f.getF26784a();
    }

    @Override // okio.Timeout
    public final void g() throws InterruptedIOException {
        this.f.g();
    }

    @Override // okio.Timeout
    public final Timeout h(long j, TimeUnit unit) {
        Intrinsics.h(unit, "unit");
        return this.f.h(j, unit);
    }

    @Override // okio.Timeout
    /* renamed from: i */
    public final long getC() {
        return this.f.getC();
    }
}
