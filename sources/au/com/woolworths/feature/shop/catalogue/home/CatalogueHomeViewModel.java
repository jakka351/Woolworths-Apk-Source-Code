package au.com.woolworths.feature.shop.catalogue.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueCard;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeErrorActionHandler;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueHomeViewModel extends ViewModel implements FullPageErrorStateClickHandler, CatalogueHomeErrorActionHandler {
    public final CatalogueHomeInteractor e;
    public final CatalogueStoreInteractor f;
    public final CartUpdateInteractor g;
    public final AnalyticsManager h;
    public final BufferedChannel i;
    public final Flow j;
    public final MutableStateFlow k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CatalogueHomePageErrorState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CatalogueHomePageErrorState catalogueHomePageErrorState = CatalogueHomePageErrorState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CatalogueHomePageErrorState catalogueHomePageErrorState2 = CatalogueHomePageErrorState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CatalogueHomeViewModel(CatalogueHomeInteractor catalogueHomeInteractor, CatalogueStoreInteractor catalogueStoreInteractor, CartUpdateInteractor cartUpdateInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = catalogueHomeInteractor;
        this.f = catalogueStoreInteractor;
        this.g = cartUpdateInteractor;
        this.h = analyticsManager;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.i = bufferedChannelA;
        this.j = FlowKt.I(bufferedChannelA);
        this.k = StateFlowKt.a(new CatalogueHomeContract.ViewState(null, null, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r0 = r7.h
            kotlinx.coroutines.flow.MutableStateFlow r1 = r7.k
            boolean r2 = r8 instanceof au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$load$1
            if (r2 == 0) goto L17
            r2 = r8
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$load$1 r2 = (au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$load$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$load$1 r2 = new au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$load$1
            r2.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2c
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            goto L50
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract$ViewState r8 = new au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract$ViewState
            r4 = 6
            r8.<init>(r5, r5, r4)
            r1.f(r8)
            au.com.woolworths.feature.shop.catalogue.CatalogueScreen r8 = au.com.woolworths.feature.shop.catalogue.CatalogueScreen.f
            r0.a(r8)
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeInteractor r8 = r7.e     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r2.r = r6     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            java.lang.Object r8 = r8.a(r2)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            if (r8 != r3) goto L50
            return r3
        L50:
            au.com.woolworths.feature.shop.catalogue.home.model.CatalogueHome r8 = (au.com.woolworths.feature.shop.catalogue.home.model.CatalogueHome) r8     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            java.util.ArrayList r2 = r8.f6856a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            boolean r2 = r2.isEmpty()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            if (r2 == 0) goto L60
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState r8 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.f     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r7.r6(r8)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            goto L9a
        L60:
            java.util.ArrayList r2 = r8.f6856a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r3.<init>()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            java.util.Iterator r2 = r2.iterator()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
        L6b:
            boolean r4 = r2.hasNext()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r2.next()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            boolean r6 = r4 instanceof au.com.woolworths.feature.shop.catalogue.home.model.CatalogueCard     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            if (r6 == 0) goto L6b
            r3.add(r4)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            goto L6b
        L7d:
            r7.s6(r3)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract$ViewState r2 = new au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract$ViewState     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r3 = 5
            r2.<init>(r8, r5, r3)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r1.f(r2)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction r8 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeAction.e     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            r0.c(r8)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L8f au.com.woolworths.android.onesite.network.ServerErrorException -> L95
            goto L9a
        L8f:
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState r8 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.d
            r7.r6(r8)
            goto L9a
        L95:
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState r8 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomePageErrorState.e
            r7.r6(r8)
        L9a:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel.p6(au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void g3() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueHomeViewModel$onTryAgainClicked$1(this, null), 3);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        CatalogueHomePageErrorState catalogueHomePageErrorState = ((CatalogueHomeContract.ViewState) this.k.getValue()).c;
        if (catalogueHomePageErrorState != null) {
            catalogueHomePageErrorState.a(this);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CatalogueHomePageErrorState catalogueHomePageErrorState = ((CatalogueHomeContract.ViewState) this.k.getValue()).c;
        if (catalogueHomePageErrorState != null) {
            catalogueHomePageErrorState.b(this);
        }
    }

    public final void q6() {
        this.h.c(CatalogueHomeAction.g);
        this.i.k(CatalogueHomeContract.Action.LaunchSubsequentStoreSelection.f6841a);
    }

    public final void r6(CatalogueHomePageErrorState catalogueHomePageErrorState) {
        this.k.f(new CatalogueHomeContract.ViewState(null, catalogueHomePageErrorState, 3));
        int iOrdinal = catalogueHomePageErrorState.ordinal();
        AnalyticsManager analyticsManager = this.h;
        if (iOrdinal == 0) {
            analyticsManager.c(CatalogueHomeAction.b);
        } else if (iOrdinal == 1) {
            analyticsManager.c(CatalogueHomeAction.c);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(CatalogueHomeAction.d);
        }
    }

    public final void s6(ArrayList arrayList) {
        AnalyticsAction analyticsAction = CatalogueHomeAction.e;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, Integer.valueOf(arrayList.size()));
        trackingMetadataA.b(TrackableValue.H, ((CatalogueCard) CollectionsKt.D(arrayList)).f.k);
        this.h.j(analyticsAction, trackingMetadataA);
    }

    public final void t6(Activities.CatalogueHome.Extras extras) {
        String str;
        AnalyticsManager analyticsManager = this.h;
        if (extras == null || (str = extras.d) == null) {
            analyticsManager.a(CatalogueScreen.f);
            return;
        }
        CatalogueScreen catalogueScreen = CatalogueScreen.f;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.h0, str);
        trackingMetadataA.b(TrackableValue.g0, Boolean.TRUE);
        analyticsManager.e(catalogueScreen, trackingMetadataA);
    }
}
