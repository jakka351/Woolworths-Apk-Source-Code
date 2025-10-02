package kotlinx.atomicfu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/atomicfu/AtomicLong;", "", "", "value", "J", "getValue", "()J", "setValue", "(J)V", "Companion", "atomicfu"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtomicLong {
    private volatile long value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R8\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/atomicfu/AtomicLong$Companion;", "", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Lkotlinx/atomicfu/AtomicLong;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AtomicLongFieldUpdater.newUpdater(AtomicLong.class, "value");
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
