package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel", f = "WatchlistToggleViewModel.kt", l = {151}, m = "updateWatchlistToggle")
/* loaded from: classes4.dex */
final class WatchlistToggleViewModel$updateWatchlistToggle$1 extends ContinuationImpl {
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WatchlistToggleViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistToggleViewModel$updateWatchlistToggle$1(WatchlistToggleViewModel watchlistToggleViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = watchlistToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return WatchlistToggleViewModel.p6(this.r, false, this);
    }
}
