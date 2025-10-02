package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {200}, m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes2.dex */
final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ NestedScrollDispatcher q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(0L, this);
    }
}
