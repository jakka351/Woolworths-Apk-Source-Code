package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "all")
/* loaded from: classes7.dex */
final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    public Ref.BooleanRef p;
    public FlowKt__LogicKt$all$$inlined$collectWhile$1 q;
    public /* synthetic */ Object r;
    public int s;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LogicKt$all$1<T> flowKt__LogicKt$all$1;
        this.r = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.s = i - Integer.MIN_VALUE;
            flowKt__LogicKt$all$1 = this;
        } else {
            flowKt__LogicKt$all$1 = new FlowKt__LogicKt$all$1<>(this);
        }
        Object obj2 = flowKt__LogicKt$all$1.r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = flowKt__LogicKt$all$1.s;
        try {
        } catch (AbortFlowException e) {
            if (e.d != i2) {
                throw e;
            }
            JobKt.e(flowKt__LogicKt$all$1.getE());
        }
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$1 = flowKt__LogicKt$all$1.q;
            Ref.BooleanRef booleanRef = flowKt__LogicKt$all$1.p;
            ResultKt.b(obj2);
            return Boolean.valueOf(!booleanRef.d);
        }
        ResultKt.b(obj2);
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$12 = new FlowKt__LogicKt$all$$inlined$collectWhile$1(booleanRef2);
        flowKt__LogicKt$all$1.p = booleanRef2;
        flowKt__LogicKt$all$1.q = flowKt__LogicKt$all$$inlined$collectWhile$12;
        flowKt__LogicKt$all$1.s = 1;
        throw null;
    }
}
