package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
/* loaded from: classes2.dex */
final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    public int A;
    public PagingDataPresenter p;
    public List q;
    public LoadStates r;
    public LoadStates s;
    public HintReceiver t;
    public PageStore u;
    public int v;
    public int w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ PagingDataPresenter z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$presentNewList$1(PagingDataPresenter pagingDataPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.z = pagingDataPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return PagingDataPresenter.a(this.z, null, 0, 0, false, null, null, null, this);
    }
}
