package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.k;
            Intrinsics.e(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((q() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.k;
            Intrinsics.e(objArr);
            f(Integer.valueOf(((Number) objArr[((int) ((this.l + ((int) ((q() + this.n) - this.l))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
