package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes7.dex */
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public int r;

    public FlowKt__LimitKt$emitAbort$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        FlowKt__LimitKt.a(null, null, null, this);
        return CoroutineSingletons.d;
    }
}
