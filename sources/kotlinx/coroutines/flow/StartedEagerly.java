package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/StartedEagerly;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow a(StateFlow stateFlow) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(SharingCommand.d);
    }

    public final String toString() {
        return "SharingStarted.Eagerly";
    }
}
