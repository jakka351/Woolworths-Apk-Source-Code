package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/ReadonlyStateFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final /* synthetic */ StateFlow d;
    public final Job e;

    public ReadonlyStateFlow(MutableStateFlow mutableStateFlow, Job job) {
        this.d = mutableStateFlow;
        this.e = job;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List a() {
        return this.d.a();
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.e) ? SharedFlowKt.d(this, coroutineContext, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.d.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.d.getValue();
    }
}
