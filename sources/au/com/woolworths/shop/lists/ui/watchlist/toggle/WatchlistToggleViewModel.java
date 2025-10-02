package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesDataKt;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchlistToggleViewModel extends ViewModel {
    public final ShoppingListInteractor e;
    public final PreferencesDetailsInteractor f;
    public final WatchlistInteractor g;
    public final ListsUtils h;
    public final AnalyticsManager i;
    public final FeatureToggleManager j;
    public final MutableStateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlowImpl m;
    public PreferencesData n;
    public final CompletableDeferred o;
    public final StateFlow p;
    public final SharedFlowImpl q;
    public final Flow r;

    public WatchlistToggleViewModel(ShoppingListInteractor shoppingListInteractor, PreferencesDetailsInteractor preferencesDetailsInteractor, WatchlistInteractor watchlistInteractor, ListsUtils listsUtils, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(preferencesDetailsInteractor, "preferencesDetailsInteractor");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = shoppingListInteractor;
        this.f = preferencesDetailsInteractor;
        this.g = watchlistInteractor;
        this.h = listsUtils;
        this.i = analyticsManager;
        this.j = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new WatchlistToggleViewContract.ViewState(false, 7));
        this.k = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.l = sharedFlowImplB;
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB2;
        this.n = PreferencesDataKt.f7944a;
        this.o = CompletableDeferredKt.a();
        this.p = mutableStateFlowA;
        this.q = sharedFlowImplB;
        this.r = FlowKt.a(sharedFlowImplB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel r4, boolean r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$updateWatchlistToggle$1
            if (r0 == 0) goto L16
            r0 = r6
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$updateWatchlistToggle$1 r0 = (au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$updateWatchlistToggle$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$updateWatchlistToggle$1 r0 = new au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$updateWatchlistToggle$1
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r5 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor r6 = r4.f     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            java.lang.String r2 = "specialOffersInListOptIn"
            r0.p = r5     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            r0.s = r3     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            java.lang.Object r6 = r6.d(r5, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            if (r6 != r1) goto L46
            return r1
        L46:
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r6 = (au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData) r6     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r4 = r4.i     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            if (r5 == 0) goto L4f
            au.com.woolworths.analytics.supers.lists.WatchlistAnalytics$List$Action r5 = au.com.woolworths.analytics.supers.lists.WatchlistAnalytics.List.Action.e     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            goto L51
        L4f:
            au.com.woolworths.analytics.supers.lists.WatchlistAnalytics$List$Action r5 = au.com.woolworths.analytics.supers.lists.WatchlistAnalytics.List.Action.f     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
        L51:
            r4.g(r5)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L55 au.com.woolworths.android.onesite.network.ServerErrorException -> L5c
            return r6
        L55:
            r4 = move-exception
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            r5.p(r4)
            goto L62
        L5c:
            r4 = move-exception
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            r5.p(r4)
        L62:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel.p6(au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void r6(WatchlistToggleViewModel watchlistToggleViewModel, MutableStateFlow mutableStateFlow, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = ((WatchlistToggleViewContract.ViewState) mutableStateFlow.getValue()).f12494a;
        }
        if ((i & 2) != 0) {
            z = ((WatchlistToggleViewContract.ViewState) mutableStateFlow.getValue()).b;
        }
        if ((i & 4) != 0) {
            z2 = ((WatchlistToggleViewContract.ViewState) mutableStateFlow.getValue()).c;
        }
        watchlistToggleViewModel.getClass();
        ((WatchlistToggleViewContract.ViewState) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.f(new WatchlistToggleViewContract.ViewState(str, z, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q6(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$getToggleStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$getToggleStatus$1 r0 = (au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$getToggleStatus$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$getToggleStatus$1 r0 = new au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$getToggleStatus$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            kotlinx.coroutines.CompletableDeferred r5 = r4.o
            java.lang.Object r5 = r5.await(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r5 = r4.n
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor r0 = r4.f
            r0.getClass()
            java.lang.String r0 = "specialOffersInListOptIn"
            boolean r5 = au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor.c(r5, r0)
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r0 = r4.n
            au.com.woolworths.shop.lists.ui.utils.ListsUtils r1 = r4.h
            r1.getClass()
            java.lang.String r2 = "preferencesData"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor r2 = r1.d
            r2.getClass()
            java.lang.String r2 = "pushOptIn"
            boolean r0 = au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor.c(r0, r2)
            if (r0 == 0) goto L74
            if (r5 == 0) goto L74
            au.com.woolworths.android.onesite.utils.NotificationManager r5 = r1.e
            java.lang.String r0 = "swrve_notification_channel"
            java.util.List r0 = kotlin.collections.CollectionsKt.Q(r0)
            boolean r5 = r5.b(r0)
            if (r5 == 0) goto L74
            goto L75
        L74:
            r3 = 0
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel.q6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
