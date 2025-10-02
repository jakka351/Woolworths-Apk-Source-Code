package au.com.woolworths.dynamic.page.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.dynamicpage.DynamicPageAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.dynamic.page.data.BottomSheetType;
import au.com.woolworths.dynamic.page.data.DynamicPageErrorState;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.interactor.DynamicPageInteractorImpl;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "Companion", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DynamicPageViewModel extends ViewModel {
    public static final List n = CollectionsKt.R("openbottomsheet", "login");
    public final String e;
    public final DynamicPageInteractorImpl f;
    public final TrolleyInteractor g;
    public final AnalyticsManager h;
    public final SupportedLinksHelper i;
    public final MutableStateFlow j;
    public final SharedFlowImpl k;
    public final SharedFlow l;
    public final StateFlow m;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageViewModel$Companion;", "", "", "BottomSheetKeyword", "Ljava/lang/String;", "BottomsheetPrefix", "LoginKeyword", "", "SUPPORTED_ACTIONS", "Ljava/util/List;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageViewModel$Factory;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        DynamicPageViewModel a(String str);
    }

    public DynamicPageViewModel(String str, DynamicPageInteractorImpl dynamicPageInteractorImpl, TrolleyInteractor trolleyInteractor, AnalyticsManager analyticsManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = str;
        this.f = dynamicPageInteractorImpl;
        this.g = trolleyInteractor;
        this.h = analyticsManager;
        this.i = supportedLinksHelper;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new DynamicPageContract.ViewState(null, 0 == true ? 1 : 0, 31));
        this.j = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.k = sharedFlowImplB;
        this.l = FlowKt.a(sharedFlowImplB);
        this.m = FlowKt.b(mutableStateFlowA);
    }

    public static void r6(DynamicPageViewModel dynamicPageViewModel, MutableStateFlow mutableStateFlow, boolean z, Integer num, DynamicPageFeedData dynamicPageFeedData, DynamicPageErrorState dynamicPageErrorState, BottomSheetType bottomSheetType, int i) {
        if ((i & 1) != 0) {
            z = ((DynamicPageContract.ViewState) mutableStateFlow.getValue()).f5195a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            num = ((DynamicPageContract.ViewState) mutableStateFlow.getValue()).b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            dynamicPageFeedData = ((DynamicPageContract.ViewState) mutableStateFlow.getValue()).c;
        }
        DynamicPageFeedData dynamicPageFeedData2 = dynamicPageFeedData;
        DynamicPageErrorState dynamicPageErrorState2 = (i & 8) != 0 ? null : dynamicPageErrorState;
        BottomSheetType bottomSheetType2 = (i & 16) != 0 ? null : bottomSheetType;
        dynamicPageViewModel.getClass();
        mutableStateFlow.setValue(new DynamicPageContract.ViewState(z2, num2, dynamicPageFeedData2, dynamicPageErrorState2, bottomSheetType2));
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new DynamicPageViewModel$fetchPageFeed$1(this, null), 3);
    }

    public final DynamicPageAnalytics.DynamicPage q6() {
        return new DynamicPageAnalytics.DynamicPage(((DynamicPageContract.ViewState) this.j.getValue()).a());
    }
}
