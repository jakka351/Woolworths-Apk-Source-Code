package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.contents.CatalogueContentsAction;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueBrowseViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final CatalogueBrowseInteractor e;
    public final AnalyticsManager f;
    public final CartUpdateInteractor g;
    public CatalogueBrowsePageTab h;
    public String i;
    public final BufferedChannel j;
    public final MutableStateFlow k;
    public final MutableStateFlow l;
    public final Flow m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseViewModel$Companion;", "", "", "CATEGORY_FILTER_OPTION_KEY", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CatalogueBrowsePageTab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CatalogueBrowsePageTab catalogueBrowsePageTab = CatalogueBrowsePageTab.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CatalogueBrowsePageErrorState.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CatalogueBrowsePageErrorState catalogueBrowsePageErrorState = CatalogueBrowsePageErrorState.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CatalogueBrowseViewModel(CatalogueBrowseInteractor catalogueBrowseInteractor, AnalyticsManager analyticsManager, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = catalogueBrowseInteractor;
        this.f = analyticsManager;
        this.g = cartUpdateInteractor;
        this.h = CatalogueBrowsePageTab.e;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.j = bufferedChannelA;
        this.k = StateFlowKt.a(new CatalogueBrowseContract.BrowseViewState(null, null, 7));
        this.l = StateFlowKt.a(new CatalogueBrowseContract.ContentsViewState(null, null, 7));
        this.m = FlowKt.I(bufferedChannelA);
    }

    public static final void p6(CatalogueBrowseViewModel catalogueBrowseViewModel, CatalogueBrowsePageErrorState catalogueBrowsePageErrorState) {
        AnalyticsManager analyticsManager = catalogueBrowseViewModel.f;
        catalogueBrowseViewModel.l.f(new CatalogueBrowseContract.ContentsViewState(null, catalogueBrowsePageErrorState, 3));
        int iOrdinal = catalogueBrowsePageErrorState.ordinal();
        if (iOrdinal == 0) {
            analyticsManager.c(CatalogueContentsAction.c);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(CatalogueContentsAction.d);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        r6(this.h);
    }

    public final void q6(CatalogueBrowsePageErrorState catalogueBrowsePageErrorState) {
        MutableStateFlow mutableStateFlow = this.k;
        mutableStateFlow.f(new CatalogueBrowseContract.BrowseViewState(((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).b, catalogueBrowsePageErrorState, 1));
        int iOrdinal = catalogueBrowsePageErrorState.ordinal();
        AnalyticsManager analyticsManager = this.f;
        if (iOrdinal == 0) {
            analyticsManager.c(CatalogueBrowseAction.c);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(CatalogueBrowseAction.d);
        }
    }

    public final void r6(CatalogueBrowsePageTab tab) {
        Intrinsics.h(tab, "tab");
        CatalogueBrowsePageTab catalogueBrowsePageTab = this.h;
        AnalyticsManager analyticsManager = this.f;
        if (tab != catalogueBrowsePageTab) {
            int iOrdinal = tab.ordinal();
            if (iOrdinal == 0) {
                analyticsManager.c(CatalogueBrowseAction.f6784a.c("Browse"));
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsManager.c(CatalogueContentsAction.f6800a.c("Contents"));
            }
        }
        this.h = tab;
        int iOrdinal2 = tab.ordinal();
        if (iOrdinal2 == 0) {
            MutableStateFlow mutableStateFlow = this.k;
            if (((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).b != null || ((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).f6793a) {
                return;
            }
            analyticsManager.a(CatalogueScreen.d);
            BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueBrowseViewModel$fetchBrowse$1(this, null), 3);
            return;
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow mutableStateFlow2 = this.l;
        if (((CatalogueBrowseContract.ContentsViewState) mutableStateFlow2.getValue()).b != null || ((CatalogueBrowseContract.ContentsViewState) mutableStateFlow2.getValue()).f6794a) {
            return;
        }
        mutableStateFlow2.f(new CatalogueBrowseContract.ContentsViewState(null, null, 6));
        analyticsManager.a(CatalogueScreen.g);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueBrowseViewModel$fetchContents$1(this, null), 3);
    }
}
