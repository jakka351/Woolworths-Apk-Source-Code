package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceLandingPageName;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final AnalyticsManager e;
    public final MarketplaceInteractor f;
    public final MutableStateFlow g;
    public final StateFlow h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7496a;

        static {
            int[] iArr = new int[MarketplaceLandingPageName.values().length];
            try {
                iArr[MarketplaceLandingPageName.CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketplaceLandingPageName.BRANDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketplaceLandingPageName.SELLERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketplaceLandingPageName.PERSONALISED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketplaceLandingPageName.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketplaceLandingPageName.d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7496a = iArr;
        }
    }

    public MarketplaceViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        this.f = marketplaceInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new MarketplaceContract.ViewState(null, null, false, null));
        this.g = mutableStateFlowA;
        this.h = mutableStateFlowA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            kotlinx.coroutines.flow.MutableStateFlow r0 = r6.g
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r1 = r6.e
            boolean r2 = r8 instanceof au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$executeDataFetch$1
            if (r2 == 0) goto L17
            r2 = r8
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$executeDataFetch$1 r2 = (au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$executeDataFetch$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$executeDataFetch$1 r2 = new au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$executeDataFetch$1
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r2.r
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2c
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L42 au.com.woolworths.android.onesite.network.NoConnectivityException -> L4d
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L42 au.com.woolworths.android.onesite.network.NoConnectivityException -> L4d
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$fetchMarketplaceData$1$1 r7 = (au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$fetchMarketplaceData$1.AnonymousClass1) r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L42 au.com.woolworths.android.onesite.network.NoConnectivityException -> L4d
            java.lang.Object r6 = r7.invoke(r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L42 au.com.woolworths.android.onesite.network.NoConnectivityException -> L4d
            if (r6 != r8) goto L57
            return r8
        L42:
            au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions$ServerError r6 = au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions.ServerError.f
            r1.c(r6)
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState r6 = au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.e
            q6(r0, r4, r6)
            goto L57
        L4d:
            au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions$NetworkError r6 = au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions.NetworkError.f
            r1.c(r6)
            au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState r6 = au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState.d
            q6(r0, r4, r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel.p6(au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void q6(MutableStateFlow mutableStateFlow, boolean z, MarketplaceErrorState marketplaceErrorState) {
        mutableStateFlow.setValue(new MarketplaceContract.ViewState(((MarketplaceContract.ViewState) mutableStateFlow.getValue()).f7493a, ((MarketplaceContract.ViewState) mutableStateFlow.getValue()).b, z, marketplaceErrorState));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        q6(this.g, true, null);
        BuildersKt.c(ViewModelKt.a(this), null, null, new MarketplaceViewModel$fetchMarketplaceData$1(this, null), 3);
    }
}
