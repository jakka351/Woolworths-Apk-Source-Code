package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {25}, m = "count")
/* loaded from: classes7.dex */
final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {
    public Ref.IntRef p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__CountKt$count$3<T> flowKt__CountKt$count$3;
        this.q = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            flowKt__CountKt$count$3 = this;
        } else {
            flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3<>(this);
        }
        Object obj2 = flowKt__CountKt$count$3.q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = flowKt__CountKt$count$3.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            flowKt__CountKt$count$3.p = new Ref.IntRef();
            flowKt__CountKt$count$3.r = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.IntRef intRef = flowKt__CountKt$count$3.p;
        ResultKt.b(obj2);
        return new Integer(intRef.d);
    }
}
