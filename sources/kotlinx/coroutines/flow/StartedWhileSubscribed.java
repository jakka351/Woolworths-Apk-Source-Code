package kotlinx.coroutines.flow;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class StartedWhileSubscribed implements SharingStarted {

    /* renamed from: a, reason: collision with root package name */
    public final long f24712a;

    public StartedWhileSubscribed(long j) {
        this.f24712a = j;
        if (j < 0) {
            throw new IllegalArgumentException(b.l(j, "replayExpiration(", " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow a(StateFlow stateFlow) {
        return FlowKt.r(new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new StartedWhileSubscribed$command$2(2, null), FlowKt.Q(stateFlow, new StartedWhileSubscribed$command$1(this, null))));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof StartedWhileSubscribed) && this.f24712a == ((StartedWhileSubscribed) obj).f24712a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24712a) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.f24712a;
        if (j < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j + "ms");
        }
        return b.r(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.M(CollectionsKt.q(listBuilder), null, null, null, null, 63), ')');
    }
}
