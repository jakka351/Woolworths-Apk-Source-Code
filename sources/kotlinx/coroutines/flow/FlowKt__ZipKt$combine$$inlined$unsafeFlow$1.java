package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow d;
    public final /* synthetic */ Flow e;
    public final /* synthetic */ SuspendLambda f;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Flow flow, Flow flow2, Function3 function3) {
        this.d = flow;
        this.e = flow2;
        this.f = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objA = CombineKt.a(continuation, FlowKt__ZipKt$nullArrayFactory$1.d, new FlowKt__ZipKt$combine$1$1(this.f, null), flowCollector, new Flow[]{this.d, this.e});
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
