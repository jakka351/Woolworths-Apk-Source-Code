package kotlinx.coroutines.flow;

import au.com.woolworths.feature.product.list.compose.filter.e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class FlowKt__DelayKt {
    public static final Flow a(Flow flow, long j) {
        if (j >= 0) {
            return j == 0 ? flow : new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(new FlowKt__DelayKt$debounceInternal$1(new e(j, 10), flow, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final Flow b(SharedFlowImpl sharedFlowImpl, long j) {
        return a(sharedFlowImpl, DelayKt.d(j));
    }

    public static final FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 c(Flow flow, long j) {
        if (j > 0) {
            return new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(new FlowKt__DelayKt$sample$2(flow, j, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }
}
