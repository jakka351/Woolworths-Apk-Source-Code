package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "record")
/* loaded from: classes2.dex */
final class FlattenedPageController$record$1 extends ContinuationImpl {
    public Object p;
    public IndexedValue q;
    public MutexImpl r;
    public /* synthetic */ Object s;
    public final /* synthetic */ FlattenedPageController t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$record$1(FlattenedPageController flattenedPageController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = flattenedPageController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, this);
    }
}
