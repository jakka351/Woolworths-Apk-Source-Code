package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class WatchlistToggleView$setContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m(((Boolean) obj).booleanValue());
        return Unit.f24250a;
    }

    public final void m(boolean z) {
        WatchlistToggleViewModel watchlistToggleViewModel = (WatchlistToggleViewModel) this.receiver;
        ListsUtils listsUtils = watchlistToggleViewModel.h;
        if (listsUtils.e.b(CollectionsKt.Q("swrve_notification_channel"))) {
            PreferencesData preferencesData = watchlistToggleViewModel.n;
            Intrinsics.h(preferencesData, "preferencesData");
            listsUtils.d.getClass();
            if (PreferencesDetailsInteractor.c(preferencesData, "pushOptIn")) {
                BuildersKt.c(ViewModelKt.a(watchlistToggleViewModel), null, null, new WatchlistToggleViewModel$onToggleClick$1(watchlistToggleViewModel, z, null), 3);
                return;
            }
        }
        watchlistToggleViewModel.m.f(WatchlistToggleViewContract.Actions.ShowBottomSheet.f12493a);
    }
}
