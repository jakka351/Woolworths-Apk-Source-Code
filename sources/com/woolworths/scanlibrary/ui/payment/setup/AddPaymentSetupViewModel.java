package com.woolworths.scanlibrary.ui.payment.setup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/setup/AddPaymentSetupViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentSetupViewModel extends BaseViewModel {
    public final AnalyticsManager h;
    public final SharedFlowImpl i;
    public final Flow j;

    public AddPaymentSetupViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.h = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }
}
