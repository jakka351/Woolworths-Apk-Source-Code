package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {128}, m = "map")
/* loaded from: classes2.dex */
final class PageEvent$Insert$map$1<R> extends ContinuationImpl {
    public /* synthetic */ Object A;
    public final /* synthetic */ PageEvent.Insert B;
    public int C;
    public Function2 p;
    public PageEvent.Insert q;
    public LoadType r;
    public Collection s;
    public Iterator t;
    public TransformablePage u;
    public int[] v;
    public Collection w;
    public Iterator x;
    public Collection y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$map$1(PageEvent.Insert insert, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.B = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
