package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Timeout$Companion$NONE$1", "Lokio/Timeout;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Timeout$Companion$NONE$1 extends Timeout {
    @Override // okio.Timeout
    public final Timeout e(long j) {
        return this;
    }

    @Override // okio.Timeout
    public final void g() {
    }

    @Override // okio.Timeout
    public final Timeout h(long j, TimeUnit unit) {
        Intrinsics.h(unit, "unit");
        return this;
    }
}
