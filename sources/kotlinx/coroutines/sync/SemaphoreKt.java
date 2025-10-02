package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemaphoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24749a = SystemPropsKt.d(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final Symbol b = new Symbol("PERMIT");
    public static final Symbol c = new Symbol("TAKEN");
    public static final Symbol d = new Symbol("BROKEN");
    public static final Symbol e = new Symbol("CANCELLED");
    public static final int f = SystemPropsKt.d(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    public static Semaphore a(int i) {
        return new SemaphoreImpl(i, 0);
    }
}
