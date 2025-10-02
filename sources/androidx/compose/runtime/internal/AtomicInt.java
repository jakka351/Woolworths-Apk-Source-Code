package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AtomicInt extends AtomicInteger {
    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) super.intValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) super.intValue();
    }
}
