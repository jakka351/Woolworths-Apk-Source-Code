package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, 207}, m = "onNext")
/* loaded from: classes2.dex */
final class UnbatchedFlowCombiner$onNext$1 extends ContinuationImpl {
    public UnbatchedFlowCombiner p;
    public Object q;
    public MutexImpl r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ UnbatchedFlowCombiner u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbatchedFlowCombiner$onNext$1(UnbatchedFlowCombiner unbatchedFlowCombiner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = unbatchedFlowCombiner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(0, null, this);
    }
}
