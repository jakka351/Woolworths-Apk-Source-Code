package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxObservableCoroutine", f = "RxObservable.kt", l = {113}, m = "send")
/* loaded from: classes7.dex */
final class RxObservableCoroutine$send$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ RxObservableCoroutine s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$send$1(RxObservableCoroutine rxObservableCoroutine, Continuation continuation) {
        super(continuation);
        this.s = rxObservableCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.z(null, this);
    }
}
