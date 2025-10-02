package au.com.woolworths.feature.shop.foryou.settings;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsSettingsViewModel extends ViewModel {
    public final RewardsSettingsInteractor e;
    public final NetworkExceptions f;
    public final AnalyticsManager g;
    public final SharedFlowImpl h;
    public final SharedFlow i;
    public final MutableLiveData j;
    public ArrayList k;

    public RewardsSettingsViewModel(RewardsSettingsInteractor rewardsSettingsInteractor, NetworkExceptions networkExceptions, AnalyticsManager analyticsManager) {
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = rewardsSettingsInteractor;
        this.f = networkExceptions;
        this.g = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.f, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        this.j = new MutableLiveData();
    }
}
