package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {729}, m = "processResultAndInvokeBlockRecoveringException")
/* loaded from: classes7.dex */
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SelectImplementation q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(SelectImplementation selectImplementation, Continuation continuation) {
        super(continuation);
        this.q = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        this.p = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectImplementation.i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = this;
        } else {
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new SelectImplementation$processResultAndInvokeBlockRecoveringException$1(this.q, this);
        }
        Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        return obj2;
    }
}
