package au.com.woolworths.shop.lists.ui.pastshops;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.shop.lists.data.PastShopInteractor;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsContract;
import au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions;
import au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PastShopsViewModel extends ViewModel implements PastShopsClickListener, FullPageErrorStateClickHandler {
    public final PastShopInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final MediatorLiveData h;
    public final MediatorLiveData i;
    public final Flow j;
    public final Flow k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsViewModel$Companion;", "", "", "PRODUCT_PAGING_LOAD_SIZE", "I", "PRODUCT_PAGING_PRELOAD_SIZE", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12368a;

        static {
            int[] iArr = new int[PastShopsFullPageError.values().length];
            try {
                PastShopsFullPageError pastShopsFullPageError = PastShopsFullPageError.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PastShopsFullPageError pastShopsFullPageError2 = PastShopsFullPageError.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12368a = iArr;
        }
    }

    public PastShopsViewModel(PastShopInteractor pastShopInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(pastShopInteractor, "pastShopInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = pastShopInteractor;
        this.f = analyticsManager;
        PagingConfig pagingConfig = new PagingConfig(20, 10, 20, 48, false);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.h = mediatorLiveData;
        this.i = mediatorLiveData;
        this.j = FlowKt.a(sharedFlowImplB);
        this.k = CachedPagingDataKt.a(new Pager(pagingConfig, new Function0() { // from class: au.com.woolworths.shop.lists.ui.pastshops.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new PageKeyedPagingSource(null, new PastShopsViewModel$listResult$1$1(this.d, null));
            }
        }).f3571a, ViewModelKt.a(this));
    }

    public static void p6(PastShopsViewModel pastShopsViewModel, MediatorLiveData mediatorLiveData, boolean z, int i, PastShopsFullPageError pastShopsFullPageError, int i2) {
        if ((i2 & 1) != 0) {
            PastShopsContract.ViewState viewState = (PastShopsContract.ViewState) mediatorLiveData.e();
            z = viewState != null ? viewState.f12367a : false;
        }
        if ((i2 & 2) != 0) {
            PastShopsContract.ViewState viewState2 = (PastShopsContract.ViewState) mediatorLiveData.e();
            i = viewState2 != null ? viewState2.b : 0;
        }
        if ((i2 & 4) != 0) {
            PastShopsContract.ViewState viewState3 = (PastShopsContract.ViewState) mediatorLiveData.e();
            pastShopsFullPageError = viewState3 != null ? viewState3.c : null;
        }
        mediatorLiveData.m(new PastShopsContract.ViewState(z, i, pastShopsFullPageError));
    }

    @Override // au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener
    public final void a4(PurchaseHistoryEvent item) {
        Intrinsics.h(item, "item");
        this.g.f(new PastShopsContract.Actions.PastShopClicked(item));
    }

    @Override // au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener
    public final void g3() {
        this.g.f(PastShopsContract.Actions.Retry.f12366a);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        PastShopsContract.ViewState viewState = (PastShopsContract.ViewState) this.h.e();
        PastShopsFullPageError pastShopsFullPageError = viewState != null ? viewState.c : null;
        int i = pastShopsFullPageError == null ? -1 : WhenMappings.f12368a[pastShopsFullPageError.ordinal()];
        PastShopsContract.Actions.Retry retry = PastShopsContract.Actions.Retry.f12366a;
        SharedFlowImpl sharedFlowImpl = this.g;
        AnalyticsManager analyticsManager = this.f;
        if (i == 1) {
            analyticsManager.c(PastShopsActions.g);
            sharedFlowImpl.f(retry);
        } else {
            if (i != 2) {
                return;
            }
            analyticsManager.c(PastShopsActions.h);
            sharedFlowImpl.f(retry);
        }
    }
}
