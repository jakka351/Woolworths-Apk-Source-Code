package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {48}, m = "map")
/* loaded from: classes2.dex */
final class PageEvent$StaticList$map$1<R> extends ContinuationImpl {
    public PageEvent.StaticList p;
    public Function2 q;
    public Collection r;
    public Iterator s;
    public Collection t;
    public /* synthetic */ Object u;
    public final /* synthetic */ PageEvent.StaticList v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$map$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
