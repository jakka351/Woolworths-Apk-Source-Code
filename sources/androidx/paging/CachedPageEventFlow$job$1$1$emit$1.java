package androidx.paging;

import androidx.paging.CachedPageEventFlow$job$1;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {77, 78}, m = "emit")
/* loaded from: classes2.dex */
final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    public Object p;
    public IndexedValue q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CachedPageEventFlow$job$1.AnonymousClass1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.s = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.emit(null, this);
    }
}
