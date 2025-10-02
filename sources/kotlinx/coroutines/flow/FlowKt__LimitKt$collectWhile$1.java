package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {134}, m = "collectWhile")
/* loaded from: classes7.dex */
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public FlowKt__LimitKt$collectWhile$collector$1 p;
    public /* synthetic */ Object q;
    public int r;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        int i = (this.r | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.r = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        try {
        } catch (AbortFlowException e) {
            if (e.d != i) {
                throw e;
            }
            JobKt.e(getE());
        }
        if (i == 0) {
            ResultKt.b(obj);
            this.p = new FlowKt__LimitKt$collectWhile$collector$1();
            this.r = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = this.p;
        ResultKt.b(obj);
        return Unit.f24250a;
    }
}
