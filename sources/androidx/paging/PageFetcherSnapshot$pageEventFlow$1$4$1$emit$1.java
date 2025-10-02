package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {646, 658, 125, 669, 128, 680, 692, 125, 703, 128, 714, 726, 125, 737, 128, 748}, m = "emit")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public PageFetcherSnapshot w;
    public /* synthetic */ Object x;
    public final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.y = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.emit(null, this);
    }
}
