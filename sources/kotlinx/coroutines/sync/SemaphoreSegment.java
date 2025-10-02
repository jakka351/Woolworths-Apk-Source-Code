package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Segment;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    public final /* synthetic */ AtomicReferenceArray h;

    public SemaphoreSegment(long j, SemaphoreSegment semaphoreSegment, int i) {
        super(j, semaphoreSegment, i);
        this.h = new AtomicReferenceArray(SemaphoreKt.f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int g() {
        return SemaphoreKt.f;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void h(int i, CoroutineContext coroutineContext) {
        this.h.set(i, SemaphoreKt.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f + ", hashCode=" + hashCode() + ']';
    }
}
