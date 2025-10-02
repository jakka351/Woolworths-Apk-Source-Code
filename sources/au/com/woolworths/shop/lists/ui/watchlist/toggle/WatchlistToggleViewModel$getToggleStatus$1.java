package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel", f = "WatchlistToggleViewModel.kt", l = {108}, m = "getToggleStatus$shop_lists_release")
/* loaded from: classes4.dex */
final class WatchlistToggleViewModel$getToggleStatus$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ WatchlistToggleViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistToggleViewModel$getToggleStatus$1(WatchlistToggleViewModel watchlistToggleViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = watchlistToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.q6(this);
    }
}
