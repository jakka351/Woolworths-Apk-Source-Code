package androidx.work;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", l = {36}, m = "await")
/* loaded from: classes2.dex */
final class OperationKt$await$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        int i = (this.q | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.q = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Intrinsics.g(obj, "result.await()");
        return obj;
    }
}
