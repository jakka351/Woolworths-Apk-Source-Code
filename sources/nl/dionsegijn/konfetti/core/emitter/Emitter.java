package nl.dionsegijn.konfetti.core.emitter;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/emitter/Emitter;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Emitter {

    /* renamed from: a, reason: collision with root package name */
    public final long f26641a;

    public Emitter(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.h(timeUnit, "timeUnit");
        this.f26641a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Emitter) || this.f26641a != ((Emitter) obj).f26641a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.MILLISECONDS.hashCode() + (Long.hashCode(this.f26641a) * 31);
    }

    public final String toString() {
        return "Emitter(duration=" + this.f26641a + ", timeUnit=" + TimeUnit.MILLISECONDS + ')';
    }
}
