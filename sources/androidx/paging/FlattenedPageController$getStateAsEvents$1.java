package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "getStateAsEvents")
/* loaded from: classes2.dex */
final class FlattenedPageController$getStateAsEvents$1 extends ContinuationImpl {
    public Object p;
    public MutexImpl q;
    public /* synthetic */ Object r;
    public final /* synthetic */ FlattenedPageController s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$getStateAsEvents$1(FlattenedPageController flattenedPageController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = flattenedPageController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
