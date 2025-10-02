package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.cart.SngShoppingSession;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.scanner.ScannerContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerViewModel;", "Landroidx/lifecycle/ViewModel;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScannerViewModel extends ViewModel {
    public final SngShoppingSession e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final SharedFlow j;

    public ScannerViewModel(UserManager userManager, UserConfigurations userConfigurations, SngShoppingSession sngShoppingSession, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(sngShoppingSession, "sngShoppingSession");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = sngShoppingSession;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ScannerContract.ViewState.c);
        this.h = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        Cart f21156a = sngShoppingSession.getF21156a();
        int iZ = f21156a != null ? f21156a.z(false) : 0;
        Integer numA = sngShoppingSession.a();
        mutableStateFlowA.f(new ScannerContract.ViewState(iZ, numA != null ? numA.intValue() : 0));
    }
}
