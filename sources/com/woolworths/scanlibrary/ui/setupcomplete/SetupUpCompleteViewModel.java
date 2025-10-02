package com.woolworths.scanlibrary.ui.setupcomplete;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/setupcomplete/SetupUpCompleteViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetupUpCompleteViewModel extends BaseViewModel {
    public final FeatureToggleManager h;
    public final UserConfigurations i;
    public final DeviceInfoProvider j;
    public final AnalyticsManager k;
    public final SharedFlowImpl l;
    public final Flow m;

    public SetupUpCompleteViewModel(FeatureToggleManager featureToggleManager, UserConfigurations userConfigurations, DeviceInfoProvider deviceInfoProvider, AnalyticsManager analyticsManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.h = featureToggleManager;
        this.i = userConfigurations;
        this.j = deviceInfoProvider;
        this.k = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
    }
}
