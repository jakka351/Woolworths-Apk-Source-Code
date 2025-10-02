package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {125}, m = "takeNextOrNull")
/* loaded from: classes7.dex */
final class ReactiveSubscriber$takeNextOrNull$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ReactiveSubscriber q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactiveSubscriber$takeNextOrNull$1(ReactiveSubscriber reactiveSubscriber, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = reactiveSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
