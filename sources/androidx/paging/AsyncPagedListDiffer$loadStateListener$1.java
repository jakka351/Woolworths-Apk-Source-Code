package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements Function2<LoadType, LoadState, Unit> {
    public AsyncPagedListDiffer$loadStateListener$1(AsyncPagedListDiffer$loadStateManager$1 asyncPagedListDiffer$loadStateManager$1) {
        super(2, asyncPagedListDiffer$loadStateManager$1, PagedList.LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LoadType p0 = (LoadType) obj;
        LoadState p1 = (LoadState) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((PagedList.LoadStateManager) this.receiver).b(p0, p1);
        return Unit.f24250a;
    }
}
